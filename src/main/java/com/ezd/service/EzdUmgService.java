package com.ezd.service;

import com.ezd.dao.EzdUmgDao;
import com.ezd.dao.EzdUsersDao;
import com.ezd.model.EzdEnretBrowse;
import com.ezd.model.EzdUmg;
import com.ezd.model.EzdUsers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017-04-19.
 */
@Service
@Transactional
public class EzdUmgService {
    @Resource
    private EzdUmgDao ezdUmgDao;
    @Resource
    private EzdUsersDao ezdUsersDao;

    /**
     * 根据用户查询所有的个人信息
     *
     * @param ezdUsers
     * @return
     */
    public List<EzdUmg> getAll(EzdUsers ezdUsers) {
        return ezdUmgDao.getAll(ezdUsers);
    }

    /**
     * 添加个人信息
     * @param ezdUmg
     * @return
     */
    public int insetAll(EzdUmg ezdUmg) {
        return ezdUmgDao.insetAll(ezdUmg);
    }

    /**
     * 修改个人信息
     *
     * @param ezdUmg
     * @return
     */
    public int upAll(EzdUmg ezdUmg) {
        EzdUmg umg = ezdUmgDao.getEzdUmgAll(ezdUmg.getUmgId());
        if(ezdUmg.getUmgBirthday()!=null){
            umg.setUmgBirthday(ezdUmg.getUmgBirthday());
        }
        if(ezdUmg.getUmgDegree()!=null){
            umg.setUmgDegree(ezdUmg.getUmgDegree());
        }
        if(ezdUmg.getUmgEducation()!=null){
            umg.setUmgEducation(ezdUmg.getUmgEducation());
        }
        if(ezdUmg.getUmgEmail()!=null){
            umg.setUmgEmail(ezdUmg.getUmgEmail());
        }
        if(ezdUmg.getUmgMajor()!=null){
            umg.setUmgMajor(ezdUmg.getUmgMajor());
        }
        if(ezdUmg.getUmgName()!=null){
            umg.setUmgName(ezdUmg.getUmgName());
        }
        if(ezdUmg.getUmgPhoto()!=null){
            umg.setUmgPhoto(ezdUmg.getUmgPhoto());
        }
        if(ezdUmg.getUmgSayMf()!=null){
            umg.setUmgSayMf(ezdUmg.getUmgSayMf());
        }
        if(ezdUmg.getUmgSchool()!=null){
            umg.setUmgSchool(ezdUmg.getUmgSchool());
        }
        if(ezdUmg.getUmgSex()!=null){
            umg.setUmgSex(ezdUmg.getUmgSex());
        }
        umg.setUmgUptime(new Date());
        int i = ezdUmgDao.upAll(umg);
        return i;

    }

    /**
     * 根据浏览信息的查询用户
     *
     * @param ezdEnretBrowse
     * @return
     */
    public List<EzdUmg> getBrowsingUsers(EzdEnretBrowse ezdEnretBrowse) {
        return ezdUmgDao.getBrowsingUsers(ezdEnretBrowse);
    }


    /**
     * 根据浏览信息的查询用户和用户兼职信息
     *
     * @param umgId
     * @return
     */

    public EzdUmg getUmgById(int  umgId) {
        EzdUmg ezdUmg = ezdUmgDao.getEzdUmgAll(umgId);
        EzdUsers ezdUsers = ezdUsersDao.getEzdUsersAll(ezdUmg.getUserId());
        System.out.println("============="+ezdUsers);
        ezdUmg.setUmgUser(ezdUsers);


        return ezdUmg;
    }


}
