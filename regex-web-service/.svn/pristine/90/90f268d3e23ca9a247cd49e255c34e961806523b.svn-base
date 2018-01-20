package com.regex.web.service.green.impl;
import java.util.List;
import com.regex.web.dao.green.GreenParkEvaluationDAO;
import com.regex.web.common.dto.green.GreenParkEvaluationDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.green.GreenParkEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreenParkEvaluationServiceImpl implements GreenParkEvaluationService{
    @Autowired
    private GreenParkEvaluationDAO greenParkEvaluationDAO;
    @Override
    public long getGreenParkEvaluationDTORowCount(Assist assist){
        return greenParkEvaluationDAO.getGreenParkEvaluationDTORowCount(assist);
    }
    @Override
    public List<GreenParkEvaluationDTO> selectGreenParkEvaluationDTO(Assist assist){
        return greenParkEvaluationDAO.selectGreenParkEvaluationDTO(assist);
    }
    @Override
    public GreenParkEvaluationDTO selectGreenParkEvaluationDTOByObj(GreenParkEvaluationDTO obj){
        return greenParkEvaluationDAO.selectGreenParkEvaluationDTOByObj(obj);
    }
    @Override
    public GreenParkEvaluationDTO selectGreenParkEvaluationDTOById(Long id){
        return greenParkEvaluationDAO.selectGreenParkEvaluationDTOById(id);
    }
    @Override
    public int insertGreenParkEvaluationDTO(GreenParkEvaluationDTO value){
        return greenParkEvaluationDAO.insertGreenParkEvaluationDTO(value);
    }
    @Override
    public int insertNonEmptyGreenParkEvaluationDTO(GreenParkEvaluationDTO value){
        return greenParkEvaluationDAO.insertNonEmptyGreenParkEvaluationDTO(value);
    }
    @Override
    public int insertGreenParkEvaluationDTOByBatch(List<GreenParkEvaluationDTO> value){
        return greenParkEvaluationDAO.insertGreenParkEvaluationDTOByBatch(value);
    }
    @Override
    public int deleteGreenParkEvaluationDTOById(Long id){
        return greenParkEvaluationDAO.deleteGreenParkEvaluationDTOById(id);
    }
    @Override
    public int deleteGreenParkEvaluationDTO(Assist assist){
        return greenParkEvaluationDAO.deleteGreenParkEvaluationDTO(assist);
    }
    @Override
    public int updateGreenParkEvaluationDTOById(GreenParkEvaluationDTO enti){
        return greenParkEvaluationDAO.updateGreenParkEvaluationDTOById(enti);
    }
    @Override
    public int updateGreenParkEvaluationDTO(GreenParkEvaluationDTO value, Assist assist){
        return greenParkEvaluationDAO.updateGreenParkEvaluationDTO(value,assist);
    }
    @Override
    public int updateNonEmptyGreenParkEvaluationDTOById(GreenParkEvaluationDTO enti){
        return greenParkEvaluationDAO.updateNonEmptyGreenParkEvaluationDTOById(enti);
    }
    @Override
    public int updateNonEmptyGreenParkEvaluationDTO(GreenParkEvaluationDTO value, Assist assist){
        return greenParkEvaluationDAO.updateNonEmptyGreenParkEvaluationDTO(value,assist);
    }

    public GreenParkEvaluationDAO getGreenParkEvaluationDAO() {
        return this.greenParkEvaluationDAO;
    }

    public void setGreenParkEvaluationDAO(GreenParkEvaluationDAO greenParkEvaluationDAO) {
        this.greenParkEvaluationDAO = greenParkEvaluationDAO;
    }

}