package com.regex.web.service.sys.Impl;
import java.util.List;
import com.regex.web.dao.sys.SysMenuDao;
import com.regex.web.common.Assist;
import com.regex.web.common.dto.sys.SysMenu;
import com.regex.web.service.sys.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysMenuServiceImpl implements SysMenuService{
    @Autowired
    private SysMenuDao sysMenuDao;
    @Override
    public long getSysMenuRowCount(Assist assist){
        return sysMenuDao.getSysMenuRowCount(assist);
    }
    @Override
    public List<SysMenu> selectSysMenu(Assist assist){
        return sysMenuDao.selectSysMenu(assist);
    }
    @Override
    public SysMenu selectSysMenuByObj(SysMenu obj){
        return sysMenuDao.selectSysMenuByObj(obj);
    }
    @Override
    public SysMenu selectSysMenuById(Integer id){
        return sysMenuDao.selectSysMenuById(id);
    }
    @Override
    public int insertSysMenu(SysMenu value){
        return sysMenuDao.insertSysMenu(value);
    }
    @Override
    public int insertNonEmptySysMenu(SysMenu value){
        return sysMenuDao.insertNonEmptySysMenu(value);
    }
    @Override
    public int insertSysMenuByBatch(List<SysMenu> value){
        return sysMenuDao.insertSysMenuByBatch(value);
    }
    @Override
    public int deleteSysMenuById(Integer id){
        return sysMenuDao.deleteSysMenuById(id);
    }
    @Override
    public int deleteSysMenu(Assist assist){
        return sysMenuDao.deleteSysMenu(assist);
    }
    @Override
    public int updateSysMenuById(SysMenu enti){
        return sysMenuDao.updateSysMenuById(enti);
    }
    @Override
    public int updateSysMenu(SysMenu value, Assist assist){
        return sysMenuDao.updateSysMenu(value,assist);
    }
    @Override
    public int updateNonEmptySysMenuById(SysMenu enti){
        return sysMenuDao.updateNonEmptySysMenuById(enti);
    }
    @Override
    public int updateNonEmptySysMenu(SysMenu value, Assist assist){
        return sysMenuDao.updateNonEmptySysMenu(value,assist);
    }

    public SysMenuDao getSysMenuDao() {
        return this.sysMenuDao;
    }

    public void setSysMenuDao(SysMenuDao sysMenuDao) {
        this.sysMenuDao = sysMenuDao;
    }

}