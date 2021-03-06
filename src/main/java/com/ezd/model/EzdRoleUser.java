package com.ezd.model;

/**
 * Created by Administrator on 2017/4/6.
 */
//用户角色关系表
public class EzdRoleUser {

    private int uperId;
    private int userRole;
    private int userUmg;
    private EzdRole uperRole; //int references ezd_role(role_id),
    private EzdUsers ezdUsers; //int references ezd_users(user_id)


    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public int getUserUmg() {
        return userUmg;
    }

    public void setUserUmg(int userUmg) {
        this.userUmg = userUmg;
    }

    public int getUperId() {
        return uperId;
    }

    public void setUperId(int uperId) {
        this.uperId = uperId;
    }

    @Override
    public String toString() {
        return "EzdRoleUser{" +
                "uperId=" + uperId +
                ", uperRole=" + uperRole +
                ", ezdUsers=" + ezdUsers +
                '}';
    }

    public EzdRole getUperRole() {
        return uperRole;
    }

    public void setUperRole(EzdRole uperRole) {
        this.uperRole = uperRole;
    }

    public EzdUsers getEzdUsers() {
        return ezdUsers;
    }

    public void setEzdUsers(EzdUsers ezdUsers) {
        this.ezdUsers = ezdUsers;
    }

}
