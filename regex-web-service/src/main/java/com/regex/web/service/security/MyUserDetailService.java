package com.regex.web.service.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.regex.web.common.dto.sys.SysRole;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.common.utils.DateStringConverter;
import com.regex.web.dao.sys.SysRoleDao;
import com.regex.web.dao.sys.SysUserDao;

@Service
public class MyUserDetailService implements UserDetailsService {
    
    @Autowired
    private SysUserDao sysUserDao;
    
    @Autowired
    private SysRoleDao sysRoleDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> auths=new ArrayList<GrantedAuthority>();   
		 
//		GrantedAuthorityImpl auth2=new GrantedAuthorityImpl("ROLE_ADMIN");   
//        GrantedAuthorityImpl auth1=new GrantedAuthorityImpl("ROLE_USER");   
		SysUser sysUser = sysUserDao.getByLoginName(username);
        if(sysUser != null){
            SysRole roleDTO = sysRoleDao.getById(sysUser.getRoleId());
            List<SysRole> roleList = new ArrayList<SysRole>();
            roleList.add(roleDTO);
            roleDTOList(roleDTO.getRoleId(), roleList);
            for(SysRole roleDTOTmp :  roleList) {
                GrantedAuthorityImpl auth1=new GrantedAuthorityImpl(roleDTOTmp.getRights());   
                auths=new ArrayList<GrantedAuthority>();   
                auths.add(auth1);
            }
        }       
 
        User user = new User(username, sysUser.getPassword(), true, true, true, true, auths);
        if(user!= null) {
            DateStringConverter dateToStr = new DateStringConverter();
            SysUser userTmp = new SysUser();
            userTmp.setLastLogin(dateToStr.convert(new Date()));
            userTmp.setUserId(sysUser.getUserId());
            sysUserDao.updateNonEmptySysUserById(userTmp);
        }
        return user;   
	}
	
	/**
	 * 
	 * 功能描述: <br>
	 * 获取权限
	 *
	 * @param parentId
	 * @param roleList
	 * @see [相关类/方法](可选)
	 * @since [产品/模块版本](可选)
	 */
	private void roleDTOList (String parentId, List<SysRole> roleList) {
	    List<SysRole> roleTmpList = sysRoleDao.getByParentId(parentId);
	    if(roleTmpList!= null && roleTmpList.size() != 0) {
	        roleList.addAll(roleTmpList);
	        for(SysRole roleDTO : roleTmpList) {
	            roleDTOList(roleDTO.getRoleId(), roleList);
	        }
	    }
	}

}
