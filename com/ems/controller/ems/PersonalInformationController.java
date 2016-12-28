package com.ems.controller.ems;

import com.ems.IService.ems.IPersonalInformationService;
import com.ems.dto.CurrentUser;
import com.ems.dto.ems.PersonalInformationDTO;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Apurbo on 11/18/2016.
 */
@RequestMapping(value = "/personalInformation")
public class PersonalInformationController {
private IPersonalInformationService personalInformationService;

    public void setPersonalInformationService(IPersonalInformationService personalInformationService) {
        this.personalInformationService = personalInformationService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model, CurrentUser currentUser, PersonalInformationDTO personalInformationDTO, HttpServletRequest request) {
       // personalInformationService.insertPersonalInformation(personalInformationDTO);
        request.getUserPrincipal();
        request.getRemoteUser();
        List<PersonalInformationDTO> personalInformationDTOList = personalInformationService.personalInformationDetails();
        model.addAttribute("personalInfoList",personalInformationDTOList);
        model.addAttribute("userId",currentUser.getUser());
        return "ems/personalInformation";
    }

    @RequestMapping(value = "/savePersonalInfo",method = RequestMethod.POST)
    @ResponseBody
    public String save(Model model,PersonalInformationDTO personalInformationDTO){
        personalInformationService.insertPersonalInformation(personalInformationDTO);
        List<PersonalInformationDTO> personalInformationDTOList = personalInformationService.personalInformationDetails();
        model.addAttribute("personalInfoList",personalInformationDTOList);
        return "ems/personalInformation";
    }

    @RequestMapping(value = "/personalInformationList")
    public String listOfPersonalLnfo(Model model){
        List<PersonalInformationDTO> personalInformationDTOList = personalInformationService.personalInformationDetails();
        model.addAttribute("personalInfoList",personalInformationDTOList);
        return "ems/personalInformation";
    }
}
