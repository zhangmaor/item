package com.ezd.dao;

import com.ezd.model.EzdEnretBrowse;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdUmgDao {

    public List<EzdUmg> getAll(EzdUsers ezdUsers);

    //根据浏览信息的查询用户
    public List<EzdUmg> getBrowsingUsers(EzdEnretBrowse ezdEnretBrowse);

}
