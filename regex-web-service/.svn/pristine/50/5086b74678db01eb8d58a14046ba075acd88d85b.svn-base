package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.SupplyEvaluationResultDAO;
import com.regex.web.common.dto.info.SupplyEvaluationResultDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.SupplyEvaluationResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SupplyEvaluationResultServiceImpl implements SupplyEvaluationResultService{
    @Autowired
    private SupplyEvaluationResultDAO supplyEvaluationResultDAO;
    @Override
    public long getSupplyEvaluationResultDTORowCount(Assist assist){
        return supplyEvaluationResultDAO.getSupplyEvaluationResultDTORowCount(assist);
    }
    @Override
    public List<SupplyEvaluationResultDTO> selectSupplyEvaluationResultDTO(Assist assist){
        return supplyEvaluationResultDAO.selectSupplyEvaluationResultDTO(assist);
    }
    @Override
    public SupplyEvaluationResultDTO selectSupplyEvaluationResultDTOByObj(SupplyEvaluationResultDTO obj){
        return supplyEvaluationResultDAO.selectSupplyEvaluationResultDTOByObj(obj);
    }
    @Override
    public SupplyEvaluationResultDTO selectSupplyEvaluationResultDTOById(Long id){
        return supplyEvaluationResultDAO.selectSupplyEvaluationResultDTOById(id);
    }
    @Override
    public int insertSupplyEvaluationResultDTO(SupplyEvaluationResultDTO value){
        return supplyEvaluationResultDAO.insertSupplyEvaluationResultDTO(value);
    }
    @Override
    public int insertNonEmptySupplyEvaluationResultDTO(SupplyEvaluationResultDTO value){
        return supplyEvaluationResultDAO.insertNonEmptySupplyEvaluationResultDTO(value);
    }
    @Override
    public int insertSupplyEvaluationResultDTOByBatch(List<SupplyEvaluationResultDTO> value){
        return supplyEvaluationResultDAO.insertSupplyEvaluationResultDTOByBatch(value);
    }
    @Override
    public int deleteSupplyEvaluationResultDTOById(Long id){
        return supplyEvaluationResultDAO.deleteSupplyEvaluationResultDTOById(id);
    }
    @Override
    public int deleteSupplyEvaluationResultDTO(Assist assist){
        return supplyEvaluationResultDAO.deleteSupplyEvaluationResultDTO(assist);
    }
    @Override
    public int updateSupplyEvaluationResultDTOById(SupplyEvaluationResultDTO enti){
        return supplyEvaluationResultDAO.updateSupplyEvaluationResultDTOById(enti);
    }
    @Override
    public int updateSupplyEvaluationResultDTO(SupplyEvaluationResultDTO value, Assist assist){
        return supplyEvaluationResultDAO.updateSupplyEvaluationResultDTO(value,assist);
    }
    @Override
    public int updateNonEmptySupplyEvaluationResultDTOById(SupplyEvaluationResultDTO enti){
        return supplyEvaluationResultDAO.updateNonEmptySupplyEvaluationResultDTOById(enti);
    }
    @Override
    public int updateNonEmptySupplyEvaluationResultDTO(SupplyEvaluationResultDTO value, Assist assist){
        return supplyEvaluationResultDAO.updateNonEmptySupplyEvaluationResultDTO(value,assist);
    }

    public SupplyEvaluationResultDAO getSupplyEvaluationResultDAO() {
        return this.supplyEvaluationResultDAO;
    }

    public void setSupplyEvaluationResultDAO(SupplyEvaluationResultDAO supplyEvaluationResultDAO) {
        this.supplyEvaluationResultDAO = supplyEvaluationResultDAO;
    }

}