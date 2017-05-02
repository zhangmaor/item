package com.ezd.controller.app;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdEnret;
import com.ezd.service.EzdEnretService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 */
@Controller
@RequestMapping("/app_enret")
public class AppEnretController {
    @Resource
    private EzdEnretService ezdEnretService;
    /**
     * 根据招聘类型查询出招聘信息/app_enret/ajaxGetEnretTypeAll
     * @param retTypeId
     */
    @RequestMapping(value = "/ajaxGetEnretTypeAll",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdEnret> getEnretTypeAll(int retTypeId) throws Exception {
        List<EzdEnret> enretTypeAll = ezdEnretService.getEnretTypeAll(retTypeId);

        return enretTypeAll;
    }


    /**
     * 根据工资的范围进行查询招聘信息
     * @param ezdEnret
     */
    @RequestMapping(value = "/ajaxGetMoneyAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getMoneyAll(EzdEnret ezdEnret) throws Exception {
        List<EzdEnret> moneyAll = ezdEnretService.getMoneyAll(ezdEnret);
        return moneyAll;
    }

    /**
     * 根据企业地址查询出招聘信息
     * @param enmgAddress
     */
    @RequestMapping(value = "/ajaxGetEnmgAddressAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getEnmgAddressAll(String enmgAddress) throws Exception {
        EzdEnmg ezdEnmg = new EzdEnmg();
        ezdEnmg.setEnmgAddress(enmgAddress);
        List<EzdEnret> enmgAddressAll = ezdEnretService.getEnmgAddressAll(ezdEnmg);
        return  enmgAddressAll;
    }

    /**
     * 根据浏览数量进行排序查询招聘信息
     */
    @RequestMapping(value = "/ajaxGetCountAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getCountAll() throws Exception {
        List<EzdEnret> countAll = ezdEnretService.getCountAll();
        return countAll;

    }


    /**
     * 查询出所有招聘信息
     */
    @RequestMapping(value = "/ajaxGetAll",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdEnret> getAll() throws Exception {
        List<EzdEnret> All = ezdEnretService.getAll();
        return All;
    }
}
