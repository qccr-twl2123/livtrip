package com.livtrip.web.controller;

import com.github.pagehelper.Page;
import com.livtrip.web.model.Result;
import com.livtrip.web.service.DescriptionService;
import com.livtrip.web.service.DestService;
import com.livtrip.web.service.HotelImagesService;
import com.livtrip.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 酒店相关接口
 * Created by xierongli on 17/8/13.
 */
@RestController
@RequestMapping("/hotel")
public class HotelProductController extends  BaseRestController{

    @Autowired
    private ProductService productService;
    @Autowired
    private HotelImagesService hotelImagesService;
    @Autowired
    private DescriptionService descriptionService;
    @Autowired
    private DestService destService;

    @Override
    public Result<List> findAll() {

        return null;
    }

    @Override
    public Result<Page> findAll(int start, int pageSize) {
        return null;
    }

    @Override
    public Result findById(Long id) {
        return null;
    }

    @Override
    public Result findByName(String name) {
        return null;
    }

    @Override
    public Result<Boolean> delByName(String name) {
        return null;
    }

    @Override
    public Result<Boolean> delById(Long id) {
        return null;
    }

    @Override
    public Result<Boolean> add(Object model) {
        return null;
    }

    @Override
    public Result<Boolean> update(Object model) {
        return null;
    }

    @Override
    public Result<Boolean> delByIds(List ids) {
        return null;
    }
}
