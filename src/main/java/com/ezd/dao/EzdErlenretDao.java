package com.ezd.dao;

import com.ezd.model.EzdEnret;
import com.ezd.model.EzdErlenret;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdErlenretDao {

    //根据招聘信息查出报名的人
    public List<EzdErlenret> getPersonEnrolled(EzdEnret ezdEnret);

    //查询出所有的报名信息
    public List<EzdErlenret> getAll();

    //根据时间查询最近报名的人
    public List<EzdErlenret> getTimeAll();

}
