package com.ezd.service;

import com.ezd.dao.EzdSchtypeDao;
import com.ezd.model.EzdSchmg;
import com.ezd.model.EzdSchtype;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/26.
 */
@Service
@Transactional
public class EzdSchTypeService {

    @Resource
    private EzdSchtypeDao ezdSchtypeDao;

    private   List<EzdSchtype> ezdSchtypes =new ArrayList<EzdSchtype>();

    public List<EzdSchtype> findSchType() {
        try{
            ezdSchtypes = ezdSchtypeDao.FindSchType();
        }catch(Exception e){
            e.printStackTrace();
        }
        return ezdSchtypes;
    }



}
