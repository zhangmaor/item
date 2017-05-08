package com.ezd.service;

import com.ezd.dao.EzdEntypeDao;
import com.ezd.dao.EzdIndustryDao;
import com.ezd.model.EzdEntype;
import com.ezd.model.EzdIndustry;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/5/5.
 */
@Service
@Transactional
public class EzdIndustryService {
    @Resource
    private EzdIndustryDao ezdIndustryDao;
    @Resource
    private EzdEntypeDao ezdEntypeDao;
    /*显示全部的一级和二级行业*/
    public List<EzdIndustry> getAll(){
        List<EzdIndustry> all = null;
        try {
            all = ezdIndustryDao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;

    }
    /*显示全部的一级行业*/
    public List<EzdIndustry> get(){
        List<EzdIndustry> all = null;
        try {
            all = ezdIndustryDao.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;

    }
    public List<EzdEntype> getType(){
        List<EzdEntype> all =null;
        try {
            all = ezdEntypeDao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
}
