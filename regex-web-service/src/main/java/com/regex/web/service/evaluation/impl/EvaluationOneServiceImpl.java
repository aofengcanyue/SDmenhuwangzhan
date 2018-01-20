package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationOneDAO;
import com.regex.web.common.dto.evaluation.EvaluationOneDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationOneServiceImpl implements EvaluationOneService{
    @Autowired
    private EvaluationOneDAO evaluationOneDAO;
    @Override
    public long getEvaluationOneDTORowCount(Assist assist){
        return evaluationOneDAO.getEvaluationOneDTORowCount(assist);
    }
    @Override
    public List<EvaluationOneDTO> selectEvaluationOneDTO(Assist assist){
        return evaluationOneDAO.selectEvaluationOneDTO(assist);
    }
    @Override
    public EvaluationOneDTO selectEvaluationOneDTOByObj(EvaluationOneDTO obj){
        return evaluationOneDAO.selectEvaluationOneDTOByObj(obj);
    }
    @Override
    public EvaluationOneDTO selectEvaluationOneDTOById(Long id){
        return evaluationOneDAO.selectEvaluationOneDTOById(id);
    }
    @Override
    public int insertEvaluationOneDTO(EvaluationOneDTO value){
        return evaluationOneDAO.insertEvaluationOneDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationOneDTO(EvaluationOneDTO value){
        return evaluationOneDAO.insertNonEmptyEvaluationOneDTO(value);
    }
    @Override
    public int insertEvaluationOneDTOByBatch(List<EvaluationOneDTO> value){
        return evaluationOneDAO.insertEvaluationOneDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationOneDTOById(Long id){
        return evaluationOneDAO.deleteEvaluationOneDTOById(id);
    }
    @Override
    public int deleteEvaluationOneDTO(Assist assist){
        return evaluationOneDAO.deleteEvaluationOneDTO(assist);
    }
    @Override
    public int updateEvaluationOneDTOById(EvaluationOneDTO enti){
        return evaluationOneDAO.updateEvaluationOneDTOById(enti);
    }
    @Override
    public int updateEvaluationOneDTO(EvaluationOneDTO value, Assist assist){
        return evaluationOneDAO.updateEvaluationOneDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationOneDTOById(EvaluationOneDTO enti){
        return evaluationOneDAO.updateNonEmptyEvaluationOneDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationOneDTO(EvaluationOneDTO value, Assist assist){
        return evaluationOneDAO.updateNonEmptyEvaluationOneDTO(value,assist);
    }

    public EvaluationOneDAO getEvaluationOneDAO() {
        return this.evaluationOneDAO;
    }

    public void setEvaluationOneDAO(EvaluationOneDAO evaluationOneDAO) {
        this.evaluationOneDAO = evaluationOneDAO;
    }

}