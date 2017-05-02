package com.ezd.controller;

import com.ezd.model.EzdEnmg;
import com.ezd.model.EzdEnret;
import com.ezd.model.EzdSchtype;
import com.ezd.service.EzdEnretService;
import com.ezd.service.EzdSchTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/13.
 */
@Controller
@RequestMapping("/enret")
public class EzdEnretController {

    @Resource
    private EzdEnretService ezdEnretService;
    @Resource
    private EzdSchTypeService ezdSchTypeService;


    @RequestMapping("/index")
    public String index(){
        return "sxgl";
    }
    @RequestMapping("/wz_add")
    public String index7(){
        return "wz_add";
    }

    @RequestMapping("/qz_job")
    public String index6(){
        return "qz_job";
    }

    @RequestMapping("/sx_job")
    public String index5(){
        return "sx_job";
    }

    @RequestMapping("/qzgl")
    public String index2(){
        return "qzgl";
    }

    @RequestMapping("/wzgl")
    public String index3(){
        return "wzgl";
    }

    @RequestMapping("/xx_add")
    public String index12(Model model){
        List<EzdSchtype> ezdSchtypes = new ArrayList<EzdSchtype>();
        ezdSchtypes = ezdSchTypeService.findSchType();
        model.addAttribute("types",ezdSchtypes);

        return "xx_add";
    }

    @RequestMapping("/xxgl")
    public String index4(){
        return "xxgl";
    }

    @RequestMapping("/dzhgl")
    public String index8(){
        return "dzhgl";
    }

    @RequestMapping("/dzh_add")
    public String index9(){
        return "dzh_add";
    }

    @RequestMapping("/qygl")
    public String index10(){
        return "qygl";
    }

    @RequestMapping("/qy_add")
    public String index11(){
        return "qy_add";
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
    /**
     * 根据公司id查询出本公司所有的招聘信息
     * @param enmgId
     */
    @RequestMapping(value = "/ajaxGetOneAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getOneAll(int enmgId) throws Exception {
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
     * 根据enret_id查询出招聘信息
     */
    @RequestMapping(value = "/ajaxGetEzdEnretAll",method = RequestMethod.POST)
    @ResponseBody
    public EzdEnret getEzdEnretAll(int enretId) throws Exception {
        EzdEnret ezdEnretAll = ezdEnretService.getEzdEnretAll(enretId);
        return ezdEnretAll;
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
     * 根据企业删除招聘信息
     * @param enretId
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
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
        //System.out.println(ezdEnret);
        boolean bl = ezdEnretService.insert(ezdEnret);
        return bl;
    }


    /**
     * 根据企业id更改招聘信息
     * @param ezdEnret
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public boolean update(EzdEnret ezdEnret){
        System.out.println(ezdEnret.toString());
        boolean update = ezdEnretService.update(ezdEnret);
        return update;
    }

}
