package com.ems.IService;

import com.ems.Entity.HomeEntity;
import com.ems.dto.HomeDto;
import org.springframework.ui.Model;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Apurbo on 8/20/2016.
 */
public interface IHomeService {

    public HomeDto getHomeDto(HomeDto homeDto);
    public Model getModel(HomeDto homeDto,Model model);

    public void insetIntoTable(HomeDto dto) throws SQLException, ClassNotFoundException;

    public List<HomeDto> getListFromTable() throws SQLException;


}
