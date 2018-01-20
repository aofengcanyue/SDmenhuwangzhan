package com.regex.web.service.info.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.MechanismDTO;
import com.regex.web.dao.info.MechanismDAO;
import com.regex.web.service.info.MechanismService;
@Service
public class MechanismServiceImpl implements MechanismService{
    @Autowired
    private MechanismDAO mechanismDAO;
    @Override
    public long getMechanismDTORowCount(Assist assist){
        return mechanismDAO.getMechanismDTORowCount(assist);
    }
    @Override
    public List<MechanismDTO> selectMechanismDTO(Assist assist){
        return mechanismDAO.selectMechanismDTO(assist);
    }
    @Override
    public MechanismDTO selectMechanismDTOByObj(MechanismDTO obj){
        return mechanismDAO.selectMechanismDTOByObj(obj);
    }
    @Override
    public MechanismDTO selectMechanismDTOById(Long id){
        return mechanismDAO.selectMechanismDTOById(id);
    }
    @Override
    public int insertMechanismDTO(MechanismDTO value){
        return mechanismDAO.insertMechanismDTO(value);
    }
    @Override
    public int insertNonEmptyMechanismDTO(MechanismDTO value){
        return mechanismDAO.insertNonEmptyMechanismDTO(value);
    }
    @Override
    public int insertMechanismDTOByBatch(List<MechanismDTO> value){
        return mechanismDAO.insertMechanismDTOByBatch(value);
    }
    @Override
    public int deleteMechanismDTOById(Long id){
        return mechanismDAO.deleteMechanismDTOById(id);
    }
    @Override
    public int deleteMechanismDTO(Assist assist){
        return mechanismDAO.deleteMechanismDTO(assist);
    }
    @Override
    public int updateMechanismDTOById(MechanismDTO enti){
        return mechanismDAO.updateMechanismDTOById(enti);
    }
    @Override
    public int updateMechanismDTO(MechanismDTO value, Assist assist){
        return mechanismDAO.updateMechanismDTO(value,assist);
    }
    @Override
    public int updateNonEmptyMechanismDTOById(MechanismDTO enti){
        return mechanismDAO.updateNonEmptyMechanismDTOById(enti);
    }
    @Override
    public int updateNonEmptyMechanismDTO(MechanismDTO value, Assist assist){
        return mechanismDAO.updateNonEmptyMechanismDTO(value,assist);
    }

    public MechanismDAO getMechanismDAO() {
        return this.mechanismDAO;
    }

    public void setMechanismDAO(MechanismDAO mechanismDAO) {
        this.mechanismDAO = mechanismDAO;
    }

}