package com.ems.controller;

import com.ems.IService.IHomeService;
import com.ems.IService.IListService;
import com.ems.Service.HomeService;
import com.ems.Service.ListService;
import com.ems.dto.HomeDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Apurbo on 11/13/2016.
 */
@RequestMapping(value = "list")
public class ListController {

    private IListService listService;

    public void setHomeService(IHomeService homeService) {
        IHomeService homeService1 = homeService;
    }

    public void setListService(IListService listService) {
        this.listService = listService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Lists";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getListFromTable(Model model) throws SQLException {

        List<HomeDto> getList = listService.getListFromTable();
       model.addAttribute("getList", getList);
        return "Lists";
    }
}
