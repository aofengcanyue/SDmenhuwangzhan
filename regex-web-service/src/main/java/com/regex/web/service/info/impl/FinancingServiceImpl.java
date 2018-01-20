package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.FinancingDAO;
import com.regex.web.common.dto.info.FinancingDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.FinancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FinancingServiceImpl implements FinancingService{
    @Autowired
    private FinancingDAO financingDAO;
    @Override
    public long getFinancingDTORowCount(Assist assist){
        return financingDAO.getFinancingDTORowCount(assist);
    }
    @Override
    public List<FinancingDTO> selectFinancingDTO(Assist assist){
        return financingDAO.selectFinancingDTO(assist);
    }
    @Override
    public FinancingDTO selectFinancingDTOByObj(FinancingDTO obj){
        return financingDAO.selectFinancingDTOByObj(obj);
    }
    @Override
    public FinancingDTO selectFinancingDTOById(Long id){
        return financingDAO.selectFinancingDTOById(id);
    }
    @Override
    public int insertFinancingDTO(FinancingDTO value){
        return financingDAO.insertFinancingDTO(value);
    }
    @Override
    public int insertNonEmptyFinancingDTO(FinancingDTO value){
        return financingDAO.insertNonEmptyFinancingDTO(value);
    }
    @Override
    public int insertFinancingDTOByBatch(List<FinancingDTO> value){
        return financingDAO.insertFinancingDTOByBatch(value);
    }
    @Override
    public int deleteFinancingDTOById(Long id){
        return financingDAO.deleteFinancingDTOById(id);
    }
    @Override
    public int deleteFinancingDTO(Assist assist){
        return financingDAO.deleteFinancingDTO(assist);
    }
    @Override
    public int updateFinancingDTOById(FinancingDTO enti){
        return financingDAO.updateFinancingDTOById(enti);
    }
    @Override
    public int updateFinancingDTO(FinancingDTO value, Assist assist){
        return financingDAO.updateFinancingDTO(value,assist);
    }
    @Override
    public int updateNonEmptyFinancingDTOById(FinancingDTO enti){
        return financingDAO.updateNonEmptyFinancingDTOById(enti);
    }
    @Override
    public int updateNonEmptyFinancingDTO(FinancingDTO value, Assist assist){
        return financingDAO.updateNonEmptyFinancingDTO(value,assist);
    }

    public FinancingDAO getFinancingDAO() {
        return this.financingDAO;
    }

    public void setFinancingDAO(FinancingDAO financingDAO) {
        this.financingDAO = financingDAO;
    }

}