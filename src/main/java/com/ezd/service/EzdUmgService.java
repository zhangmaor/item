package com.ezd.service;

import com.ezd.dao.EzdUmgDao;
import com.ezd.model.EzdEnretBrowse;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-04-19.
 */
@Service
@Transactional
public class EzdUmgService {
    @Resource
    private EzdUmgDao ezdUmgDao;

    /**
     * 根据用户查询所有的个人信息
     * @param ezdUsers
     * @return
     */
    public List<EzdUmg> getAll(EzdUsers ezdUsers){
        return ezdUmgDao.getAll(ezdUsers);
    }

    /**
     * 修改个人信息
     * @param ezdUmg
     * @return
     */
    public int upAll(EzdUmg ezdUmg){
        return ezdUmgDao.upAll(ezdUmg);
    }

    /**
     * 根据浏览信息的查询用户
     * @param ezdEnretBrowse
     * @return
     */
    public List<EzdUmg> getBrowsingUsers(EzdEnretBrowse ezdEnretBrowse){
        return ezdUmgDao.getBrowsingUsers(ezdEnretBrowse);
    }


}
