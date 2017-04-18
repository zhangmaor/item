package com.ezd.test;

import com.ezd.dao.EzdUmgDao;
import com.ezd.dao.EzdUnewsDao;
import com.ezd.dao.EzdUsersDao;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/10.
 */
public class MyBatisSQLTest {
   // @Test/*测试修改数据*/
//    public void updateTest(){
//
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        EzdUnewsDao bean = ctx.getBean(EzdUnewsDao.class);
//        int i = bean.updateStatus(1);
//        System.out.println("受影响的行"+i);
//    }

    @Test
    public void jsonTest(){
       boolean a = false;

        String s = JSONValue.toJSONString(a);
        System.out.println(s);

    }

    public static void main(String[] args) {
        //com.ezd.dao.EzdArticleDao.article
        //com.ezd.dao.EzdArticleDao.article
        // com.ezd.dao.EzdArticlDao
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        EzdUsersDao ezdUsersDao = ctx.getBean(EzdUsersDao.class);
        EzdUsers ezdUsers = new EzdUsers();
        ezdUsers.setUserPhone("13620463438");
        ezdUsers.setUserPwd("134131");
        //EzdUsers all = ezdUsersDao.getAll(ezdUsers);
        Integer a = ezdUsersDao.getCount(ezdUsers);
        System.out.println("匹配的数量为："+a);
//        EzdUmgDao ezdUmgDao = ctx.getBean(EzdUmgDao.class);
//        List<EzdUmg> all1 = ezdUmgDao.getAll(all);
//        for (EzdUmg e : all1
//                ) {
//            e.setUmgUser(all);
//            System.out.println("用户信息表：" + e);
//        }

    }
}
