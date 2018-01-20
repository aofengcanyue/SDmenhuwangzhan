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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.sys.SysRole;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.controller.vo.PageVO;
import com.regex.web.service.sys.SysRoleService;
import com.regex.web.service.sys.SysUserService;
import com.regex.web.utils.AjaxUtil;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 用户管理
 *
 * @author ocean
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Controller
@RequestMapping("sys/user")
public class SysUserController {
    
    @Autowired
    public SysUserService sysUserService;
    
    @Autowired
    public SysRoleService sysRoleService;
    
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
//        assist.setOrder(Assist.order("is_top", false));
        assist.setRequires(Assist.andEq("STATUS", "0"));
        List<SysUser> datas = sysUserService.selectSysUser(assist);
        model.addAttribute("datas", datas);
        return "admin/user/show";
    }
    
    @RequestMapping(value = "getPage", method = RequestMethod.POST)
    @ResponseBody
    public void getPage(Model model, @ModelAttribute("assist") Assist assist, HttpServletResponse response, int sEcho,
            String columns, String iDisplayStart, String iDisplayLength, String sSearch) {
        if(StringUtils.isEmpty(iDisplayLength)) {
            iDisplayLength = "10";
        }
        assist.setRowSize(Integer.parseInt(iDisplayLength));
        if(StringUtils.isEmpty(iDisplayStart)) {
            iDisplayStart = "0";
        }
        if(StringUtils.isNotEmpty(sSearch)) {
            assist.setRequires(Assist.customRequire("and name like concat('%',", sSearch, ",'%')"));
        }
        assist.setStartRow(Integer.parseInt(iDisplayStart));
        List<SysUser> datas = sysUserService.selectSysUser(assist);
//        for(SysUser SysUser : datas) {
//            trainingDTO.setType(typeMap.get(trainingDTO.getType()));
//        }
        long totalCount = sysUserService.getSysUserRowCount(assist);
        model.addAttribute("data", datas);
        PageVO<SysUser> mData = new PageVO<SysUser>();
        mData.setAaData(datas);
        mData.setsEcho(sEcho);
        mData.setiTotalRecords(totalCount);
        mData.setiTotalDisplayRecords(totalCount);
        AjaxUtil.ajaxJsonSucMessage(response, mData);
    }
    
    /**
     * 
     * 功能描述: <br>
     * 新增/修改用户
     *
     * @param model
     * @param id
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("input")
    public String input(Model model, String id) {
        if(StringUtils.isNotEmpty(id)) {
            SysUser sysUser = sysUserService.selectSysUserById(id);
            model.addAttribute("sysUser", sysUser);
        }
        List<SysRole> roleList = sysRoleService.selectSysRole(null);
        model.addAttribute("roleList", roleList);
        return "admin/user/input";
    }
    
    /**
     * 
     * 功能描述: <br>
     * 保存
     *
     * @param sysUser
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("save")
    public void save(SysUser sysUser, HttpServletResponse response) {
        int n = 0;
        try {
        if(StringUtils.isNotEmpty(sysUser.getUsername()) && StringUtils.isNotEmpty(sysUser.getName())
                && StringUtils.isNotEmpty(sysUser.getRoleId())) {
            SysRole sysRole = sysRoleService.selectSysRoleById(sysUser.getRoleId());
            sysUser.setRights(sysRole.getRights());
            if(StringUtils.isNotEmpty(sysUser.getUserId())) {
                n = sysUserService.updateNonEmptySysUserById(sysUser);
            } else {
                sysUser.setUserId(randomUUID());
                sysUser.setStatus("0");
                n = sysUserService.insertSysUser(sysUser);
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
     * 删除
     *
     * @param id
     * @param response
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    @RequestMapping("del")
    public void del(String id, HttpServletResponse response) {
        int n = 0;
        SysUser sysUser = sysUserService.selectSysUserById(id);
        sysUser.setStatus("1");
        n = sysUserService.updateNonEmptySysUserById(sysUser);
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
