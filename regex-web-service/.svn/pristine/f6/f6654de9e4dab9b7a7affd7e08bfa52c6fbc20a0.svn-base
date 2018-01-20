package com.regex.web.service.green.impl;
import java.util.List;
import com.regex.web.dao.green.GreenSupply1DAO;
import com.regex.web.common.dto.green.GreenSupply1DTO;
import com.regex.web.common.Assist;
import com.regex.web.service.green.GreenSupply1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreenSupply1ServiceImpl implements GreenSupply1Service{
    @Autowired
    private GreenSupply1DAO greenSupply1DAO;
    @Override
    public long getGreenSupply1DTORowCount(Assist assist){
        return greenSupply1DAO.getGreenSupply1DTORowCount(assist);
    }
    @Override
    public List<GreenSupply1DTO> selectGreenSupply1DTO(Assist assist){
        return greenSupply1DAO.selectGreenSupply1DTO(assist);
    }
    @Override
    public GreenSupply1DTO selectGreenSupply1DTOByObj(GreenSupply1DTO obj){
        return greenSupply1DAO.selectGreenSupply1DTOByObj(obj);
    }
    @Override
    public GreenSupply1DTO selectGreenSupply1DTOById(Long id){
        return greenSupply1DAO.selectGreenSupply1DTOById(id);
    }
    @Override
    public int insertGreenSupply1DTO(GreenSupply1DTO value){
        return greenSupply1DAO.insertGreenSupply1DTO(value);
    }
    @Override
    public int insertNonEmptyGreenSupply1DTO(GreenSupply1DTO value){
        return greenSupply1DAO.insertNonEmptyGreenSupply1DTO(value);
    }
    @Override
    public int insertGreenSupply1DTOByBatch(List<GreenSupply1DTO> value){
        return greenSupply1DAO.insertGreenSupply1DTOByBatch(value);
    }
    @Override
    public int deleteGreenSupply1DTOById(Long id){
        return greenSupply1DAO.deleteGreenSupply1DTOById(id);
    }
    @Override
    public int deleteGreenSupply1DTO(Assist assist){
        return greenSupply1DAO.deleteGreenSupply1DTO(assist);
    }
    @Override
    public int updateGreenSupply1DTOById(GreenSupply1DTO enti){
        return greenSupply1DAO.updateGreenSupply1DTOById(enti);
    }
    @Override
    public int updateGreenSupply1DTO(GreenSupply1DTO value, Assist assist){
        return greenSupply1DAO.updateGreenSupply1DTO(value,assist);
    }
    @Override
    public int updateNonEmptyGreenSupply1DTOById(GreenSupply1DTO enti){
        return greenSupply1DAO.updateNonEmptyGreenSupply1DTOById(enti);
    }
    @Override
    public int updateNonEmptyGreenSupply1DTO(GreenSupply1DTO value, Assist assist){
        return greenSupply1DAO.updateNonEmptyGreenSupply1DTO(value,assist);
    }

    public GreenSupply1DAO getGreenSupply1DAO() {
        return this.greenSupply1DAO;
    }

    public void setGreenSupply1DAO(GreenSupply1DAO greenSupply1DAO) {
        this.greenSupply1DAO = greenSupply1DAO;
    }

}