package com.regex.web.service.evaluation.impl;
import java.util.List;
import com.regex.web.dao.evaluation.EvaluationSixDAO;
import com.regex.web.common.dto.evaluation.EvaluationSixDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.evaluation.EvaluationSixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EvaluationSixServiceImpl implements EvaluationSixService{
    @Autowired
    private EvaluationSixDAO evaluationSixDAO;
    @Override
    public long getEvaluationSixDTORowCount(Assist assist){
        return evaluationSixDAO.getEvaluationSixDTORowCount(assist);
    }
    @Override
    public List<EvaluationSixDTO> selectEvaluationSixDTO(Assist assist){
        return evaluationSixDAO.selectEvaluationSixDTO(assist);
    }
    @Override
    public EvaluationSixDTO selectEvaluationSixDTOByObj(EvaluationSixDTO obj){
        return evaluationSixDAO.selectEvaluationSixDTOByObj(obj);
    }
    @Override
    public EvaluationSixDTO selectEvaluationSixDTOById(Long id){
        return evaluationSixDAO.selectEvaluationSixDTOById(id);
    }
    @Override
    public int insertEvaluationSixDTO(EvaluationSixDTO value){
        return evaluationSixDAO.insertEvaluationSixDTO(value);
    }
    @Override
    public int insertNonEmptyEvaluationSixDTO(EvaluationSixDTO value){
        return evaluationSixDAO.insertNonEmptyEvaluationSixDTO(value);
    }
    @Override
    public int insertEvaluationSixDTOByBatch(List<EvaluationSixDTO> value){
        return evaluationSixDAO.insertEvaluationSixDTOByBatch(value);
    }
    @Override
    public int deleteEvaluationSixDTOById(Long id){
        return evaluationSixDAO.deleteEvaluationSixDTOById(id);
    }
    @Override
    public int deleteEvaluationSixDTO(Assist assist){
        return evaluationSixDAO.deleteEvaluationSixDTO(assist);
    }
    @Override
    public int updateEvaluationSixDTOById(EvaluationSixDTO enti){
        return evaluationSixDAO.updateEvaluationSixDTOById(enti);
    }
    @Override
    public int updateEvaluationSixDTO(EvaluationSixDTO value, Assist assist){
        return evaluationSixDAO.updateEvaluationSixDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEvaluationSixDTOById(EvaluationSixDTO enti){
        return evaluationSixDAO.updateNonEmptyEvaluationSixDTOById(enti);
    }
    @Override
    public int updateNonEmptyEvaluationSixDTO(EvaluationSixDTO value, Assist assist){
        return evaluationSixDAO.updateNonEmptyEvaluationSixDTO(value,assist);
    }

    public EvaluationSixDAO getEvaluationSixDAO() {
        return this.evaluationSixDAO;
    }

    public void setEvaluationSixDAO(EvaluationSixDAO evaluationSixDAO) {
        this.evaluationSixDAO = evaluationSixDAO;
    }

}