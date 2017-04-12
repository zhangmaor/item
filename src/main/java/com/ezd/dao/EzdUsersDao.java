package com.ezd.dao;

import com.ezd.model.EzdUsers;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdUsersDao {
    /*获取一个用户信息*/
    public EzdUsers getAll(EzdUsers ezdUsers);
    public Integer getCount(EzdUsers ezdUsers);
}
