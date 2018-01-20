package com.regex.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;

import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.service.sys.SysUserService;

public class BaseController {
    
    @Autowired
    private SysUserService sysUserService;
    
    public SysUser getCurrentUser(HttpServletRequest request) {
        SecurityContextImpl securityContextImpl = (SecurityContextImpl) request  
                .getSession().getAttribute("SPRING_SECURITY_CONTEXT");
        SysUser sysUser = null;
        if(securityContextImpl != null) {
            String loginName = securityContextImpl.getAuthentication().getName();
            SysUser sysUserTmp = new SysUser();
            sysUserTmp.setUsername(loginName);
            sysUser = sysUserService.selectSysUserByObj(sysUserTmp);
            request.getSession().setAttribute("sysUser", sysUser);
        }
        return sysUser;
    }
    
    /**
     * 
     * 功能描述: <br>
     * 获取系统路径
     *
     * @param request
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    protected String getBasePath(HttpServletRequest request) {
        return request.getScheme() + "://" + request.getServerName() + ":"
                + request.getServerPort() + request.getContextPath() + "/";
    }

}
