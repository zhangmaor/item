package com.ezd.controller.background;

import com.ezd.model.EzdBigret;
import com.ezd.service.EzdBigretService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */
@Controller
@RequestMapping("/bg")
public class BgBigret {
    @Resource
    private EzdBigretService ezdBigretService;

    @RequestMapping("/index")
    public String aaaa(HttpServletRequest request) {
        System.out.println("aaaaaa");
        return "sxgl";
    }

    /**
     * 进入大招会列表页面
     */
    @RequestMapping("/bigret")
    public String displayBigret(HttpServletRequest request, Model model) {
        List<EzdBigret> bigretList = ezdBigretService.getAll();//这个有问题吧！！！
        HttpSession session = request.getSession();
        session.setAttribute("list", bigretList);
        List<EzdBigret> bigretList1 = ezdBigretService.modeGet(1);
        for (EzdBigret e:bigretList1
             ) {
            System.out.println("eeee="+e);
            System.out.println("eeqq="+e.getBigretEnmg());
        }

        System.out.println(bigretList);
        return "indexTest";
    }

    /**
     * 点击其中一个大招会信息
     * 进入大招会详情
     */
    @RequestMapping("/bigretDetail")
    public String datail(HttpServletRequest request, int id, Model model) {
        //EzdBigret ezdBigret = ezdBigretService.get(id);
        List<EzdBigret> list = (List<EzdBigret>) request.getSession().getAttribute("list");
        for (EzdBigret e : list
                ) {
            if (e.getBigretId() == id) {
                model.addAttribute("ezdBigret", e);
            }
        }

        return "forward:redirectBig";
    }

    @RequestMapping("/redirectBig")
    public String da(Model model) {
        // Map<String, Object> stringObjectMap = model.asMap();
        //System.out.println(stringObjectMap.get("list"));
        return "bret";
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
     * 提交修改的数据
     * 看返回值
     *
     * @param
     * @param ezdBigret
     * @param id
     */

    @RequestMapping("/actionUpdate")
    @ResponseBody
    public boolean actionUp(EzdBigret ezdBigret, int id) {
        boolean update = ezdBigretService.update(ezdBigret, id);
        return update;
    }

    /**
     * 进入添加页面
     *
     * @return
     */
    @RequestMapping("/insert")
    public String getAdd() {
        return "";
    }

    /**
     * 提交添加页面
     *
     * @param ezdBigret
     * @return
     */
    @RequestMapping("/actionInsert")
    public String add(EzdBigret ezdBigret, Model model) {
        boolean add = ezdBigretService.add(ezdBigret);
        model.addAttribute("result", add);
        return "";
    }
}
