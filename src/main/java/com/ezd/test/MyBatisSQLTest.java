package com.ezd.test;

import com.ezd.dao.EzdUmgDao;
import com.ezd.dao.EzdUsersDao;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2017/4/10.
 */
public class MyBatisSQLTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        EzdUsersDao ezdUsersDao = ctx.getBean(EzdUsersDao.class);
       EzdUsers ezdUsers = new EzdUsers();
       ezdUsers.setUserPhone("13620463438");
       ezdUsers.setUserPwd("134131qp");
        EzdUsers all = ezdUsersDao.getAll(ezdUsers);
        EzdUmgDao ezdUmgDao = ctx.getBean(EzdUmgDao.class);
        List<EzdUmg> all1 = ezdUmgDao.getAll(all);
        for (EzdUmg e: all1
             ) {
            System.out.println("用户信息表："+e);
        }

    }
}
