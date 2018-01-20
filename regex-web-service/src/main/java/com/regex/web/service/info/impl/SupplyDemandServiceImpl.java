package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.SupplyDemandDAO;
import com.regex.web.common.dto.info.SupplyDemandDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.SupplyDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SupplyDemandServiceImpl implements SupplyDemandService{
    @Autowired
    private SupplyDemandDAO supplyDemandDAO;
    @Override
    public long getSupplyDemandDTORowCount(Assist assist){
        return supplyDemandDAO.getSupplyDemandDTORowCount(assist);
    }
    @Override
    public List<SupplyDemandDTO> selectSupplyDemandDTO(Assist assist){
        return supplyDemandDAO.selectSupplyDemandDTO(assist);
    }
    @Override
    public SupplyDemandDTO selectSupplyDemandDTOByObj(SupplyDemandDTO obj){
        return supplyDemandDAO.selectSupplyDemandDTOByObj(obj);
    }
    @Override
    public SupplyDemandDTO selectSupplyDemandDTOById(Long id){
        return supplyDemandDAO.selectSupplyDemandDTOById(id);
    }
    @Override
    public int insertSupplyDemandDTO(SupplyDemandDTO value){
        return supplyDemandDAO.insertSupplyDemandDTO(value);
    }
    @Override
    public int insertNonEmptySupplyDemandDTO(SupplyDemandDTO value){
        return supplyDemandDAO.insertNonEmptySupplyDemandDTO(value);
    }
    @Override
    public int insertSupplyDemandDTOByBatch(List<SupplyDemandDTO> value){
        return supplyDemandDAO.insertSupplyDemandDTOByBatch(value);
    }
    @Override
    public int deleteSupplyDemandDTOById(Long id){
        return supplyDemandDAO.deleteSupplyDemandDTOById(id);
    }
    @Override
    public int deleteSupplyDemandDTO(Assist assist){
        return supplyDemandDAO.deleteSupplyDemandDTO(assist);
    }
    @Override
    public int updateSupplyDemandDTOById(SupplyDemandDTO enti){
        return supplyDemandDAO.updateSupplyDemandDTOById(enti);
    }
    @Override
    public int updateSupplyDemandDTO(SupplyDemandDTO value, Assist assist){
        return supplyDemandDAO.updateSupplyDemandDTO(value,assist);
    }
    @Override
    public int updateNonEmptySupplyDemandDTOById(SupplyDemandDTO enti){
        return supplyDemandDAO.updateNonEmptySupplyDemandDTOById(enti);
    }
    @Override
    public int updateNonEmptySupplyDemandDTO(SupplyDemandDTO value, Assist assist){
        return supplyDemandDAO.updateNonEmptySupplyDemandDTO(value,assist);
    }

    public SupplyDemandDAO getSupplyDemandDAO() {
        return this.supplyDemandDAO;
    }

    public void setSupplyDemandDAO(SupplyDemandDAO supplyDemandDAO) {
        this.supplyDemandDAO = supplyDemandDAO;
    }

}