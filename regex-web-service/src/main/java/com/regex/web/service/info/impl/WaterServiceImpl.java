package com.regex.web.service.info.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.WaterDTO;
import com.regex.web.common.utils.QueryConditions;
import com.regex.web.dao.info.IWaterDAO;
import com.regex.web.service.info.IWaterService;

@Service
public class WaterServiceImpl implements IWaterService {
    
    @Autowired
    private IWaterDAO waterDAO;
    
    @Override
    public int insert(WaterDTO waterDTO) {

        return waterDAO.insert(waterDTO);
    }

    @Override
    public List<WaterDTO> selectByName(QueryConditions params) {
        
        return waterDAO.selectByName(params);
    }

    @Override
    public int selectCountByName(QueryConditions params) {
        
        return waterDAO.selectCountByName(params);
    }

    @Override
    public int updateById(WaterDTO waterDTO) {
        
        return waterDAO.updateById(waterDTO);
    }

    @Override
    public int del(long id) {
        
        return waterDAO.del(id);
    }

    @Override
    public WaterDTO selectById(long id) {
        
        return waterDAO.selectById(id);
    }

    @Override
    public List<WaterDTO> selectAll() {
        
        return waterDAO.selectAll();
    }
    
    @Override
    public long getWaterDTORowCount(Assist assist){
        return waterDAO.getWaterDTORowCount(assist);
    }
    @Override
    public List<WaterDTO> selectWaterDTO(Assist assist){
        return waterDAO.selectWaterDTO(assist);
    }
    @Override
    public WaterDTO selectWaterDTOByObj(WaterDTO obj){
        return waterDAO.selectWaterDTOByObj(obj);
    }
    @Override
    public WaterDTO selectWaterDTOById(Long id){
        return waterDAO.selectWaterDTOById(id);
    }
    @Override
    public int insertWaterDTO(WaterDTO value){
        return waterDAO.insertWaterDTO(value);
    }
    @Override
    public int insertNonEmptyWaterDTO(WaterDTO value){
        return waterDAO.insertNonEmptyWaterDTO(value);
    }
    @Override
    public int insertWaterDTOByBatch(List<WaterDTO> value){
        return waterDAO.insertWaterDTOByBatch(value);
    }
    @Override
    public int deleteWaterDTOById(Long id){
        return waterDAO.deleteWaterDTOById(id);
    }
    @Override
    public int deleteWaterDTO(Assist assist){
        return waterDAO.deleteWaterDTO(assist);
    }
    @Override
    public int updateWaterDTOById(WaterDTO enti){
        return waterDAO.updateWaterDTOById(enti);
    }
    @Override
    public int updateWaterDTO(WaterDTO value, Assist assist){
        return waterDAO.updateWaterDTO(value,assist);
    }
    @Override
    public int updateNonEmptyWaterDTOById(WaterDTO enti){
        return waterDAO.updateNonEmptyWaterDTOById(enti);
    }
    @Override
    public int updateNonEmptyWaterDTO(WaterDTO value, Assist assist){
        return waterDAO.updateNonEmptyWaterDTO(value,assist);
    }

    public IWaterDAO getIWaterDAO() {
        return this.waterDAO;
    }

    public void setIWaterDAO(IWaterDAO iWaterDAO) {
        this.waterDAO = iWaterDAO;
    }
}
