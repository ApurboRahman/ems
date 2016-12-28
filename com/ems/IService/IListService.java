package com.ems.IService;

import com.ems.dto.HomeDto;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Apurbo on 11/13/2016.
 */
public interface IListService {

    public List<HomeDto> getListFromTable() throws SQLException;

}
