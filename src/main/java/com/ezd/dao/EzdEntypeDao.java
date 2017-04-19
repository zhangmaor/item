package com.ezd.dao;

import com.ezd.model.EzdEntype;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdEntypeDao {
    //添加公司类型
    public int insertEntype(EzdEntype ezdEntype);

    /**
     * 查询全部的企业类型
     * @return
     * @throws Exception
     */
    public List<EzdEntype> getAll()throws Exception;
}
