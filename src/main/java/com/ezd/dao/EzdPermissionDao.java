package com.ezd.dao;

import com.ezd.model.EzdPermission;
import com.ezd.model.EzdRole;

import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
public interface EzdPermissionDao {

    public List<EzdPermission> getPerByRoleId(int roleId) throws Exception;
}
