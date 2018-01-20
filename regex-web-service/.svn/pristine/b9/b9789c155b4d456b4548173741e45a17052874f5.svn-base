package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationTwoDAO;
import com.regex.web.common.dto.evaluation.EvaluationTwoDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationTwoServiceImpl implements EvaluationTwoService{
    @Autowired
    private EvaluationTwoDAO evaluationTwoDAO;
    @Override
    public long getEvaluationTwoDTORowCount(Assist assist){
        return evaluationTwoDAO.getEvaluationTwoDTORowCount(assist);
    }
    @Override
    public List<EvaluationTwoDTO> selectEvaluationTwoDTO(Assist assist){
        return evaluationTwoDAO.selectEvaluationTwoDTO(assist);
    }
    @Override
    public EvaluationTwoDTO selectEvaluationTwoDTOByObj(EvaluationTwoDTO obj){
        return evaluationTwoDAO.selectEvaluationTwoDTOByObj(obj);
    }
    @Override
    public EvaluationTwoDTO selectEvaluationTwoDTOById(Long id){
        return evaluationTwoDAO.selectEvaluationTwoDTOById(id);
    }
    @Override
    public int insertEvaluationTwoDTO(EvaluationTwoDTO value){
        return evaluationTwoDAO.insertEvaluationTwoDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationTwoDTO(EvaluationTwoDTO value){
        return evaluationTwoDAO.insertNonEmptyEvaluationTwoDTO(value);
    }
    @Override
    public int insertEvaluationTwoDTOByBatch(List<EvaluationTwoDTO> value){
        return evaluationTwoDAO.insertEvaluationTwoDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationTwoDTOById(Long id){
        return evaluationTwoDAO.deleteEvaluationTwoDTOById(id);
    }
    @Override
    public int deleteEvaluationTwoDTO(Assist assist){
        return evaluationTwoDAO.deleteEvaluationTwoDTO(assist);
    }
    @Override
    public int updateEvaluationTwoDTOById(EvaluationTwoDTO enti){
        return evaluationTwoDAO.updateEvaluationTwoDTOById(enti);
    }
    @Override
    public int updateEvaluationTwoDTO(EvaluationTwoDTO value, Assist assist){
        return evaluationTwoDAO.updateEvaluationTwoDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationTwoDTOById(EvaluationTwoDTO enti){
        return evaluationTwoDAO.updateNonEmptyEvaluationTwoDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationTwoDTO(EvaluationTwoDTO value, Assist assist){
        return evaluationTwoDAO.updateNonEmptyEvaluationTwoDTO(value,assist);
    }

    public EvaluationTwoDAO getEvaluationTwoDAO() {
        return this.evaluationTwoDAO;
    }

    public void setEvaluationTwoDAO(EvaluationTwoDAO evaluationTwoDAO) {
        this.evaluationTwoDAO = evaluationTwoDAO;
    }

}