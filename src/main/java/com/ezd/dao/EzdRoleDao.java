package com.ezd.dao;

import com.ezd.model.EzdRole;

import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 * 角色管理
 */
public interface EzdRoleDao {

    public List<EzdRole> getRoleByUserId(int userId) throws  Exception;


}
