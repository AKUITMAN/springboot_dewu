package com.qf.controller;

import com.qf.commom.BaseResponse;
import com.qf.service.ReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("reason")
@ResponseBody
public class ReasonController {

    @Autowired
    private ReasonService  reasonService;
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public BaseResponse findAll(){
        return reasonService.findAll();
    }
}
