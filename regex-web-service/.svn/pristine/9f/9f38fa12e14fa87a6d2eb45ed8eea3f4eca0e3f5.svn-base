package com.regex.web.service.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import com.regex.web.common.dto.sys.SysMenu;
import com.regex.web.dao.sys.SysMenuDao;
import com.regex.web.service.security.utils.AntUrlPathMatcher;
import com.regex.web.service.security.utils.UrlMatcher;

@Component("securityMetadataSource")
public class MyInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
	private UrlMatcher urlMatcher = new AntUrlPathMatcher();   
    private static Map<String, Collection<ConfigAttribute>> resourceMap = null;  
    
    @Autowired
    private SysMenuDao sysMenuDao;
    
    //tomcat启动时实例化一次  
    public MyInvocationSecurityMetadataSource() {  
//        loadResourceDefine();    
        }     
    //tomcat开启时加载一次，加载所有url和权限（或角色）的对应关系  
//    private void loadResourceDefine() {  
//        resourceMap = new HashMap<String, Collection<ConfigAttribute>>();   
//        Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();   
//        ConfigAttribute ca = new SecurityConfig("ROLE_ADMIN");  
//        atts.add(ca);
//        sysMenuDao.selectSysMenuByObj(null);
//        resourceMap.put("/index.htm", atts); 
//        Collection<ConfigAttribute> attsno =new ArrayList<ConfigAttribute>();  
//        ConfigAttribute cano = new SecurityConfig("ROLE_NO");  
//        attsno.add(cano);  
//        resourceMap.put("/login.htm", attsno);     
//        }    
 
    //参数是要访问的url，返回这个url对于的所有权限（或角色）  
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {   
        // 将参数转为url      
        String url = ((FilterInvocation)object).getRequestUrl();     
        
        if(resourceMap == null || resourceMap.size()==0) {
            resourceMap = new HashMap<String, Collection<ConfigAttribute>>();   
            Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();   
            ConfigAttribute ca = new SecurityConfig("ROLE_ADMIN");  
            atts.add(ca);
            List<SysMenu> menuList = sysMenuDao.selectSysMenu(null);
            for(SysMenu sysMenu : menuList) {
                resourceMap.put(sysMenu.getMenuUrl(), atts);
            }
            resourceMap.put("/index.htm", atts); 
            Collection<ConfigAttribute> attsno =new ArrayList<ConfigAttribute>();  
            ConfigAttribute cano = new SecurityConfig("ROLE_NO");  
            attsno.add(cano);  
            resourceMap.put("/login.htm", attsno);  
        }
        Iterator<String>ite = resourceMap.keySet().iterator();   
        while (ite.hasNext()) {           
            String resURL = ite.next();    
            if (urlMatcher.pathMatchesUrl(resURL, url)) {   
                return resourceMap.get(resURL);           
                }         
            }   
        return null;      
        }    
    public boolean supports(Class<?>clazz) {   
            return true;    
            }   
    public Collection<ConfigAttribute> getAllConfigAttributes() {   
        return null;    
        }  

}
