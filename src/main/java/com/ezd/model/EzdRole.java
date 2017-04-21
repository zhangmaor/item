package com.ezd.model;

import java.util.List;

/**
 * Created by Administrator on 2017/4/6.
 */
//角色表
public class EzdRole {

    private int roleId; //角色编号
    private String roleName; //角色名称
    private List<EzdPermission> ezdPermissions;//角色对应的权限
    private List<EzdUsers> ezdUserss; // 角色对应的用户

    @Override
    public String toString() {
        return "EzdRole{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", ezdPermissions=" + ezdPermissions +
                ", ezdRoleUsers=" + ezdUserss +
                '}';
    }

    public List<EzdUsers> getEzdUserss() {
        return ezdUserss;
    }

    public void setEzdUserss(List<EzdUsers> ezdUserss) {
        this.ezdUserss = ezdUserss;
    }

    public List<EzdPermission> getEzdPermissions() {
        return ezdPermissions;
    }

    public void setEzdPermissions(List<EzdPermission> ezdPermissions) {
        this.ezdPermissions = ezdPermissions;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


}
