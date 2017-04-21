package com.ezd.dao;

import com.ezd.model.EzdRestatus;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdRestatusDao {

    //根据restatus_id查询出状态信息
    public EzdRestatus getEzdRestatusAll(int restatus_id);

}
