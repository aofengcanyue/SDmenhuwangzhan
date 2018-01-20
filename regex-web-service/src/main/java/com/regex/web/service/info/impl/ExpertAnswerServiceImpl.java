package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.ExpertAnswerDAO;
import com.regex.web.common.dto.info.ExpertAnswerDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.ExpertAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ExpertAnswerServiceImpl implements ExpertAnswerService{
    @Autowired
    private ExpertAnswerDAO expertAnswerDAO;
    @Override
    public long getExpertAnswerDTORowCount(Assist assist){
        return expertAnswerDAO.getExpertAnswerDTORowCount(assist);
    }
    @Override
    public List<ExpertAnswerDTO> selectExpertAnswerDTO(Assist assist){
        return expertAnswerDAO.selectExpertAnswerDTO(assist);
    }
    @Override
    public ExpertAnswerDTO selectExpertAnswerDTOByObj(ExpertAnswerDTO obj){
        return expertAnswerDAO.selectExpertAnswerDTOByObj(obj);
    }
    @Override
    public ExpertAnswerDTO selectExpertAnswerDTOById(Long id){
        return expertAnswerDAO.selectExpertAnswerDTOById(id);
    }
    @Override
    public int insertExpertAnswerDTO(ExpertAnswerDTO value){
        return expertAnswerDAO.insertExpertAnswerDTO(value);
    }
    @Override
    public int insertNonEmptyExpertAnswerDTO(ExpertAnswerDTO value){
        return expertAnswerDAO.insertNonEmptyExpertAnswerDTO(value);
    }
    @Override
    public int insertExpertAnswerDTOByBatch(List<ExpertAnswerDTO> value){
        return expertAnswerDAO.insertExpertAnswerDTOByBatch(value);
    }
    @Override
    public int deleteExpertAnswerDTOById(Long id){
        return expertAnswerDAO.deleteExpertAnswerDTOById(id);
    }
    @Override
    public int deleteExpertAnswerDTO(Assist assist){
        return expertAnswerDAO.deleteExpertAnswerDTO(assist);
    }
    @Override
    public int updateExpertAnswerDTOById(ExpertAnswerDTO enti){
        return expertAnswerDAO.updateExpertAnswerDTOById(enti);
    }
    @Override
    public int updateExpertAnswerDTO(ExpertAnswerDTO value, Assist assist){
        return expertAnswerDAO.updateExpertAnswerDTO(value,assist);
    }
    @Override
    public int updateNonEmptyExpertAnswerDTOById(ExpertAnswerDTO enti){
        return expertAnswerDAO.updateNonEmptyExpertAnswerDTOById(enti);
    }
    @Override
    public int updateNonEmptyExpertAnswerDTO(ExpertAnswerDTO value, Assist assist){
        return expertAnswerDAO.updateNonEmptyExpertAnswerDTO(value,assist);
    }

    public ExpertAnswerDAO getExpertAnswerDAO() {
        return this.expertAnswerDAO;
    }

    public void setExpertAnswerDAO(ExpertAnswerDAO expertAnswerDAO) {
        this.expertAnswerDAO = expertAnswerDAO;
    }

}