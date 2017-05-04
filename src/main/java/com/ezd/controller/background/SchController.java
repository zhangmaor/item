package com.ezd.controller.background;

import com.ezd.model.EzdSchmg;
import com.ezd.model.EzdSchtype;
import com.ezd.service.EzdSchTypeService;
import com.ezd.service.EzdSchmgService;
import com.ezd.utils.Upload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Creministrator on 2017/4/19.
 * 学校处理模块
 */
@Controller
@RequestMapping("/bgSchmg")
public class SchController {

    @Resource
    private EzdSchmgService ezdSchmgService;
    @Resource
    private EzdSchTypeService ezdSchTypeService;



    // 获取所有 学校信息
    @GetMapping
    private String  findScg(Model model){

        List<EzdSchmg> ezdSchmgs = new ArrayList<EzdSchmg>();
        List<EzdSchtype> ezdSchtypes = new ArrayList<EzdSchtype>();

        ezdSchmgs =  ezdSchmgService.findAll();

        ezdSchtypes = ezdSchTypeService.findSchType();

        model.addAttribute("shmgs",ezdSchmgs);
        model.addAttribute("types",ezdSchtypes);

        return "xxgl";
    }

    //根据条件查询学校信息bgSchmg
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    @ResponseBody
    private List<EzdSchmg> search(String name, int cengci){
/*
        System.out.println("name ="+ name + "type="+ cengci );*/

        EzdSchmg ezdSchmg = new EzdSchmg();
        ezdSchmg.setSchmgName(name);

        ezdSchmg.setTypeId(cengci);
/*
        System.out.println("name ===" + ezdSchmg.getSchmgName());*/

        List<EzdSchmg> ezdSchmgs = ezdSchmgService.findSchmg(ezdSchmg);

    /*    for(EzdSchmg s :ezdSchmgs ){
            System.out.println(s.getSchmgName()+"======="+s.getEzdBigrets().size());

            System.out.println("ezdshcmg==="+s);
        }*/

        return ezdSchmgs;
    }

    /**
     * 添加学校信息
     * @param ezdSchmg 学校信息
     * @return
     */
    @RequestMapping("/addSchmg")
    private String  insertSchmg(EzdSchmg ezdSchmg,@RequestParam("file") MultipartFile  file,  HttpServletRequest request)  {

        Upload upload = new Upload();
        String url;
       try{
           url = upload.fildUpload(ezdSchmg.getSchmgName(),file,request,3);
           System.out.println(url);
           ezdSchmg.setSchmgLogo(url);

       }catch (Exception e){
           e.printStackTrace();
       }
        String name = file.getOriginalFilename();

       request.getSession().setAttribute("status",666);
       System.out.println(" this is ezdSchmg== "+ezdSchmg.toString());

       boolean res = ezdSchmgService.insertSchmg(ezdSchmg);
       System.out.println(res);
       return "redirect:/enret/index";
    }

    @RequestMapping("/updateSchmg")
    @ResponseBody
    private boolean  updateSchmg(EzdSchmg ezdSchmg){
        System.out.println(ezdSchmg.toString());
        boolean res = ezdSchmgService.updateSchmg(ezdSchmg);

        if(res){
            return res;
        }
        return false;
    }

    @RequestMapping("/del/{id}")
    @ResponseBody
    public boolean del(@PathVariable int id){
        System.out.println("=========="+id);
        if(ezdSchmgService.del(id))
            return true;
        return false;
    }

}
