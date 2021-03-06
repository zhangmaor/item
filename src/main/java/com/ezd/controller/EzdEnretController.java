package com.ezd.controller;

import com.ezd.jackonInterface.BigretEnmgFilter;
import com.ezd.jackonInterface.BigretEnmgsFilter;
import com.ezd.jackonInterface.BigretUmgFilter;
import com.ezd.model.*;
import com.ezd.service.EzdBigretService;
import com.ezd.service.EzdEnretService;
import com.ezd.service.EzdSchTypeService;
import com.ezd.service.EzdUmgService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
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
    private EzdBigretService ezdBigretService;
    @Resource
    private EzdSchTypeService schTypeService;
    @Resource
    private EzdUmgService ezdUmgService;


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

    @RequestMapping("/403")
    public String noPer(){
        return "403";
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
        ezdSchtypes = schTypeService.findSchType();
        model.addAttribute("types",ezdSchtypes);

        return "xx_add";
    }

    @RequestMapping("/xxgl")
    public String index4(){
        return "xxgl";
    }

    @RequestMapping("/dzhgl")
    public String index8(Model model){
        List<EzdBigret> all = ezdBigretService.getAll();

        model.addAttribute("bigret",all);
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
     * 根据招聘类型查询出招聘信息/enret/ajaxGetEnretTypeAll?retTypeId=1
     * @param retTypeId
     */
    @RequestMapping(value = "/ajaxGetEnretTypeAll",method = RequestMethod.POST)

    public void getEnretTypeAll(int retTypeId, HttpServletResponse response) throws Exception {
        List<EzdEnret> enretTypeAll = ezdEnretService.getEnretTypeAll(retTypeId);
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(EzdEnmg.class, BigretEnmgsFilter.class);
        mapper.addMixInAnnotations(EzdUmg.class, BigretUmgFilter.class);
        OutputStream outputStream = null;
        outputStream = response.getOutputStream();
        mapper.writeValue(outputStream,enretTypeAll);
    }


    /*/
    * */

    @RequestMapping(value = "/ajaxGetEnretTypeAll",method = RequestMethod.GET)
    @ResponseBody
    public List<EzdEnret> postEnretTypeAll(int retTypeId) throws Exception {
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

        boolean update = ezdEnretService.update(ezdEnret);
        return update;
    }

    /**
     * 根据时间查询最近报名的人
     * @param retTypeId
     * @return
     */
    @RequestMapping(value = "/ajaxGetTimeAll",method = RequestMethod.POST)
    @ResponseBody
    public List<EzdEnret> getTimeAll(int retTypeId){
        List<EzdEnret> list = ezdEnretService.getTimeAll(retTypeId);
        return list;
    }

    /**
     * 根据用户ID查询用户信息
     * @param umgId
     * @return
     */
    @RequestMapping(value = "/ajaxGetUmg/{umgId}",method = RequestMethod.POST)
    @ResponseBody
    public EzdUmg getUmgById(@PathVariable int umgId){
        EzdUmg ezdUmg =  ezdUmgService.getUmgById(umgId);

        return ezdUmg;
    }

    @RequestMapping(value = "/ajaxGetUmg/{umgId}",method = RequestMethod.GET)
    @ResponseBody
    public EzdUmg postUmgById(@PathVariable int umgId){
        EzdUmg ezdUmg =  ezdUmgService.getUmgById(umgId);

        return ezdUmg;
    }
    /*请求获取每个状态的招聘信息的数量
    * /enret/getcount
    * */
    @RequestMapping(value = "getcount" ,method = RequestMethod.GET)
    public void getcount(EzdEnret ezdEnret,HttpServletResponse response){
        int count = ezdEnretService.getcount(ezdEnret);
        ObjectMapper mapper = new ObjectMapper();
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping(value = "/getResultCount" , method = RequestMethod.GET)
    public void gResultCount(int id ,HttpServletResponse response){
        int resultCount = ezdEnretService.getResultCount(id);
        ObjectMapper mapper = new ObjectMapper();
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,resultCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    * 添加一条消息
    * 并修改报名信息表的状态/enret/accepted
    * */
    @RequestMapping(value = "/accepted",method = RequestMethod.GET)
    public void accepted(int erlenretId ,int status,HttpServletResponse response){
        EzdErlenret ezdErlenret = new EzdErlenret();
        ezdErlenret.setErlenretId(erlenretId);
        ezdErlenret.setErlenretStatus(status);
        boolean b = ezdEnretService.accepted(ezdErlenret);
        ObjectMapper mapper = new ObjectMapper();
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   }
