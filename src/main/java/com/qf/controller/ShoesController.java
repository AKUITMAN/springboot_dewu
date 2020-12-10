package com.qf.controller;

import com.qf.commom.BaseResponse;
import com.qf.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shoes")
public class ShoesController {
    @Autowired
    private ShoeService shoeService;
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public BaseResponse findAll(){
        return shoeService.findAll();
    }
}
