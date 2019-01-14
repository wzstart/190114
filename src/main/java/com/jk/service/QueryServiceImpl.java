package com.jk.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.bean.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl implements QueryService {


    @Reference
    LocationService locationService;

    @Override
    public List<Region> queryRegion(Integer countryId) {

        return locationService.getAllRegion(countryId);
    }
}
