package com.ezd.service;

import com.ezd.dao.EzdReadartiDao;
import com.ezd.model.EzdArticle;
import com.ezd.model.EzdReadarti;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Service
@Transactional
public class EzdReadartiService {

    @Resource
    private EzdReadartiDao ezdReadartiDao;

    //添加阅读信息
    public boolean insert(EzdReadarti ezdReadarti){
        int insert = ezdReadartiDao.insert(ezdReadarti);
        if (insert>0){
            return true;
        }
        return false;

    }

}
