package com.ems.Service;

import com.ems.Entity.HomeEntity;
import com.ems.IDao.IHomeDao;
import com.ems.IService.IHomeService;
import com.ems.dto.HomeDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Apurbo on 8/20/2016.
 */
public class HomeService implements IHomeService {
    private IHomeDao homeDao;

    public void setHomeDao(IHomeDao homeDao) {
        this.homeDao = homeDao;
    }

    public HomeDto getHomeDto(HomeDto homeDto) {

        return homeDto;
    }

    public Model getModel(HomeDto homeDto, Model model) {
        model = homeDao.getModel(homeDto, model);
        return model;
    }
@Transactional
    public void insetIntoTable(HomeDto dto) throws SQLException, ClassNotFoundException {
        HomeEntity homeEntity = new HomeEntity();
        homeEntity.setId(dto.getId());
        homeEntity.setFirstName(dto.getFirstName());
        homeEntity.setLastName(dto.getLastName());
        homeEntity.setAge(dto.getAge());
       homeDao.insetIntoTable(homeEntity);
    }

    public List<HomeDto> getListFromTable() throws SQLException {
        List<HomeDto> homeDto = homeDao.getListFormTable();
        return homeDto;
    }

}
