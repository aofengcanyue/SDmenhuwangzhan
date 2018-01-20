package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationFourDAO;
import com.regex.web.common.dto.evaluation.EvaluationFourDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationFourServiceImpl implements EvaluationFourService{
    @Autowired
    private EvaluationFourDAO evaluationFourDAO;
    @Override
    public long getEvaluationFourDTORowCount(Assist assist){
        return evaluationFourDAO.getEvaluationFourDTORowCount(assist);
    }
    @Override
    public List<EvaluationFourDTO> selectEvaluationFourDTO(Assist assist){
        return evaluationFourDAO.selectEvaluationFourDTO(assist);
    }
    @Override
    public EvaluationFourDTO selectEvaluationFourDTOByObj(EvaluationFourDTO obj){
        return evaluationFourDAO.selectEvaluationFourDTOByObj(obj);
    }
    @Override
    public EvaluationFourDTO selectEvaluationFourDTOById(Long id){
        return evaluationFourDAO.selectEvaluationFourDTOById(id);
    }
    @Override
    public int insertEvaluationFourDTO(EvaluationFourDTO value){
        return evaluationFourDAO.insertEvaluationFourDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationFourDTO(EvaluationFourDTO value){
        return evaluationFourDAO.insertNonEmptyEvaluationFourDTO(value);
    }
    @Override
    public int insertEvaluationFourDTOByBatch(List<EvaluationFourDTO> value){
        return evaluationFourDAO.insertEvaluationFourDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationFourDTOById(Long id){
        return evaluationFourDAO.deleteEvaluationFourDTOById(id);
    }
    @Override
    public int deleteEvaluationFourDTO(Assist assist){
        return evaluationFourDAO.deleteEvaluationFourDTO(assist);
    }
    @Override
    public int updateEvaluationFourDTOById(EvaluationFourDTO enti){
        return evaluationFourDAO.updateEvaluationFourDTOById(enti);
    }
    @Override
    public int updateEvaluationFourDTO(EvaluationFourDTO value, Assist assist){
        return evaluationFourDAO.updateEvaluationFourDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationFourDTOById(EvaluationFourDTO enti){
        return evaluationFourDAO.updateNonEmptyEvaluationFourDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationFourDTO(EvaluationFourDTO value, Assist assist){
        return evaluationFourDAO.updateNonEmptyEvaluationFourDTO(value,assist);
    }

    public EvaluationFourDAO getEvaluationFourDAO() {
        return this.evaluationFourDAO;
    }

    public void setEvaluationFourDAO(EvaluationFourDAO evaluationFourDAO) {
        this.evaluationFourDAO = evaluationFourDAO;
    }

}