package com.jk.service;

import com.jk.bean.Region;

import java.util.List;

public interface QueryService {
    List<Region> queryRegion(Integer countryId);
}
