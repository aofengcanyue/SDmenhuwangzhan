package com.regex.web.service.green.impl;
import java.util.List;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.green.GreenSupplyChainEvaluation;
import com.regex.web.dao.green.GreenSupplyChainEvaluationDAO;
import com.regex.web.service.green.GreenSupplyChainEvaluationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreenSupplyChainEvaluationServiceImpl implements GreenSupplyChainEvaluationService{
    @Autowired
    private GreenSupplyChainEvaluationDAO greenSupplyChainEvaluationDAO;
    @Override
    public long getGreenSupplyChainEvaluationRowCount(Assist assist){
        return greenSupplyChainEvaluationDAO.getGreenSupplyChainEvaluationRowCount(assist);
    }
    @Override
    public List<GreenSupplyChainEvaluation> selectGreenSupplyChainEvaluation(Assist assist){
        return greenSupplyChainEvaluationDAO.selectGreenSupplyChainEvaluation(assist);
    }
    @Override
    public GreenSupplyChainEvaluation selectGreenSupplyChainEvaluationByObj(GreenSupplyChainEvaluation obj){
        return greenSupplyChainEvaluationDAO.selectGreenSupplyChainEvaluationByObj(obj);
    }
    @Override
    public GreenSupplyChainEvaluation selectGreenSupplyChainEvaluationById(Long id){
        return greenSupplyChainEvaluationDAO.selectGreenSupplyChainEvaluationById(id);
    }
    @Override
    public int insertGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value){
        return greenSupplyChainEvaluationDAO.insertGreenSupplyChainEvaluation(value);
    }
    @Override
    public int insertNonEmptyGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value){
        return greenSupplyChainEvaluationDAO.insertNonEmptyGreenSupplyChainEvaluation(value);
    }
    @Override
    public int insertGreenSupplyChainEvaluationByBatch(List<GreenSupplyChainEvaluation> value){
        return greenSupplyChainEvaluationDAO.insertGreenSupplyChainEvaluationByBatch(value);
    }
    @Override
    public int deleteGreenSupplyChainEvaluationById(Long id){
        return greenSupplyChainEvaluationDAO.deleteGreenSupplyChainEvaluationById(id);
    }
    @Override
    public int deleteGreenSupplyChainEvaluation(Assist assist){
        return greenSupplyChainEvaluationDAO.deleteGreenSupplyChainEvaluation(assist);
    }
    @Override
    public int updateGreenSupplyChainEvaluationById(GreenSupplyChainEvaluation enti){
        return greenSupplyChainEvaluationDAO.updateGreenSupplyChainEvaluationById(enti);
    }
    @Override
    public int updateGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value, Assist assist){
        return greenSupplyChainEvaluationDAO.updateGreenSupplyChainEvaluation(value,assist);
    }
    @Override
    public int updateNonEmptyGreenSupplyChainEvaluationById(GreenSupplyChainEvaluation enti){
        return greenSupplyChainEvaluationDAO.updateNonEmptyGreenSupplyChainEvaluationById(enti);
    }
    @Override
    public int updateNonEmptyGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value, Assist assist){
        return greenSupplyChainEvaluationDAO.updateNonEmptyGreenSupplyChainEvaluation(value,assist);
    }

    public GreenSupplyChainEvaluationDAO getGreenSupplyChainEvaluationDAO() {
        return this.greenSupplyChainEvaluationDAO;
    }

    public void setGreenSupplyChainEvaluationDAO(GreenSupplyChainEvaluationDAO greenSupplyChainEvaluationDAO) {
        this.greenSupplyChainEvaluationDAO = greenSupplyChainEvaluationDAO;
    }

}