package com.ezd.dao;

import com.ezd.model.EzdEnret;
import com.ezd.model.EzdEnretBrowse;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdEnretBrowseDao {

    //根据招聘信息查询浏览过此招聘信息的人
    public List<EzdEnretBrowse> getPeopleBrowsing(EzdEnret ezdEnret);


}
