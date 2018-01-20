package com.regex.web.service.green.impl;
import java.util.List;
import com.regex.web.dao.green.ParkAssessmentDAO;
import com.regex.web.common.dto.green.ParkAssessmentDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.green.ParkAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ParkAssessmentServiceImpl implements ParkAssessmentService{
    @Autowired
    private ParkAssessmentDAO parkAssessmentDAO;
    @Override
    public long getParkAssessmentDTORowCount(Assist assist){
        return parkAssessmentDAO.getParkAssessmentDTORowCount(assist);
    }
    @Override
    public List<ParkAssessmentDTO> selectParkAssessmentDTO(Assist assist){
        return parkAssessmentDAO.selectParkAssessmentDTO(assist);
    }
    @Override
    public ParkAssessmentDTO selectParkAssessmentDTOByObj(ParkAssessmentDTO obj){
        return parkAssessmentDAO.selectParkAssessmentDTOByObj(obj);
    }
    @Override
    public ParkAssessmentDTO selectParkAssessmentDTOById(Long id){
        return parkAssessmentDAO.selectParkAssessmentDTOById(id);
    }
    @Override
    public int insertParkAssessmentDTO(ParkAssessmentDTO value){
        return parkAssessmentDAO.insertParkAssessmentDTO(value);
    }
    @Override
    public int insertNonEmptyParkAssessmentDTO(ParkAssessmentDTO value){
        return parkAssessmentDAO.insertNonEmptyParkAssessmentDTO(value);
    }
    @Override
    public int insertParkAssessmentDTOByBatch(List<ParkAssessmentDTO> value){
        return parkAssessmentDAO.insertParkAssessmentDTOByBatch(value);
    }
    @Override
    public int deleteParkAssessmentDTOById(Long id){
        return parkAssessmentDAO.deleteParkAssessmentDTOById(id);
    }
    @Override
    public int deleteParkAssessmentDTO(Assist assist){
        return parkAssessmentDAO.deleteParkAssessmentDTO(assist);
    }
    @Override
    public int updateParkAssessmentDTOById(ParkAssessmentDTO enti){
        return parkAssessmentDAO.updateParkAssessmentDTOById(enti);
    }
    @Override
    public int updateParkAssessmentDTO(ParkAssessmentDTO value, Assist assist){
        return parkAssessmentDAO.updateParkAssessmentDTO(value,assist);
    }
    @Override
    public int updateNonEmptyParkAssessmentDTOById(ParkAssessmentDTO enti){
        return parkAssessmentDAO.updateNonEmptyParkAssessmentDTOById(enti);
    }
    @Override
    public int updateNonEmptyParkAssessmentDTO(ParkAssessmentDTO value, Assist assist){
        return parkAssessmentDAO.updateNonEmptyParkAssessmentDTO(value,assist);
    }

    public ParkAssessmentDAO getParkAssessmentDAO() {
        return this.parkAssessmentDAO;
    }

    public void setParkAssessmentDAO(ParkAssessmentDAO parkAssessmentDAO) {
        this.parkAssessmentDAO = parkAssessmentDAO;
    }

}