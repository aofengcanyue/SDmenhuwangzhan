package com.regex.web.service.sys.Impl;
import java.util.List;
import com.regex.web.dao.sys.SysUserDao;
import com.regex.web.common.dto.sys.SysUser;
import com.regex.web.common.Assist;
import com.regex.web.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserDao sysUserDao;
    @Override
    public long getSysUserRowCount(Assist assist){
        return sysUserDao.getSysUserRowCount(assist);
    }
    @Override
    public List<SysUser> selectSysUser(Assist assist){
        return sysUserDao.selectSysUser(assist);
    }
    @Override
    public SysUser selectSysUserByObj(SysUser obj){
        return sysUserDao.selectSysUserByObj(obj);
    }
    @Override
    public SysUser selectSysUserById(String id){
        return sysUserDao.selectSysUserById(id);
    }
    @Override
    public int insertSysUser(SysUser value){
        return sysUserDao.insertSysUser(value);
    }
    @Override
    public int insertNonEmptySysUser(SysUser value){
        return sysUserDao.insertNonEmptySysUser(value);
    }
    @Override
    public int insertSysUserByBatch(List<SysUser> value){
        return sysUserDao.insertSysUserByBatch(value);
    }
    @Override
    public int deleteSysUserById(String id){
        return sysUserDao.deleteSysUserById(id);
    }
    @Override
    public int deleteSysUser(Assist assist){
        return sysUserDao.deleteSysUser(assist);
    }
    @Override
    public int updateSysUserById(SysUser enti){
        return sysUserDao.updateSysUserById(enti);
    }
    @Override
    public int updateSysUser(SysUser value, Assist assist){
        return sysUserDao.updateSysUser(value,assist);
    }
    @Override
    public int updateNonEmptySysUserById(SysUser enti){
        return sysUserDao.updateNonEmptySysUserById(enti);
    }
    @Override
    public int updateNonEmptySysUser(SysUser value, Assist assist){
        return sysUserDao.updateNonEmptySysUser(value,assist);
    }

    public SysUserDao getSysUserDao() {
        return this.sysUserDao;
    }

    public void setSysUserDao(SysUserDao sysUserDao) {
        this.sysUserDao = sysUserDao;
    }

}