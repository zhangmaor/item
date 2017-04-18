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

}
