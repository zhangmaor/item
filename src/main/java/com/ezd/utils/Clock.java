package com.ezd.utils;

import com.ezd.dao.EzdBigretDao;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/20.
 */
public class Clock {
    /*@Resource
    private EzdBigretService ezdBigretService;*/
    @Resource
    private EzdBigretDao ezdBigretDao;

    public void SayHello() {
        try {
            int i1 = ezdBigretDao.timing3();
            int i2 = ezdBigretDao.timing2();
            int i3 = ezdBigretDao.timing1();
            System.out.println("timing3修改了="+i1+"时间是："+new java.util.Date());
            System.out.println("timing2修改了="+i2+"时间是："+new java.util.Date());
            System.out.println("timing1修改了="+i3+"时间是："+new java.util.Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
