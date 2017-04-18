package com.ezd.service;

import com.ezd.dao.EzdEnmgDao;
import com.ezd.model.EzdEnmg;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 */
@Service
@Transactional
public class EzdEnretService {
    @Resource
    private EzdEnmgDao ezdEnmgDao;

    public List<EzdEnmg> getAll(){
        return null;
    }


}
