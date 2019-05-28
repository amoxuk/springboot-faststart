package com.amoxuk.controller;
/**
 * Created by Misty-Rain on 2019/5/26.
 */


import com.amoxuk.entity.SimpleEntity;
import com.amoxuk.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 */
@Controller
public class SimpleCotroller {

    @Autowired
    private SimpleService service;


    @ResponseBody
    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public List<SimpleEntity> selectHotel() {
        List<SimpleEntity> hotels = service.selectAll();
        return hotels;
    }

}
