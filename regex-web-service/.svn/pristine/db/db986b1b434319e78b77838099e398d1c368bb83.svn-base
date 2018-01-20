package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationResultDAO;
import com.regex.web.common.dto.evaluation.EvaluationResultDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationResultServiceImpl implements EvaluationResultService{
    @Autowired
    private EvaluationResultDAO evaluationResultDAO;
    @Override
    public long getEvaluationResultDTORowCount(Assist assist){
        return evaluationResultDAO.getEvaluationResultDTORowCount(assist);
    }
    @Override
    public List<EvaluationResultDTO> selectEvaluationResultDTO(Assist assist){
        return evaluationResultDAO.selectEvaluationResultDTO(assist);
    }
    @Override
    public EvaluationResultDTO selectEvaluationResultDTOByObj(EvaluationResultDTO obj){
        return evaluationResultDAO.selectEvaluationResultDTOByObj(obj);
    }
    @Override
    public EvaluationResultDTO selectEvaluationResultDTOById(Long id){
        return evaluationResultDAO.selectEvaluationResultDTOById(id);
    }
    @Override
    public int insertEvaluationResultDTO(EvaluationResultDTO value){
        return evaluationResultDAO.insertEvaluationResultDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationResultDTO(EvaluationResultDTO value){
        return evaluationResultDAO.insertNonEmptyEvaluationResultDTO(value);
    }
    @Override
    public int insertEvaluationResultDTOByBatch(List<EvaluationResultDTO> value){
        return evaluationResultDAO.insertEvaluationResultDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationResultDTOById(Long id){
        return evaluationResultDAO.deleteEvaluationResultDTOById(id);
    }
    @Override
    public int deleteEvaluationResultDTO(Assist assist){
        return evaluationResultDAO.deleteEvaluationResultDTO(assist);
    }
    @Override
    public int updateEvaluationResultDTOById(EvaluationResultDTO enti){
        return evaluationResultDAO.updateEvaluationResultDTOById(enti);
    }
    @Override
    public int updateEvaluationResultDTO(EvaluationResultDTO value, Assist assist){
        return evaluationResultDAO.updateEvaluationResultDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationResultDTOById(EvaluationResultDTO enti){
        return evaluationResultDAO.updateNonEmptyEvaluationResultDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationResultDTO(EvaluationResultDTO value, Assist assist){
        return evaluationResultDAO.updateNonEmptyEvaluationResultDTO(value,assist);
    }

    public EvaluationResultDAO getEvaluationResultDAO() {
        return this.evaluationResultDAO;
    }

    public void setEvaluationResultDAO(EvaluationResultDAO evaluationResultDAO) {
        this.evaluationResultDAO = evaluationResultDAO;
    }

}