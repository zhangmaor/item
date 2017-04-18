package com.ezd.Controller.background;

import com.ezd.model.EzdEnmg;
import com.ezd.service.EzdEnmgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/4/18.
 */
@Controller
@RequestMapping("/bgEnmg")
public class BgEnmg {
    @Resource
    private EzdEnmgService ezdEnmgService;

    /**
     * 通过指定的企业编号获取指定的信息
     * 比如修改企业信息的时候，
     * 显示企业详细信息的时候；
     * @param request
     * @param id
     * @param model
     */
    private void getOneEnmg(HttpServletRequest request,int id ,Model model){
        EzdEnmg ezdEnmg = null;
        try {
            List<EzdEnmg> enmgs = (List<EzdEnmg>) request.getSession().getAttribute("enmgList");
            for (EzdEnmg e : enmgs) {
                //循环，将enmgs里面的每个元素的EnmgId与id进行比较
                if (e.getEnmgId() == id) {
                    ezdEnmg = e;//如果成立的话就将该元素赋给ezdEnmg
                    break; //并且循环结束
                }
            }
        } catch (Exception e) {
            //如果enmgs是空的话就会通过id从数据库中重新查询数据
            e.printStackTrace();
            ezdEnmg = ezdEnmgService.getEnmg(id);
        } finally {
            model.addAttribute("enmg", ezdEnmg);
        }
    }
    /**
     * 进入企业列表的页面
     *
     * @param request
     * @return
     */
    @RequestMapping("/enmg")
    public String getEnmg(HttpServletRequest request) {
        List<EzdEnmg> all = ezdEnmgService.getAll();
        HttpSession session = request.getSession();
        session.setAttribute("enmgList", all);
        return "";
    }

    /**
     * 点击某一个企业，然后就执行这个方法
     * 进入详细的企业信息列表
     * @param request
     * @param id   ----- 点击的那个企业的详细信息
     * @param model ---- 存储该企业的详细信息（全部信息）
     * @return
     */
    @RequestMapping("/getEnmg")
    public String getEnmg(HttpServletRequest request, int id, Model model) {
        this.getOneEnmg(request,id,model);
        return "";
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
     * 创建（添加，生成）一个企业
     * @param ezdEnmg
     * @return
     */
    @RequestMapping("/add")
    @ResponseBody
    public boolean add(EzdEnmg ezdEnmg){
        boolean add = ezdEnmgService.add(ezdEnmg);
        return add;
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
        this.getOneEnmg(request,id,model);
        return "";
    }

    /**
     * 对修改进行提交
     * @param ezdEnmg  ---修改后的一部分信息
     * @return
     */
    @RequestMapping("/update")
    @ResponseBody
    public boolean update(EzdEnmg ezdEnmg){
        EzdEnmg enmg = ezdEnmgService.getEnmg(ezdEnmg.getEnmgId());
        boolean update = ezdEnmgService.update(enmg, ezdEnmg);
        return update;
    }


}
