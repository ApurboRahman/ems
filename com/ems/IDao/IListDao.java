package com.ems.IDao;

import com.ems.Entity.HomeEntity;
import com.ems.dto.HomeDto;
import org.springframework.ui.Model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Apurbo on 11/13/2016.
 */
public interface IListDao {
    public Model getModel(HomeDto homeDto, Model model);

    public void insetIntoTable(HomeEntity homeEntity) throws ClassNotFoundException, SQLException;

    public List<HomeDto> getListFormTable() throws SQLException;
}

