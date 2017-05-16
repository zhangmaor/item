package com.ezd.controller.background;

import com.ezd.jackonInterface.BigretEnmgFilter;
import com.ezd.jackonInterface.BigretFilterGetAll;
import com.ezd.jackonInterface.EnmgEnretFilter;
import com.ezd.jackonInterface.EnmgEnretsFilter;
import com.ezd.model.*;
import com.ezd.service.EzdEnmgService;
import com.ezd.service.EzdIndustryService;
import com.ezd.utils.LocalhostIp;
import com.ezd.utils.RandomName;
import com.ezd.utils.Upload;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 */
@Controller
@RequestMapping("/bgEnmg")
public class BgEnmg {
    @Resource
    private EzdEnmgService ezdEnmgService;

    @Resource
    private EzdIndustryService ezdIndustryService;

    @RequestMapping("/getIndustry")
    @ResponseBody
    public List<EzdIndustry> getIndustry(){
        List<EzdIndustry> all = ezdIndustryService.getAll();
        return all;
    }
    @RequestMapping("/getType")
    @ResponseBody
    public List<EzdEntype> getType(){
        List<EzdEntype> type = ezdIndustryService.getType();
        return type;
    }

    /**
     * 通过指定的企业编号获取指定的信息
     * 比如修改企业信息的时候，
     * 显示企业详细信息的时候；
     * @param id
     */
    private EzdEnmg getOneEnmg(int id){
        return ezdEnmgService.getEnmg(id);
    }
    /**
     * 进入企业列表的页面
     * 查询所有的企业信息/bgEnmg/enmg
     * @return
     */
    @RequestMapping(value = "/enmg",method = RequestMethod.GET)
    public void getEnmg(HttpServletResponse response) {
        List<EzdEnmg> all = ezdEnmgService.getAll();

        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixIn(EzdEnmg.class, BigretEnmgFilter.class);
        mapper.addMixIn(EzdEnret.class, EnmgEnretsFilter.class);
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,all);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    /**
     * 点击某一个企业，然后就执行这个方法
     * 进入详细的企业信息列表
     * @param id   ----- 点击的那个企业的详细信息
     * @return/getEnmg
     */
    @RequestMapping("/getEnmg")
    @ResponseBody
    public EzdEnmg getEnmg( int id) {
        return this.getOneEnmg(id);
    }

    /**
     * 进入添加页面
     * @return
     */
    @RequestMapping("/getAdd")
    public String getAdd(){
        return "";
    }

    /**
     * 创建（添加，生成）一个企业/bgEnmg/add
     * @param ezdEnmg
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(EzdEnmg ezdEnmg, @RequestParam("file") MultipartFile file,HttpServletRequest request,int scaleMin,int scaleMax,String createTime){
        ezdEnmg.setEnmgScale(scaleMin+"-"+scaleMax);
        Upload upload = new Upload();
        RandomName randomName = new RandomName();
        String url = "";
        try {
            url = upload.fildUpload(randomName.getRandom(),file,request,2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(createTime!=null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                ezdEnmg.setEnmgCretime(sdf.parse(createTime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if(url==null){
            url = "/img/userDefault.png";
        }
        ezdEnmg.setEnmgLogo(url);
            boolean add = ezdEnmgService.add(ezdEnmg);
            HttpSession session = request.getSession();
            if(add){
                session.setAttribute("addEnmgResult",1);
            }else{
                session.setAttribute("addEnmgResult",0);
            }
            return "redirect:/enret/index";
    }

    /**
     * 进入到修改页面
     * @param request
     * @param id
     * @param model ---- 获取到要修改的那个企业的详细信息并在update页面进行修改
     * @return  ---- 修改页面的名字
     */
    @RequestMapping("/getUpdate")
    public String getUpdate(HttpServletRequest request,int id ,Model model){
        //this.getOneEnmg(request,id,model);
        return "";
    }

    /**
     * 对修改进行提交
     * @param ezdEnmg  ---修改后的一部分信息/bgEnmg/update
     * @return
     */
    @RequestMapping(value = "/update" ,method=RequestMethod.POST)

    public void update(EzdEnmg ezdEnmg, HttpServletResponse response){
        EzdEnmg enmg = ezdEnmgService.getEnmg(ezdEnmg.getEnmgId());
        boolean update = ezdEnmgService.update(enmg, ezdEnmg);
        ObjectMapper mapper = new ObjectMapper();
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,update);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * /bgEnmg/del
     * @param id
     * @return
     */
    @RequestMapping("/del")
    public void del(HttpServletResponse response,@RequestParam("id")String id){
        int i = 0;
        if(id!=null)
            i = Integer.parseInt(id);
        boolean enmgdel = ezdEnmgService.del(i);
        ObjectMapper mapper = new ObjectMapper();
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,enmgdel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
