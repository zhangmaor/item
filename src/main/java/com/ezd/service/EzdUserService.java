package com.ezd.service;

import com.ezd.dao.EzdUmgDao;
import com.ezd.dao.EzdUsersDao;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class EzdUserService {
    @Resource
    private EzdUsersDao ezdUsersDao;

    @Resource
    private EzdUmgDao ezdUmgDao;
    //登录
    public EzdUsers login(EzdUsers ezdUsers) {
        return  ezdUsersDao.login(ezdUsers);
    }
    //注册用户
    public int addUser(EzdUsers ezdUsers,String name){
        int i =0;
        try {
           ezdUsersDao.addUser(ezdUsers);
           EzdUmg ezdUmg = new EzdUmg();
           ezdUmg.setUmgUser(ezdUsers);
           ezdUmg.setUmgName(name);
           ezdUmg.setUmgPhoto("/img/userDefault.png");
            i = ezdUmgDao.insetAll(ezdUmg);
       }catch(Exception e){
           e.printStackTrace();
       }
       return i;
    }
    //检查用户是否存在
    public int checkUser(String userPhone){
        return ezdUsersDao.checkUser(userPhone);
    }

    //根据umgId获取user的信息
    public EzdUsers getUsers(int id){
       return ezdUsersDao.getEzdUsersAll(id);
    }

}
