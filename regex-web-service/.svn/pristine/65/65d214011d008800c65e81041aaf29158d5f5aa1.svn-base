package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationFiveDAO;
import com.regex.web.common.dto.evaluation.EvaluationFiveDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationFiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationFiveServiceImpl implements EvaluationFiveService{
    @Autowired
    private EvaluationFiveDAO evaluationFiveDAO;
    @Override
    public long getEvaluationFiveDTORowCount(Assist assist){
        return evaluationFiveDAO.getEvaluationFiveDTORowCount(assist);
    }
    @Override
    public List<EvaluationFiveDTO> selectEvaluationFiveDTO(Assist assist){
        return evaluationFiveDAO.selectEvaluationFiveDTO(assist);
    }
    @Override
    public EvaluationFiveDTO selectEvaluationFiveDTOByObj(EvaluationFiveDTO obj){
        return evaluationFiveDAO.selectEvaluationFiveDTOByObj(obj);
    }
    @Override
    public EvaluationFiveDTO selectEvaluationFiveDTOById(Long id){
        return evaluationFiveDAO.selectEvaluationFiveDTOById(id);
    }
    @Override
    public int insertEvaluationFiveDTO(EvaluationFiveDTO value){
        return evaluationFiveDAO.insertEvaluationFiveDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationFiveDTO(EvaluationFiveDTO value){
        return evaluationFiveDAO.insertNonEmptyEvaluationFiveDTO(value);
    }
    @Override
    public int insertEvaluationFiveDTOByBatch(List<EvaluationFiveDTO> value){
        return evaluationFiveDAO.insertEvaluationFiveDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationFiveDTOById(Long id){
        return evaluationFiveDAO.deleteEvaluationFiveDTOById(id);
    }
    @Override
    public int deleteEvaluationFiveDTO(Assist assist){
        return evaluationFiveDAO.deleteEvaluationFiveDTO(assist);
    }
    @Override
    public int updateEvaluationFiveDTOById(EvaluationFiveDTO enti){
        return evaluationFiveDAO.updateEvaluationFiveDTOById(enti);
    }
    @Override
    public int updateEvaluationFiveDTO(EvaluationFiveDTO value, Assist assist){
        return evaluationFiveDAO.updateEvaluationFiveDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationFiveDTOById(EvaluationFiveDTO enti){
        return evaluationFiveDAO.updateNonEmptyEvaluationFiveDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationFiveDTO(EvaluationFiveDTO value, Assist assist){
        return evaluationFiveDAO.updateNonEmptyEvaluationFiveDTO(value,assist);
    }

    public EvaluationFiveDAO getEvaluationFiveDAO() {
        return this.evaluationFiveDAO;
    }

    public void setEvaluationFiveDAO(EvaluationFiveDAO evaluationFiveDAO) {
        this.evaluationFiveDAO = evaluationFiveDAO;
    }

}