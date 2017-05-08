package com.ezd.dao;

import com.ezd.model.EzdIndustry;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdIndustryDao {
    public List<EzdIndustry> getAll()throws Exception;

    public List<EzdIndustry> get()throws Exception;
}
