package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.EfficiencyDAO;
import com.regex.web.common.dto.info.EfficiencyDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.EfficiencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EfficiencyServiceImpl implements EfficiencyService{
    @Autowired
    private EfficiencyDAO efficiencyDAO;
    @Override
    public long getEfficiencyDTORowCount(Assist assist){
        return efficiencyDAO.getEfficiencyDTORowCount(assist);
    }
    @Override
    public List<EfficiencyDTO> selectEfficiencyDTO(Assist assist){
        return efficiencyDAO.selectEfficiencyDTO(assist);
    }
    @Override
    public EfficiencyDTO selectEfficiencyDTOByObj(EfficiencyDTO obj){
        return efficiencyDAO.selectEfficiencyDTOByObj(obj);
    }
    @Override
    public EfficiencyDTO selectEfficiencyDTOById(Long id){
        return efficiencyDAO.selectEfficiencyDTOById(id);
    }
    @Override
    public int insertEfficiencyDTO(EfficiencyDTO value){
        return efficiencyDAO.insertEfficiencyDTO(value);
    }
    @Override
    public int insertNonEmptyEfficiencyDTO(EfficiencyDTO value){
        return efficiencyDAO.insertNonEmptyEfficiencyDTO(value);
    }
    @Override
    public int insertEfficiencyDTOByBatch(List<EfficiencyDTO> value){
        return efficiencyDAO.insertEfficiencyDTOByBatch(value);
    }
    @Override
    public int deleteEfficiencyDTOById(Long id){
        return efficiencyDAO.deleteEfficiencyDTOById(id);
    }
    @Override
    public int deleteEfficiencyDTO(Assist assist){
        return efficiencyDAO.deleteEfficiencyDTO(assist);
    }
    @Override
    public int updateEfficiencyDTOById(EfficiencyDTO enti){
        return efficiencyDAO.updateEfficiencyDTOById(enti);
    }
    @Override
    public int updateEfficiencyDTO(EfficiencyDTO value, Assist assist){
        return efficiencyDAO.updateEfficiencyDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEfficiencyDTOById(EfficiencyDTO enti){
        return efficiencyDAO.updateNonEmptyEfficiencyDTOById(enti);
    }
    @Override
    public int updateNonEmptyEfficiencyDTO(EfficiencyDTO value, Assist assist){
        return efficiencyDAO.updateNonEmptyEfficiencyDTO(value,assist);
    }

    public EfficiencyDAO getEfficiencyDAO() {
        return this.efficiencyDAO;
    }

    public void setEfficiencyDAO(EfficiencyDAO efficiencyDAO) {
        this.efficiencyDAO = efficiencyDAO;
    }

}