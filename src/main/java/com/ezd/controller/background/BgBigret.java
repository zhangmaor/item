package com.ezd.controller.background;

import com.ezd.jackonInterface.*;
import com.ezd.model.*;
import com.ezd.service.EzdBigretService;
import com.ezd.service.EzdEnmgService;
import com.ezd.service.EzdSchmgService;
import com.ezd.utils.LocalhostIp;
import com.ezd.utils.RandomName;
import com.ezd.utils.Upload;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Controller
@RequestMapping("/bg")
public class BgBigret {
    @Resource
    private EzdBigretService ezdBigretService;

    @Resource
    private EzdEnmgService ezdEnmgService;
    @Resource
    private EzdSchmgService ezdSchmgService;

    @GetMapping
    public String index() {
        return "sxgl";
    }

    @RequestMapping("/index")
    public String aaaa(HttpServletRequest request) {
        return "sxgl";
    }

    /**
     * 进入大招会列表页面/bg/bigret
     */
    @RequestMapping(value = "/bigret", method = RequestMethod.GET)
    public void displayBigret(HttpServletRequest request, HttpServletResponse response) {
        List<EzdBigret> all = ezdBigretService.getAll();
        String ip = new LocalhostIp().getIp();
        for (EzdBigret e: all
             ) {
            //e.getBigretLogo();
            e.setBigretLogo(ip+e.getBigretLogo());
        }
        System.out.println("加载过的=====");
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig serializationConfig = mapper.getSerializationConfig();
        //  mapper.addMixInAnnotations(EzdBigret.class,BigretFilter.class);
        mapper.addMixInAnnotations(EzdErlbigret.class, BigretFilterGetAll.class);
        mapper.addMixInAnnotations(EzdEnmg.class, BigretEnmgsFilter.class);
        mapper.addMixInAnnotations(EzdSchmg.class, BigretSchmgFilter.class);
        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream, all);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println("大招会信息="+all);
        //  return all;
    }

    /**
     * 点击其中一个大招会信息/bg/bigretDetail
     * 进入大招会详情
     */
    @RequestMapping("/bigretDetail")
    public void datail(HttpServletResponse response, int id) {
        EzdBigret ezdBigret = ezdBigretService.get(id);
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig serializationConfig = mapper.getSerializationConfig();
        //  mapper.addMixInAnnotations(EzdBigret.class,BigretFilter.class);
        mapper.addMixInAnnotations(EzdErlbigret.class, BigretFilterGetAll.class);
        mapper.addMixInAnnotations(EzdEnmg.class, BigretEnmgsFilter.class);
        mapper.addMixInAnnotations(EzdSchmg.class, BigretSchmgFilter.class);
        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream, ezdBigret);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/redirectBig")
    public String da(Model model) {
        // Map<String, Object> stringObjectMap = model.asMap();
        //System.out.println(stringObjectMap.get("list"));
        return "bret";
    }

    /**
     * 获取全部的企业信息/bg/getAllEnmg
     *
     * @param request
     * @param response
     */
    @RequestMapping("/getAllEnmg")
    public void getEnmg(HttpServletRequest request, HttpServletResponse response) {
        List<EzdEnmg> all = ezdEnmgService.getAll();
        ObjectMapper mapper = new ObjectMapper();
        SerializationConfig serializationConfig = mapper.getSerializationConfig();
        mapper.addMixInAnnotations(EzdEnmg.class, BigretEnmgsFilter.class);
        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream, all);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询全部的学校信息
     * 主要是显示全部的学校/bg/getAllSch
     *
     * @param response
     */

    @RequestMapping("/getAllSch")
    public void getSch(HttpServletResponse response) {
        List<EzdSchmg> all = ezdSchmgService.findAll();
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(EzdSchmg.class, BigretSchmgFilter.class);
        ServletOutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream, all);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 点击修改
     * 进入修改页面
     */
    @RequestMapping("/updateBigret")
    public String update(int id) {
        EzdBigret ezdBigret = ezdBigretService.get(id);
        return "";
    }

    /**
     * 提交修改的数据/bg/actionUpdate
     * 看返回值
     *
     * @param
     * @param ezdBigret
     * @param id
     */

    @RequestMapping(value = "/actionUpdate", method=RequestMethod.POST)
    @ResponseBody
    public void actionUp(EzdBigret ezdBigret, String btime, int id,HttpServletResponse response) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (btime != null) {
            try {
                ezdBigret.setBigretTime(sdf.parse(btime));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        boolean update = ezdBigretService.update(ezdBigret, id);
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
     * 提交添加页面/bg/actionInsert
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/actionInsert", method = RequestMethod.POST)
    public String add(EzdBigret ezdBigret, String btime, @RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            ezdBigret.setBigretTime(sdf.parse(btime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Upload upload = new Upload();

        String random = new RandomName().getRandom();
        String url = null;
        try {
            url = upload.fildUpload(random, file, request, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(url==null){
            url = "/img/userDefault.png";
        }
        ezdBigret.setBigretLogo(url);
        ezdBigret.setBigretCreTime(new Date());
        ezdBigret.setRetStatus(1);
        boolean add = ezdBigretService.add(ezdBigret);
        HttpSession session = request.getSession();
        if (add) {
            session.setAttribute("redreticPoin", 1);
        } else {
            session.setAttribute("redreticPoin", 0);

        }
        return "redirect:/enret/index";
    }

    /**
     * 删除指定的大招会/bg/update
     *
     * @param status
     * @param id
     * @param response
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateStatus(int status, int id, HttpServletResponse response) {
        boolean b = ezdBigretService.updateStatus(status, id);
        ObjectMapper mapper = new ObjectMapper();
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream, b);
            System.out.println("是否删除成功" + b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过大招会的id编号获取报名该大招会的人员信息/bg/getErlbigret?bigretId=2
     * @param bigretId
     * @return
     */
    @RequestMapping("/getErlbigret")

    public void getErlBigret(int bigretId,HttpServletResponse response){
        List<EzdErlbigret> erlbigretList = ezdBigretService.getErlbigretList(bigretId);
        ObjectMapper mapper = new ObjectMapper();
        mapper.addMixInAnnotations(EzdErlbigret.class, BigretErlbigretFilter.class);
        mapper.addMixInAnnotations(EzdUmg.class, BigretUmgFilter.class);
        mapper.addMixInAnnotations(EzdUsers.class,BigretUsersFilter.class);
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mapper.writeValue(outputStream,erlbigretList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
