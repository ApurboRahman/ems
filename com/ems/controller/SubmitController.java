package com.ems.controller;

import com.ems.IService.IHomeService;
import com.ems.dto.HomeDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

/**
 * Created by Apurbo on 11/15/2016.
 */
@RequestMapping(value = "/")
public class SubmitController {
    private IHomeService homeService;

    public void setHomeService(IHomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String submit(HomeDto homeDto, Model model) throws SQLException, ClassNotFoundException {
        homeService.getModel(homeDto, model);
        homeService.insetIntoTable(homeDto);
        return "submit";
    }
}
