package com.ezd.service;

import com.ezd.dao.EzdEnretBrowseDao;
import com.ezd.dao.EzdEnretDao;
import com.ezd.dao.EzdErlenretDao;
import com.ezd.dao.EzdUmgDao;
import com.ezd.model.*;
import com.ezd.dao.EzdEnmgDao;
import com.ezd.model.EzdEnmg;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2017/4/18.
 */
@Service
@Transactional
public class EzdEnretService {


    @Resource
    private EzdEnretDao ezdEnretDao;
    @Resource
    private EzdErlenretDao ezdErlenretDao;
    @Resource
    private EzdEnretBrowseDao ezdEnretBrowseDao;
    @Resource
    private EzdUmgDao ezdUmgDao;
    @Resource
    private EzdEnmgDao ezdEnmgDao;


    //查询出所有招聘信息
    public List<EzdEnret> getAll() throws Exception{
        List<EzdEnret> list = new ArrayList<>();
        list = ezdEnretDao.getAll();
        for (EzdEnret li:list) {
            List<EzdErlenret> personList = ezdErlenretDao.getPersonEnrolled(li);
            EzdEnmg enmg = ezdEnmgDao.getEnmg(li.getNretEnmg());
            List<EzdEnretBrowse> peopleBrowsing = ezdEnretBrowseDao.getPeopleBrowsing(li);
            for (EzdEnretBrowse people:peopleBrowsing) {
                List<EzdUmg> browsingUsers = ezdUmgDao.getBrowsingUsers(people);
                li.setEzdUmgs(browsingUsers);
            }
            li.setEzdErlenrets(personList);
            li.setEzdEnmg(enmg);
        }
        return list;
    }

    //根据公司id查询出本公司所有的招聘信息
    public List<EzdEnret> getOneAll(EzdEnmg ezdEnmg) throws Exception{
        List<EzdEnret> list = new ArrayList<>();
        list = ezdEnretDao.getOneAll(ezdEnmg);
        for (EzdEnret li:list) {
            List<EzdErlenret> personList = ezdErlenretDao.getPersonEnrolled(li);
            EzdEnmg enmg = ezdEnmgDao.getEnmg(li.getNretEnmg());
            List<EzdEnretBrowse> peopleBrowsing = ezdEnretBrowseDao.getPeopleBrowsing(li);
            for (EzdEnretBrowse people:peopleBrowsing) {
                List<EzdUmg> browsingUsers = ezdUmgDao.getBrowsingUsers(people);
                li.setEzdUmgs(browsingUsers);
            }
            li.setEzdErlenrets(personList);
            li.setEzdEnmg(enmg);
        }
        return list;
    }

    //根据招聘类型查询出招聘信息
    public List<EzdEnret> getEnretTypeAll(EzdRetType ezdRetType) throws Exception {
        List<EzdEnret> list = new ArrayList<>();
        list = ezdEnretDao.getEnretTypeAll(ezdRetType);
        for (EzdEnret li:list) {
            List<EzdErlenret> personList = ezdErlenretDao.getPersonEnrolled(li);
            EzdEnmg enmg = ezdEnmgDao.getEnmg(li.getNretEnmg());
            List<EzdEnretBrowse> peopleBrowsing = ezdEnretBrowseDao.getPeopleBrowsing(li);
            for (EzdEnretBrowse people:peopleBrowsing) {
                List<EzdUmg> browsingUsers = ezdUmgDao.getBrowsingUsers(people);
                li.setEzdUmgs(browsingUsers);
            }
            li.setEzdErlenrets(personList);
            li.setEzdEnmg(enmg);
        }
        return list;
    }

    //根据工资的范围进行查询招聘信息
    public List<EzdEnret> getMoneyAll(EzdEnret ezdEnret) throws Exception {
        List<EzdEnret> list = new ArrayList<>();
        list = ezdEnretDao.getMoneyAll(ezdEnret);
        for (EzdEnret li:list) {
            List<EzdErlenret> personList = ezdErlenretDao.getPersonEnrolled(li);
            EzdEnmg enmg = ezdEnmgDao.getEnmg(li.getNretEnmg());
            List<EzdEnretBrowse> peopleBrowsing = ezdEnretBrowseDao.getPeopleBrowsing(li);
            for (EzdEnretBrowse people:peopleBrowsing) {
                List<EzdUmg> browsingUsers = ezdUmgDao.getBrowsingUsers(people);
                li.setEzdUmgs(browsingUsers);
            }
            li.setEzdErlenrets(personList);
            li.setEzdEnmg(enmg);

        }
        return list;
    }

    //根据企业地址查询出招聘信息
    public List<EzdEnret> getEnmgAddressAll(EzdEnmg ezdEnmg) throws Exception {
        List<EzdEnret> list = new ArrayList<>();
        list = ezdEnretDao.getEnmgAddressAll(ezdEnmg);
        for (EzdEnret li:list) {
            List<EzdErlenret> personList = ezdErlenretDao.getPersonEnrolled(li);
            EzdEnmg enmg = ezdEnmgDao.getEnmg(li.getNretEnmg());
            List<EzdEnretBrowse> peopleBrowsing = ezdEnretBrowseDao.getPeopleBrowsing(li);
            for (EzdEnretBrowse people:peopleBrowsing) {
                List<EzdUmg> browsingUsers = ezdUmgDao.getBrowsingUsers(people);
                li.setEzdUmgs(browsingUsers);
            }
            li.setEzdErlenrets(personList);
            li.setEzdEnmg(enmg);
        }
        return list;
    }

    //根据浏览数量进行排序查询招聘信息
    public List<EzdEnret> getCountAll() throws Exception {
        List<EzdEnret> list = new ArrayList<>();
        list = ezdEnretDao.getCountAll();
        for (EzdEnret li:list) {
            List<EzdErlenret> personList = ezdErlenretDao.getPersonEnrolled(li);
            EzdEnmg enmg = ezdEnmgDao.getEnmg(li.getNretEnmg());
            List<EzdEnretBrowse> peopleBrowsing = ezdEnretBrowseDao.getPeopleBrowsing(li);
            for (EzdEnretBrowse people:peopleBrowsing) {
                List<EzdUmg> browsingUsers = ezdUmgDao.getBrowsingUsers(people);
                li.setEzdUmgs(browsingUsers);
            }
            li.setEzdErlenrets(personList);
            li.setEzdEnmg(enmg);
        }
        return list;
    }

    //根据企业id更改招聘信息
    public boolean update(EzdEnret e1,EzdEnret e2){

        if (e2.getEnretWantNum() == 0){
            e2.setEnretWantNum(e1.getEnretWantNum());
        }
        if (e2.getEnretCreTime() == null){
            e2.setEnretCreTime(e1.getEnretCreTime());
        }
        if (e2.getEnretDemand() == null){
            e2.setEnretDemand(e1.getEnretDemand());
        }
        if (e2.getEnretHgMoney() == 0){
            e2.setEnretHgMoney(e1.getEnretHgMoney());
        }
        if (e2.getEnretLwMoney() == 0){
            e2.setEnretLwMoney(e1.getEnretLwMoney());
        }
        if (e2.getEnretPg() == null){
            e2.setEnretPg(e1.getEnretPg());
        }
       if(e2.getEnretPostOne()==0){
            e2.setEnretPostOne(e1.getEnretPostOne());
       }
       if(e2.getEnretPostTwo()==0){
           e2.setEnretPostTwo(e1.getEnretPostTwo());
       }
        if (e2.getEnretType() == 0){
            e2.setEnretType(e1.getEnretType());
        }
        if (e2.getEnretStatus() == 0){
            e2.setEnretStatus(e1.getEnretStatus());
        }
        int row = ezdEnretDao.update(e2.getNretEnmg());
        if (row>0){
            return true;
        }
        return false;

    }

    //根据企业删除招聘信息
    public boolean delete(EzdEnret ezdEnret){
        int row = ezdEnretDao.delete(ezdEnret);
        if (row>0){
            return true;
        }
        return false;
    }

    //根据企业添加招聘信息
    public boolean insert(EzdEnret ezdEnret){
        int row = ezdEnretDao.add(ezdEnret);
        if (row>0){
            return true;
        }
        return false;

    }
}
