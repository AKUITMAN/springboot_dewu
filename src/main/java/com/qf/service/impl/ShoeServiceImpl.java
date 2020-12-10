package com.qf.service.impl;

import com.qf.commom.BaseResponse;
import com.qf.dao.ShoesRespository;
import com.qf.pojo.Shoes;
import com.qf.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoeServiceImpl implements ShoeService {
    @Autowired
    private ShoesRespository shoesRespository;
    @Override
    public BaseResponse findAll() {
        List<Shoes> list=shoesRespository.findAll();
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(200);
        baseResponse.setData(list);
        return baseResponse;
    }
}
