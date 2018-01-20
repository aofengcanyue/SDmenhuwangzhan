package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.TrainingDAO;
import com.regex.web.common.dto.info.TrainingDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TrainingServiceImpl implements TrainingService{
    @Autowired
    private TrainingDAO trainingDAO;
    @Override
    public long getTrainingDTORowCount(Assist assist){
        return trainingDAO.getTrainingDTORowCount(assist);
    }
    @Override
    public List<TrainingDTO> selectTrainingDTO(Assist assist){
        return trainingDAO.selectTrainingDTO(assist);
    }
    @Override
    public TrainingDTO selectTrainingDTOByObj(TrainingDTO obj){
        return trainingDAO.selectTrainingDTOByObj(obj);
    }
    @Override
    public TrainingDTO selectTrainingDTOById(Long id){
        return trainingDAO.selectTrainingDTOById(id);
    }
    @Override
    public int insertTrainingDTO(TrainingDTO value){
        return trainingDAO.insertTrainingDTO(value);
    }
    @Override
    public int insertNonEmptyTrainingDTO(TrainingDTO value){
        return trainingDAO.insertNonEmptyTrainingDTO(value);
    }
    @Override
    public int insertTrainingDTOByBatch(List<TrainingDTO> value){
        return trainingDAO.insertTrainingDTOByBatch(value);
    }
    @Override
    public int deleteTrainingDTOById(Long id){
        return trainingDAO.deleteTrainingDTOById(id);
    }
    @Override
    public int deleteTrainingDTO(Assist assist){
        return trainingDAO.deleteTrainingDTO(assist);
    }
    @Override
    public int updateTrainingDTOById(TrainingDTO enti){
        return trainingDAO.updateTrainingDTOById(enti);
    }
    @Override
    public int updateTrainingDTO(TrainingDTO value, Assist assist){
        return trainingDAO.updateTrainingDTO(value,assist);
    }
    @Override
    public int updateNonEmptyTrainingDTOById(TrainingDTO enti){
        return trainingDAO.updateNonEmptyTrainingDTOById(enti);
    }
    @Override
    public int updateNonEmptyTrainingDTO(TrainingDTO value, Assist assist){
        return trainingDAO.updateNonEmptyTrainingDTO(value,assist);
    }

    public TrainingDAO getTrainingDAO() {
        return this.trainingDAO;
    }

    public void setTrainingDAO(TrainingDAO trainingDAO) {
        this.trainingDAO = trainingDAO;
    }

}