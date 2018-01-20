package com.regex.web.service.sys.Impl;
import java.util.List;
import com.regex.web.dao.sys.SysFhbuttonDao;
import com.regex.web.common.dto.sys.SysFhbutton;
import com.regex.web.common.Assist;
import com.regex.web.service.sys.SysFhbuttonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SysFhbuttonServiceImpl implements SysFhbuttonService{
    @Autowired
    private SysFhbuttonDao sysFhbuttonDao;
    @Override
    public long getSysFhbuttonRowCount(Assist assist){
        return sysFhbuttonDao.getSysFhbuttonRowCount(assist);
    }
    @Override
    public List<SysFhbutton> selectSysFhbutton(Assist assist){
        return sysFhbuttonDao.selectSysFhbutton(assist);
    }
    @Override
    public SysFhbutton selectSysFhbuttonByObj(SysFhbutton obj){
        return sysFhbuttonDao.selectSysFhbuttonByObj(obj);
    }
    @Override
    public SysFhbutton selectSysFhbuttonById(String id){
        return sysFhbuttonDao.selectSysFhbuttonById(id);
    }
    @Override
    public int insertSysFhbutton(SysFhbutton value){
        return sysFhbuttonDao.insertSysFhbutton(value);
    }
    @Override
    public int insertNonEmptySysFhbutton(SysFhbutton value){
        return sysFhbuttonDao.insertNonEmptySysFhbutton(value);
    }
    @Override
    public int insertSysFhbuttonByBatch(List<SysFhbutton> value){
        return sysFhbuttonDao.insertSysFhbuttonByBatch(value);
    }
    @Override
    public int deleteSysFhbuttonById(String id){
        return sysFhbuttonDao.deleteSysFhbuttonById(id);
    }
    @Override
    public int deleteSysFhbutton(Assist assist){
        return sysFhbuttonDao.deleteSysFhbutton(assist);
    }
    @Override
    public int updateSysFhbuttonById(SysFhbutton enti){
        return sysFhbuttonDao.updateSysFhbuttonById(enti);
    }
    @Override
    public int updateSysFhbutton(SysFhbutton value, Assist assist){
        return sysFhbuttonDao.updateSysFhbutton(value,assist);
    }
    @Override
    public int updateNonEmptySysFhbuttonById(SysFhbutton enti){
        return sysFhbuttonDao.updateNonEmptySysFhbuttonById(enti);
    }
    @Override
    public int updateNonEmptySysFhbutton(SysFhbutton value, Assist assist){
        return sysFhbuttonDao.updateNonEmptySysFhbutton(value,assist);
    }

    public SysFhbuttonDao getSysFhbuttonDao() {
        return this.sysFhbuttonDao;
    }

    public void setSysFhbuttonDao(SysFhbuttonDao sysFhbuttonDao) {
        this.sysFhbuttonDao = sysFhbuttonDao;
    }

}