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
     * @param response
     * @param enmgId
     */
    @RequestMapping(value = "/ajaxGetOneAll",method = RequestMethod.POST)
    public void getOneAll(HttpServletResponse response,int enmgId){
        EzdEnmg ezdEnmg = new EzdEnmg();
        ezdEnmg.setEnmgId(enmgId);
        List<EzdEnret> oneAll = ezdEnretService.getOneAll(ezdEnmg);
        String s = JSONValue.toJSONString(oneAll);
        new AjaxUtil().renderData(response,s);

    }

    /**
     * 根据招聘类型查询出招聘信息
     * @param response
     * @param retTypeId
     */
    @RequestMapping(value = "/ajaxGetEnretTypeAll",method = RequestMethod.POST)
    public void getEnretTypeAll(HttpServletResponse response,int retTypeId){
        EzdRetType ezdRetType = new EzdRetType();
        ezdRetType.setRetTypeId(retTypeId);
        List<EzdEnret> enretTypeAll = ezdEnretService.getEnretTypeAll(ezdRetType);
        String s = JSONValue.toJSONString(enretTypeAll);
        new AjaxUtil().renderData(response, s);
    }

    /**
     * 根据工资的范围进行查询招聘信息
     * @param response
     * @param ezdEnret
     */
    @RequestMapping(value = "/ajaxGetMoneyAll",method = RequestMethod.POST)
    public void getMoneyAll(HttpServletResponse response,EzdEnret ezdEnret){
        List<EzdEnret> moneyAll = ezdEnretService.getMoneyAll(ezdEnret);
        String s = JSONValue.toJSONString(moneyAll);
        new AjaxUtil().renderData(response, s);
    }

    /**
     * 根据企业地址查询出招聘信息
     * @param response
     * @param enmgAddress
     */
    @RequestMapping(value = "/ajaxGetEnmgAddressAll",method = RequestMethod.POST)
    public void getEnmgAddressAll(HttpServletResponse response,String enmgAddress){
        EzdEnmg ezdEnmg = new EzdEnmg();
        ezdEnmg.setEnmgAddress(enmgAddress);
        List<EzdEnret> enmgAddressAll = ezdEnretService.getEnmgAddressAll(ezdEnmg);
        String s = JSONValue.toJSONString(enmgAddressAll);
        new AjaxUtil().renderData(response,s);
    }

    /**
     * 根据浏览数量进行排序查询招聘信息
     * @param response
     */
    @RequestMapping(value = "ajaxGetCountAll",method = RequestMethod.POST)
    public void getCountAll(HttpServletResponse response){
        List<EzdEnret> countAll = ezdEnretService.getCountAll();
        String s = JSONValue.toJSONString(countAll);
        new AjaxUtil().renderData(response,s);

    }


    /**
     * 根据企业删除招聘信息
     * @param response
     * @param enretId
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public boolean delete(HttpServletResponse response,int enretId){
        EzdEnret ezdEnret = new EzdEnret();
        ezdEnret.setEnretId(enretId);
        boolean bl = ezdEnretService.delete(ezdEnret);
        return bl;
    }

    /**
     * 根据企业添加招聘信息
     * @param response
     * @param ezdEnret
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public boolean insert(HttpServletResponse response,EzdEnret ezdEnret){
        boolean bl = ezdEnretService.insert(ezdEnret);
        return bl;
    }

}
