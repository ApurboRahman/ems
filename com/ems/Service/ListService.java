package com.ems.Service;

import com.ems.IDao.IHomeDao;
import com.ems.IDao.IListDao;
import com.ems.IService.IListService;
import com.ems.dto.HomeDto;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Apurbo on 11/13/2016.
 */
public class ListService implements IListService{
    private IListDao listDao;

    public void setHomeDao(IHomeDao homeDao) {
        IHomeDao homeDao1 = homeDao;
    }

    public void setListDao(IListDao listDao) {
        this.listDao = listDao;
    }

    public List<HomeDto> getListFromTable() throws SQLException {
        List<HomeDto> homeDto = listDao.getListFormTable();
        return homeDto;
    }
}
