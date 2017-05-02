package com.ezd.controller.app;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdEnret;
import com.ezd.service.EzdEnmgService;
import com.ezd.service.EzdEnretService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/4/24.
 * app_企业
 */
@Controller
@RequestMapping("/app_enmg")
public class AppEnmg {
    @Resource
    private EzdEnmgService ezdEnmgService;

    /**
     * 显示全部的企业列表/app_enmg/getEnmgAll
     * @return
     */
    @RequestMapping("/getEnmgAll")
    @ResponseBody
    public List<EzdEnmg> getList(){
        List<EzdEnmg> all = ezdEnmgService.getAll();
        return all;
    }

    /**
     * 通过区域来查询企业信息
     * @param address  城市名
     * @return
     */
    @RequestMapping("/addressGet")
    @ResponseBody
    public List<EzdEnmg> getEnmgList(String address){
        List<EzdEnmg> enmgList = ezdEnmgService.addressGet(address);
        return enmgList;
    }

    /**
     * 通过企业的类型来进行查询
     * @param typeId
     * @return
     */
    @RequestMapping("/typeGet")
    @ResponseBody
    public List<EzdEnmg> getEnmgList(int typeId){
        List<EzdEnmg> enmgList = ezdEnmgService.typeGet(typeId);
        return enmgList;
    }

    /**
     * 根据行业类型进行查询！！！
     * @param industryId
     * @return
     */
    @RequestMapping("/industryGet")
    @ResponseBody
    public List<EzdEnmg> enmgList(int industryId){
        List<EzdEnmg> enmgList = ezdEnmgService.industryGet(industryId);
        return enmgList;
    }
}
