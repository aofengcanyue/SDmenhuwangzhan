package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationZeroDAO;
import com.regex.web.common.dto.evaluation.EvaluationZeroDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationZeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationZeroServiceImpl implements EvaluationZeroService{
    @Autowired
    private EvaluationZeroDAO evaluationZeroDAO;
    @Override
    public long getEvaluationZeroDTORowCount(Assist assist){
        return evaluationZeroDAO.getEvaluationZeroDTORowCount(assist);
    }
    @Override
    public List<EvaluationZeroDTO> selectEvaluationZeroDTO(Assist assist){
        return evaluationZeroDAO.selectEvaluationZeroDTO(assist);
    }
    @Override
    public EvaluationZeroDTO selectEvaluationZeroDTOByObj(EvaluationZeroDTO obj){
        return evaluationZeroDAO.selectEvaluationZeroDTOByObj(obj);
    }
    @Override
    public EvaluationZeroDTO selectEvaluationZeroDTOById(Long id){
        return evaluationZeroDAO.selectEvaluationZeroDTOById(id);
    }
    @Override
    public int insertEvaluationZeroDTO(EvaluationZeroDTO value){
        return evaluationZeroDAO.insertEvaluationZeroDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationZeroDTO(EvaluationZeroDTO value){
        return evaluationZeroDAO.insertNonEmptyEvaluationZeroDTO(value);
    }
    @Override
    public int insertEvaluationZeroDTOByBatch(List<EvaluationZeroDTO> value){
        return evaluationZeroDAO.insertEvaluationZeroDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationZeroDTOById(Long id){
        return evaluationZeroDAO.deleteEvaluationZeroDTOById(id);
    }
    @Override
    public int deleteEvaluationZeroDTO(Assist assist){
        return evaluationZeroDAO.deleteEvaluationZeroDTO(assist);
    }
    @Override
    public int updateEvaluationZeroDTOById(EvaluationZeroDTO enti){
        return evaluationZeroDAO.updateEvaluationZeroDTOById(enti);
    }
    @Override
    public int updateEvaluationZeroDTO(EvaluationZeroDTO value, Assist assist){
        return evaluationZeroDAO.updateEvaluationZeroDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationZeroDTOById(EvaluationZeroDTO enti){
        return evaluationZeroDAO.updateNonEmptyEvaluationZeroDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationZeroDTO(EvaluationZeroDTO value, Assist assist){
        return evaluationZeroDAO.updateNonEmptyEvaluationZeroDTO(value,assist);
    }

    public EvaluationZeroDAO getEvaluationZeroDAO() {
        return this.evaluationZeroDAO;
    }

    public void setEvaluationZeroDAO(EvaluationZeroDAO evaluationZeroDAO) {
        this.evaluationZeroDAO = evaluationZeroDAO;
    }

}