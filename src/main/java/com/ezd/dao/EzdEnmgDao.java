package com.ezd.dao;

import com.ezd.model.EzdEnmg;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdEnmgDao {
    /*通过id获取详细的公司信息*/
    public EzdEnmg getEnmg(int enmgId)throws Exception;
}
