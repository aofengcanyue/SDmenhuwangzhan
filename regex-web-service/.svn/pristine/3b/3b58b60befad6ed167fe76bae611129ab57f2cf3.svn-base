package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationThreeDAO;
import com.regex.web.common.dto.evaluation.EvaluationThreeDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationThreeServiceImpl implements EvaluationThreeService{
    @Autowired
    private EvaluationThreeDAO evaluationThreeDAO;
    @Override
    public long getEvaluationThreeDTORowCount(Assist assist){
        return evaluationThreeDAO.getEvaluationThreeDTORowCount(assist);
    }
    @Override
    public List<EvaluationThreeDTO> selectEvaluationThreeDTO(Assist assist){
        return evaluationThreeDAO.selectEvaluationThreeDTO(assist);
    }
    @Override
    public EvaluationThreeDTO selectEvaluationThreeDTOByObj(EvaluationThreeDTO obj){
        return evaluationThreeDAO.selectEvaluationThreeDTOByObj(obj);
    }
    @Override
    public EvaluationThreeDTO selectEvaluationThreeDTOById(Long id){
        return evaluationThreeDAO.selectEvaluationThreeDTOById(id);
    }
    @Override
    public int insertEvaluationThreeDTO(EvaluationThreeDTO value){
        return evaluationThreeDAO.insertEvaluationThreeDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationThreeDTO(EvaluationThreeDTO value){
        return evaluationThreeDAO.insertNonEmptyEvaluationThreeDTO(value);
    }
    @Override
    public int insertEvaluationThreeDTOByBatch(List<EvaluationThreeDTO> value){
        return evaluationThreeDAO.insertEvaluationThreeDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationThreeDTOById(Long id){
        return evaluationThreeDAO.deleteEvaluationThreeDTOById(id);
    }
    @Override
    public int deleteEvaluationThreeDTO(Assist assist){
        return evaluationThreeDAO.deleteEvaluationThreeDTO(assist);
    }
    @Override
    public int updateEvaluationThreeDTOById(EvaluationThreeDTO enti){
        return evaluationThreeDAO.updateEvaluationThreeDTOById(enti);
    }
    @Override
    public int updateEvaluationThreeDTO(EvaluationThreeDTO value, Assist assist){
        return evaluationThreeDAO.updateEvaluationThreeDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationThreeDTOById(EvaluationThreeDTO enti){
        return evaluationThreeDAO.updateNonEmptyEvaluationThreeDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationThreeDTO(EvaluationThreeDTO value, Assist assist){
        return evaluationThreeDAO.updateNonEmptyEvaluationThreeDTO(value,assist);
    }

    public EvaluationThreeDAO getEvaluationThreeDAO() {
        return this.evaluationThreeDAO;
    }

    public void setEvaluationThreeDAO(EvaluationThreeDAO evaluationThreeDAO) {
        this.evaluationThreeDAO = evaluationThreeDAO;
    }

}