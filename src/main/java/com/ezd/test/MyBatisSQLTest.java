package com.ezd.test;

import com.ezd.dao.EzdUsersDao;
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
        List<EzdUsers> all = ezdUsersDao.getAll();
        for (EzdUsers users: all
             ) {
            System.out.println("用户："+users);
        }
    }
}
