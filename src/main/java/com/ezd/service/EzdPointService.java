package com.ezd.service;

import com.ezd.dao.EzdPointDao;
import com.ezd.model.EzdPoint;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/17.
 */
@Service
@Transactional
public class EzdPointService {

    @Resource
    private EzdPointDao pointDao;

    //添加点赞
    public boolean insert(EzdPoint ezdPoint){
        int row = pointDao.isThere(ezdPoint);
        if (row>0){
            //取消点赞
            int update = pointDao.update(ezdPoint);
            if (update>0){
                return true;
            }
        }
        //增加点赞
        int insert = pointDao.insert(ezdPoint);
        if (insert>0){
            return true;
        }
        return false;
    }
}
