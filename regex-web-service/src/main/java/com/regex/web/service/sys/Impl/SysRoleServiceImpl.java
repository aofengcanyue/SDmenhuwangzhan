package com.regex.web.service.sys.Impl;
import java.util.List;
import com.regex.web.dao.sys.SysRoleDao;
import com.regex.web.common.dto.sys.SysRole;
import com.regex.web.common.Assist;
import com.regex.web.service.sys.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysRoleServiceImpl implements SysRoleService{
    @Autowired
    private SysRoleDao sysRoleDao;
    @Override
    public long getSysRoleRowCount(Assist assist){
        return sysRoleDao.getSysRoleRowCount(assist);
    }
    @Override
    public List<SysRole> selectSysRole(Assist assist){
        return sysRoleDao.selectSysRole(assist);
    }
    @Override
    public SysRole selectSysRoleByObj(SysRole obj){
        return sysRoleDao.selectSysRoleByObj(obj);
    }
    @Override
    public SysRole selectSysRoleById(String id){
        return sysRoleDao.selectSysRoleById(id);
    }
    @Override
    public int insertSysRole(SysRole value){
        return sysRoleDao.insertSysRole(value);
    }
    @Override
    public int insertNonEmptySysRole(SysRole value){
        return sysRoleDao.insertNonEmptySysRole(value);
    }
    @Override
    public int insertSysRoleByBatch(List<SysRole> value){
        return sysRoleDao.insertSysRoleByBatch(value);
    }
    @Override
    public int deleteSysRoleById(String id){
        return sysRoleDao.deleteSysRoleById(id);
    }
    @Override
    public int deleteSysRole(Assist assist){
        return sysRoleDao.deleteSysRole(assist);
    }
    @Override
    public int updateSysRoleById(SysRole enti){
        return sysRoleDao.updateSysRoleById(enti);
    }
    @Override
    public int updateSysRole(SysRole value, Assist assist){
        return sysRoleDao.updateSysRole(value,assist);
    }
    @Override
    public int updateNonEmptySysRoleById(SysRole enti){
        return sysRoleDao.updateNonEmptySysRoleById(enti);
    }
    @Override
    public int updateNonEmptySysRole(SysRole value, Assist assist){
        return sysRoleDao.updateNonEmptySysRole(value,assist);
    }

    public SysRoleDao getSysRoleDao() {
        return this.sysRoleDao;
    }

    public void setSysRoleDao(SysRoleDao sysRoleDao) {
        this.sysRoleDao = sysRoleDao;
    }

}