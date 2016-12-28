package com.ems.Dao;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.HomeEntity;
import com.ems.IDao.IHomeDao;
import com.ems.dto.HomeDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.sql.*;
import java.util.List;


/**
 * Created by Apurbo on 8/20/2016.
 */

public class HomeDao extends BaseDao implements IHomeDao {


    public Model getModel(HomeDto homeDto, Model model) {

        model.addAttribute("firstName", homeDto.getFirstName());
        model.addAttribute("lastName", homeDto.getLastName());
        model.addAttribute("age", homeDto.getAge());
        model.addAttribute("id", homeDto.getId());
        return model;
    }

    @Transactional(readOnly = true)
    public void insetIntoTable(HomeEntity homeEntity) throws ClassNotFoundException, SQLException {
        em.persist(homeEntity);
        em.flush();
    }
@Transactional
    public List<HomeDto> getListFormTable() throws SQLException {
        String query = properties.getProperty("HomeDao.getListFormTable");
        org.hibernate.Query hQuery = hibernateQuery(query);
        List<HomeDto> homeDtoList= hQuery.list();
        return  homeDtoList;

    }


}
