package com.ezd.service;

import com.ezd.dao.*;
import com.ezd.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
@Service
@Transactional
public class EzdErlenretService {

    @Resource
    private EzdErlenretDao ezdErlenretDao;

    @Resource
    private EzdUmgDao ezdUmgDao;

    @Resource
    private EzdEnretDao ezdEnretDao;

    @Resource
    private EzdPostTwoDao ezdPostTwoDao;

    @Resource
    private EzdRestatusDao ezdRestatusDao;

    @Resource
    private EzdUsersDao ezdUsersDao;



    //根据招聘信息查出报名的人
    public List<EzdErlenret> getAll(){
        List<EzdErlenret> list = new ArrayList<>();
        list = ezdErlenretDao.getAll();
        for (EzdErlenret li :list) {
            EzdUmg ezdUmg = ezdUmgDao.getEzdUmgAll(li.getErlenretUmg());
            EzdUsers ezdUsersAll = ezdUsersDao.getEzdUsersAll(ezdUmg.getUserId());
            ezdUmg.setUmgUser(ezdUsersAll);
            EzdEnret ezdEnret = ezdEnretDao.getEzdEnretAll(li.getErlenretEnret());
            EzdPostTwo postTwo = ezdPostTwoDao.findPostTwo(ezdEnret.getEnretPostTwo());
            ezdEnret.setEzdPostTwo(postTwo);
            EzdRestatus ezdRestatus = ezdRestatusDao.getEzdRestatusAll(li.getErlenretStatus());
            li.setEzdUmg(ezdUmg);
            li.setEzdEnret(ezdEnret);
            li.setEzdRestatus(ezdRestatus);
        }
        return list;
    }
}
