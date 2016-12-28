package com.ems.Dao;

import com.ems.BaseDao.BaseDao;
import com.ems.Entity.HomeEntity;
import com.ems.IDao.IListDao;
import com.ems.dto.HomeDto;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Apurbo on 11/13/2016.
 */
public class ListDao extends BaseDao implements IListDao{
    public Model getModel(HomeDto homeDto, Model model) {
        return null;
    }

    public void insetIntoTable(HomeEntity homeEntity) throws ClassNotFoundException, SQLException {

    }
    @Transactional
    public List<HomeDto> getListFormTable() throws SQLException {

        String query = properties.getProperty("HomeDao.getListFormTable");
        org.hibernate.Query hQuery = hibernateQuery(query);
        List<HomeDto> homeDtoList= hQuery.list();
        return  homeDtoList;
    }
}
