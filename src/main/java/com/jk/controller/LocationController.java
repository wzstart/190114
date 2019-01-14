package com.jk.controller;

import com.jk.bean.Region;
import com.jk.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("location")
public class LocationController {

    @Autowired
    QueryService queryService;

    @RequestMapping("getRegion")
    public List<Region> getRegion(Integer countryId) {

        System.out.println(countryId);
        List<Region> regions = null;

        try {
            //dubbo 可以像调用本地方法一样调用远程方法
            regions = queryService.queryRegion(countryId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return regions;
    }

    @ResponseBody
    @RequestMapping("test")
    public String test() {
        System.out.println("本地提交");
        System.out.println("我好开心啊");
        System.out.println("我爱你");
        return "success";
    }
}
