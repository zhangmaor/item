package com.ezd.service;

import com.ezd.dao.EzdUsersDao;
import com.ezd.model.EzdUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {
    @Resource
    private EzdUsersDao ezdUsersDao;

    //登录
    public EzdUsers login(EzdUsers ezdUsers) {
        return  ezdUsersDao.login(ezdUsers);
    }
    //注册用户
    public int addUser(EzdUsers ezdUsers){
        return ezdUsersDao.addUser(ezdUsers);
    }
    //检查用户是否存在
    public int checkUser(String userPhone){
        return ezdUsersDao.checkUser(userPhone);
    }
}
