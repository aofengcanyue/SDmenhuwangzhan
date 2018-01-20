package com.regex.web.service.info.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.EnergySaveDTO;
import com.regex.web.common.utils.QueryConditions;
import com.regex.web.dao.info.IEnergySaveDAO;
import com.regex.web.service.info.IEnergySaveService;
@Service
public class EnergySaveServiceImpl implements IEnergySaveService {
    
    @Autowired
    private IEnergySaveDAO iEnergySaveDAO;
    
    public int insert(EnergySaveDTO energySaveDTO) {
       
        return iEnergySaveDAO.insert(energySaveDTO);
    }

   
    public List<EnergySaveDTO> selectByName(QueryConditions params) {
      
        return iEnergySaveDAO.selectByName(params);
    }

    
    public int selectCountByName(QueryConditions params) {
        
        return iEnergySaveDAO.selectCountByName(params);
    }


    @Override
    public int updateById(EnergySaveDTO energySaveDTO) {
        
        return iEnergySaveDAO.updateById(energySaveDTO);
    }


    @Override
    public int del(long id) {
        
        return iEnergySaveDAO.del(id);
    }


    @Override
    public List<EnergySaveDTO> selectAll() {
        
        return iEnergySaveDAO.selectAll();
    }


    @Override
    public EnergySaveDTO selectById(long id) {
        
        return iEnergySaveDAO.selectById(id);
    }

    @Override
    public long getEnergySaveDTORowCount(Assist assist){
        return iEnergySaveDAO.getEnergySaveDTORowCount(assist);
    }
    @Override
    public List<EnergySaveDTO> selectEnergySaveDTO(Assist assist){
        return iEnergySaveDAO.selectEnergySaveDTO(assist);
    }
    @Override
    public EnergySaveDTO selectEnergySaveDTOByObj(EnergySaveDTO obj){
        return iEnergySaveDAO.selectEnergySaveDTOByObj(obj);
    }
    @Override
    public EnergySaveDTO selectEnergySaveDTOById(Long id){
        return iEnergySaveDAO.selectEnergySaveDTOById(id);
    }
    @Override
    public int insertEnergySaveDTO(EnergySaveDTO value){
        return iEnergySaveDAO.insertEnergySaveDTO(value);
    }
    @Override
    public int insertNonEmptyEnergySaveDTO(EnergySaveDTO value){
        return iEnergySaveDAO.insertNonEmptyEnergySaveDTO(value);
    }
    @Override
    public int insertEnergySaveDTOByBatch(List<EnergySaveDTO> value){
        return iEnergySaveDAO.insertEnergySaveDTOByBatch(value);
    }
    @Override
    public int deleteEnergySaveDTOById(Long id){
        return iEnergySaveDAO.deleteEnergySaveDTOById(id);
    }
    @Override
    public int deleteEnergySaveDTO(Assist assist){
        return iEnergySaveDAO.deleteEnergySaveDTO(assist);
    }
    @Override
    public int updateEnergySaveDTOById(EnergySaveDTO enti){
        return iEnergySaveDAO.updateEnergySaveDTOById(enti);
    }
    @Override
    public int updateEnergySaveDTO(EnergySaveDTO value, Assist assist){
        return iEnergySaveDAO.updateEnergySaveDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEnergySaveDTOById(EnergySaveDTO enti){
        return iEnergySaveDAO.updateNonEmptyEnergySaveDTOById(enti);
    }
    @Override
    public int updateNonEmptyEnergySaveDTO(EnergySaveDTO value, Assist assist){
        return iEnergySaveDAO.updateNonEmptyEnergySaveDTO(value,assist);
    }

  

}
