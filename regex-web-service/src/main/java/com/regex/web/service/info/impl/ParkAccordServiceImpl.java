package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.ParkAccordDAO;
import com.regex.web.common.dto.info.ParkAccordDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.ParkAccordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ParkAccordServiceImpl implements ParkAccordService{
    @Autowired
    private ParkAccordDAO parkAccordDAO;
    @Override
    public long getParkAccordDTORowCount(Assist assist){
        return parkAccordDAO.getParkAccordDTORowCount(assist);
    }
    @Override
    public List<ParkAccordDTO> selectParkAccordDTO(Assist assist){
        return parkAccordDAO.selectParkAccordDTO(assist);
    }
    @Override
    public ParkAccordDTO selectParkAccordDTOByObj(ParkAccordDTO obj){
        return parkAccordDAO.selectParkAccordDTOByObj(obj);
    }
    @Override
    public ParkAccordDTO selectParkAccordDTOById(Long id){
        return parkAccordDAO.selectParkAccordDTOById(id);
    }
    @Override
    public int insertParkAccordDTO(ParkAccordDTO value){
        return parkAccordDAO.insertParkAccordDTO(value);
    }
    @Override
    public int insertNonEmptyParkAccordDTO(ParkAccordDTO value){
        return parkAccordDAO.insertNonEmptyParkAccordDTO(value);
    }
    @Override
    public int insertParkAccordDTOByBatch(List<ParkAccordDTO> value){
        return parkAccordDAO.insertParkAccordDTOByBatch(value);
    }
    @Override
    public int deleteParkAccordDTOById(Long id){
        return parkAccordDAO.deleteParkAccordDTOById(id);
    }
    @Override
    public int deleteParkAccordDTO(Assist assist){
        return parkAccordDAO.deleteParkAccordDTO(assist);
    }
    @Override
    public int updateParkAccordDTOById(ParkAccordDTO enti){
        return parkAccordDAO.updateParkAccordDTOById(enti);
    }
    @Override
    public int updateParkAccordDTO(ParkAccordDTO value, Assist assist){
        return parkAccordDAO.updateParkAccordDTO(value,assist);
    }
    @Override
    public int updateNonEmptyParkAccordDTOById(ParkAccordDTO enti){
        return parkAccordDAO.updateNonEmptyParkAccordDTOById(enti);
    }
    @Override
    public int updateNonEmptyParkAccordDTO(ParkAccordDTO value, Assist assist){
        return parkAccordDAO.updateNonEmptyParkAccordDTO(value,assist);
    }

    public ParkAccordDAO getParkAccordDAO() {
        return this.parkAccordDAO;
    }

    public void setParkAccordDAO(ParkAccordDAO parkAccordDAO) {
        this.parkAccordDAO = parkAccordDAO;
    }

}