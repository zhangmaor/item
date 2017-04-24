package com.ezd.dao;

import com.ezd.model.EzdPostOne;

import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
public interface EzdPostOneDao {
    /**
     * 查询出所有的一级岗位
     * @return
     */
    public List<EzdPostOne> findPostOne() throws Exception;
}
