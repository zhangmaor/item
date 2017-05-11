package com.ezd.dao;

import com.ezd.model.EzdErlbigret;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdErlbigretDao {
    /*根据大招会的id获取报名的信息*/
    public List<EzdErlbigret> idGet(int bigretId) throws Exception;
    /*添加信息*/
    public int add(EzdErlbigret ezdErlbigret)throws Exception;
}
