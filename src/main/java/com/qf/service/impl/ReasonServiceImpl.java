package com.qf.service.impl;

import com.qf.commom.BaseResponse;
import com.qf.dao.ReasonRespository;
import com.qf.pojo.Reason;
import com.qf.service.ReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReasonServiceImpl implements ReasonService {
    @Autowired
    ReasonRespository reasonRespository;
    @Override
    public BaseResponse findAll() {
        List<Reason> list=reasonRespository.findAll();
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

