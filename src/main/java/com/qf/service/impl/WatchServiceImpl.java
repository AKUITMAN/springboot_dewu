package com.qf.service.impl;

import com.qf.commom.BaseResponse;
import com.qf.dao.WatchRespostory;
import com.qf.pojo.Watch;
import com.qf.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WatchServiceImpl implements WatchService {
    @Autowired
      WatchRespostory watchRespostory;

    @Override
    public BaseResponse findAll() {
        List<Watch> list=watchRespostory.findAll();
        BaseResponse baseResponse = new BaseResponse();
        if (list!=null){
        baseResponse.setData(list);
        baseResponse.setMessage("查询成功");
        baseResponse.setCode(200);}
        else {
            baseResponse.setMessage("查询失败");
            baseResponse.setCode(201);
        }
        return baseResponse;
    }
}
