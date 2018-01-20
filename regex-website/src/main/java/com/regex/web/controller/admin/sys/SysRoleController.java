package com.regex.web.controller.admin.sys;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.sys.SysRole;
import com.regex.web.service.sys.SysRoleService;
import com.regex.web.utils.AjaxUtil;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 权限展示
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/role")
public class SysRoleController {
    
    @Autowired
    public SysRoleService sysRoleService;
    
    /**
     * 
     * 功能描述: <br>
     * 展示
     *
     * @param model
     * @param assist
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("show")
    public String show(Model model, @ModelAttribute("assist") Assist assist) {
        try {
            List<SysRole> datas = sysRoleService.selectSysRole(assist);
            model.addAttribute("datas", datas);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return "admin/role/show";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 去修改或新增
     *
     * @param id
     * @param model
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("input")
    public String input(String id, Model model) {
        if(StringUtils.isNotEmpty(id)) {
            SysRole sysRole = sysRoleService.selectSysRoleById(id);
            model.addAttribute("sysRole", sysRole);
        }
        return "admin/role/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param SysRole
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(SysRole sysRole, HttpServletResponse response) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(sysRole.getRoleName()) && StringUtils.isNotEmpty(sysRole.getRights())
                ) {
            if(StringUtils.isNotEmpty(sysRole.getRoleId())) {
                n = sysRoleService.updateNonEmptySysRoleById(sysRole);
            } else {
                sysRole.setRoleId(randomUUID());
                n = sysRoleService.insertSysRole(sysRole);
            }
        } else {
            n = 2;
        }
        } catch(Exception e) {
            e.printStackTrace();
            n = 3;
        }
        AjaxUtil.ajaxJsonSucMessage(response, n);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 生成uuid
     *
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    private static String randomUUID() {  
        return UUID.randomUUID().toString().replace("-", "");  
    }  

}
