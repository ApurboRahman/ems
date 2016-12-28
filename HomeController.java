package com.ems.controller;

import com.ems.IService.IHomeService;
import com.ems.dto.HomeDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Apurbo on 8/19/2016.
 */

/*@Controller*/

@RequestMapping(value = "/")
public class HomeController {
    private IHomeService homeService;

    public void setHomeService(IHomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }



    public void insetIntoTable(HomeDto dto) throws SQLException, ClassNotFoundException {
        homeService.insetIntoTable(dto);

    }


}
