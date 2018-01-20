package com.regex.web.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.service.sys.SysUserService;

@Controller
@RequestMapping("web/expert")
public class WebExpertController {
    
    @Autowired
    public SysUserService sysUserService;
    
    /**
     * 
     * 功能描述: <br>
     * 用户展示
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, @ModelAttribute("assist") Assist assist) {
        assist.setRequires(Assist.andEq("STATUS", "0"));
        assist.setRequires(Assist.andEq("RIGHTS", "ROLE_EXPERT"));
        List<SysUser> datas = sysUserService.selectSysUser(assist);
        model.addAttribute("datas", datas);
        return "web/expert/show";
    }

}
