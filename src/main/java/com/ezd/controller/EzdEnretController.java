package com.ezd.controller;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdEnret;
import com.ezd.model.EzdRetType;
import com.ezd.service.EzdEnretService;
import com.ezd.utils.AjaxUtil;
import org.json.simple.JSONValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/4/13.
 */
@Controller
@RequestMapping("/enret")
public class EzdEnretController {

    @Resource
    private EzdEnretService ezdEnretService;

    /**
     * 根据公司id查询出本公司所有的招聘信息
     * @param enmgId
     */
    @RequestMapping(value = "/ajaxGetOneAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getOneAll(int enmgId){
        EzdEnmg ezdEnmg = new EzdEnmg();
        ezdEnmg.setEnmgId(enmgId);
        List<EzdEnret> oneAll = ezdEnretService.getOneAll(ezdEnmg);
        return oneAll;
    }

    /**
     * 根据招聘类型查询出招聘信息
     * @param retTypeId
     */
    @RequestMapping(value = "/ajaxGetEnretTypeAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getEnretTypeAll(int retTypeId){
        EzdRetType ezdRetType = new EzdRetType();
        ezdRetType.setRetTypeId(retTypeId);
        List<EzdEnret> enretTypeAll = ezdEnretService.getEnretTypeAll(ezdRetType);
        return enretTypeAll;
    }

    /**
     * 根据工资的范围进行查询招聘信息
     * @param ezdEnret
     */
    @RequestMapping(value = "/ajaxGetMoneyAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getMoneyAll(EzdEnret ezdEnret){
        List<EzdEnret> moneyAll = ezdEnretService.getMoneyAll(ezdEnret);
        return moneyAll;
    }

    /**
     * 根据企业地址查询出招聘信息
     * @param enmgAddress
     */
    @RequestMapping(value = "/ajaxGetEnmgAddressAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getEnmgAddressAll(String enmgAddress){
        EzdEnmg ezdEnmg = new EzdEnmg();
        ezdEnmg.setEnmgAddress(enmgAddress);
        List<EzdEnret> enmgAddressAll = ezdEnretService.getEnmgAddressAll(ezdEnmg);
        return  enmgAddressAll;
    }

    /**
     * 根据浏览数量进行排序查询招聘信息
     */
    @RequestMapping(value = "ajaxGetCountAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getCountAll(){
        List<EzdEnret> countAll = ezdEnretService.getCountAll();
        return countAll;

    }

    /**
     * 根据企业删除招聘信息
     * @param enretId
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ResponseBody
    public boolean delete(int enretId){
        EzdEnret ezdEnret = new EzdEnret();
        ezdEnret.setEnretId(enretId);
        boolean bl = ezdEnretService.delete(ezdEnret);
        return bl;
    }

    /**
     * 根据企业添加招聘信息
     * @param ezdEnret
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public boolean insert(EzdEnret ezdEnret){
        boolean bl = ezdEnretService.insert(ezdEnret);
        return bl;
    }

}