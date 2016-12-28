package com.security;

import com.ems.Enum.LoginErrorCode;
import com.ems.Enum.Permission;
import com.ems.IService.ILoginSerivice;
import com.ems.dto.AccessPermissionDTO;
import com.ems.dto.LoginDTO;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Apurbo on 12/7/2016.
 */
public class WebAuthenticationProvider implements AuthenticationProvider {

    private WebAuthenticationDetialsSource authenticationDetialsSource;
    private PasswordEncoder passwordEncoder;
    private ILoginSerivice loginSerivice;

    public void setAuthenticationDetialsSource(WebAuthenticationDetialsSource authenticationDetialsSource) {
        this.authenticationDetialsSource = authenticationDetialsSource;
    }

    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public void setLoginSerivice(ILoginSerivice loginSerivice) {
        this.loginSerivice = loginSerivice;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
        String username = String.valueOf(auth.getPrincipal());
        username = username.trim().toUpperCase();
        String password = String.valueOf(auth.getCredentials());
        String branchCode = authenticationDetialsSource.getBranchCode();

        LoginDTO userLogin = loginSerivice.login(username, branchCode);
        if (userLogin == null) {
            throw new UsernameNotFoundException(LoginErrorCode.FAILED.getCode());
        } else if (!userLogin.getEnabled()) {
            throw new LockedException(LoginErrorCode.LOCKED.getCode());
        } else if (passwordEncoder.matches(username + password, userLogin.getPassword())) {
            boolean changePasswordYN = loginSerivice.isFirstTimeLogin(username) || loginSerivice.isPasswordExpired(username, branchCode);
            userLogin.setChangePasswordYN(changePasswordYN);
            Set<GrantedAuthority> authorities = getAcessRight(userLogin);
            return new UsernamePasswordAuthenticationToken(userLogin, password, authorities);
        } else {
            throw new BadCredentialsException(LoginErrorCode.FAILED.getCode());
        }
    }


    @Override
    public boolean supports(Class<?> aClazz) {
        return false;
    }

    private Set<GrantedAuthority> getAcessRight(LoginDTO userLogin) {
        final Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        if (!userLogin.isChangePasswordYN()) {
            Date systemOpenDate = loginSerivice.getSystemOpenDate(userLogin.getBranchCode());
            List<AccessPermissionDTO> permissions = loginSerivice.getUseGroupWiseAccessPermissionList(userLogin.getGroupId());
            permissions.addAll(loginSerivice.getUserWiseAdditionalPermissionList(userLogin.getUserName(), systemOpenDate));

            permissions.forEach(permission ->{
                String access = permission.getScreenId()+"-";
                if (permission.isViewAccessAllowed()){
                    authorities.add(new SimpleGrantedAuthority(access+ Permission.VIEW));
                }
                if (permission.isAddAccessAllowed()){
                    authorities.add(new SimpleGrantedAuthority(access+Permission.ADD));
                }
                if (permission.isEditAccessAllowed()){
                    authorities.add(new SimpleGrantedAuthority(access+Permission.EDIT));
                }
                if (permission.isDeleteAccessAllowed()){
                    authorities.add(new SimpleGrantedAuthority(access+Permission.DELETE));
                }
            });
        }
        return authorities;
    }
}
