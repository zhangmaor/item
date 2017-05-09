package com.ezd.dao;

import com.ezd.model.EzdUsers;

import java.util.List;

/**
 * Created by Administrator on 2017-04-10.
 */
public interface EzdUsersDao {

    //用户登录
    public EzdUsers login(EzdUsers ezdUsers);
    //用户注册
    public int addUser(EzdUsers ezdUsers);
    //检查用户是否存在
    public int checkUser(String userPhone);

    //根据user_id获取一个用户信息
    public EzdUsers getEzdUsersAll(int userId);


    /*获取一个用户信息*/
    public EzdUsers getAll(EzdUsers ezdUsers);
    public Integer getCount(EzdUsers ezdUsers);
}
