package com.qf.controller;

import com.qf.commom.BaseResponse;
import com.qf.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/watch")
public class WatchController {
    @Autowired
     private WatchService watchService;

    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public BaseResponse findAll(){
        return watchService.findAll();
    }
}
