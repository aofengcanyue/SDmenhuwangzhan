package com.regex.web.service.sys.Impl;
import java.util.List;
import com.regex.web.dao.sys.SysRoleFhbuttonDao;
import com.regex.web.common.dto.sys.SysRoleFhbutton;
import com.regex.web.common.Assist;
import com.regex.web.service.sys.SysRoleFhbuttonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysRoleFhbuttonServiceImpl implements SysRoleFhbuttonService{
    @Autowired
    private SysRoleFhbuttonDao sysRoleFhbuttonDao;
    @Override
    public long getSysRoleFhbuttonRowCount(Assist assist){
        return sysRoleFhbuttonDao.getSysRoleFhbuttonRowCount(assist);
    }
    @Override
    public List<SysRoleFhbutton> selectSysRoleFhbutton(Assist assist){
        return sysRoleFhbuttonDao.selectSysRoleFhbutton(assist);
    }
    @Override
    public SysRoleFhbutton selectSysRoleFhbuttonByObj(SysRoleFhbutton obj){
        return sysRoleFhbuttonDao.selectSysRoleFhbuttonByObj(obj);
    }
    @Override
    public SysRoleFhbutton selectSysRoleFhbuttonById(String id){
        return sysRoleFhbuttonDao.selectSysRoleFhbuttonById(id);
    }
    @Override
    public int insertSysRoleFhbutton(SysRoleFhbutton value){
        return sysRoleFhbuttonDao.insertSysRoleFhbutton(value);
    }
    @Override
    public int insertNonEmptySysRoleFhbutton(SysRoleFhbutton value){
        return sysRoleFhbuttonDao.insertNonEmptySysRoleFhbutton(value);
    }
    @Override
    public int insertSysRoleFhbuttonByBatch(List<SysRoleFhbutton> value){
        return sysRoleFhbuttonDao.insertSysRoleFhbuttonByBatch(value);
    }
    @Override
    public int deleteSysRoleFhbuttonById(String id){
        return sysRoleFhbuttonDao.deleteSysRoleFhbuttonById(id);
    }
    @Override
    public int deleteSysRoleFhbutton(Assist assist){
        return sysRoleFhbuttonDao.deleteSysRoleFhbutton(assist);
    }
    @Override
    public int updateSysRoleFhbuttonById(SysRoleFhbutton enti){
        return sysRoleFhbuttonDao.updateSysRoleFhbuttonById(enti);
    }
    @Override
    public int updateSysRoleFhbutton(SysRoleFhbutton value, Assist assist){
        return sysRoleFhbuttonDao.updateSysRoleFhbutton(value,assist);
    }
    @Override
    public int updateNonEmptySysRoleFhbuttonById(SysRoleFhbutton enti){
        return sysRoleFhbuttonDao.updateNonEmptySysRoleFhbuttonById(enti);
    }
    @Override
    public int updateNonEmptySysRoleFhbutton(SysRoleFhbutton value, Assist assist){
        return sysRoleFhbuttonDao.updateNonEmptySysRoleFhbutton(value,assist);
    }

    public SysRoleFhbuttonDao getSysRoleFhbuttonDao() {
        return this.sysRoleFhbuttonDao;
    }

    public void setSysRoleFhbuttonDao(SysRoleFhbuttonDao sysRoleFhbuttonDao) {
        this.sysRoleFhbuttonDao = sysRoleFhbuttonDao;
    }

}