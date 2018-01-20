package com.regex.web.service.green.impl;
import java.util.List;
import com.regex.web.dao.green.GreenSupply2DAO;
import com.regex.web.common.dto.green.GreenSupply2DTO;
import com.regex.web.common.Assist;
import com.regex.web.service.green.GreenSupply2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreenSupply2ServiceImpl implements GreenSupply2Service{
    @Autowired
    private GreenSupply2DAO greenSupply2DAO;
    @Override
    public long getGreenSupply2DTORowCount(Assist assist){
        return greenSupply2DAO.getGreenSupply2DTORowCount(assist);
    }
    @Override
    public List<GreenSupply2DTO> selectGreenSupply2DTO(Assist assist){
        return greenSupply2DAO.selectGreenSupply2DTO(assist);
    }
    @Override
    public GreenSupply2DTO selectGreenSupply2DTOByObj(GreenSupply2DTO obj){
        return greenSupply2DAO.selectGreenSupply2DTOByObj(obj);
    }
    @Override
    public GreenSupply2DTO selectGreenSupply2DTOById(Long id){
        return greenSupply2DAO.selectGreenSupply2DTOById(id);
    }
    @Override
    public int insertGreenSupply2DTO(GreenSupply2DTO value){
        return greenSupply2DAO.insertGreenSupply2DTO(value);
    }
    @Override
    public int insertNonEmptyGreenSupply2DTO(GreenSupply2DTO value){
        return greenSupply2DAO.insertNonEmptyGreenSupply2DTO(value);
    }
    @Override
    public int insertGreenSupply2DTOByBatch(List<GreenSupply2DTO> value){
        return greenSupply2DAO.insertGreenSupply2DTOByBatch(value);
    }
    @Override
    public int deleteGreenSupply2DTOById(Long id){
        return greenSupply2DAO.deleteGreenSupply2DTOById(id);
    }
    @Override
    public int deleteGreenSupply2DTO(Assist assist){
        return greenSupply2DAO.deleteGreenSupply2DTO(assist);
    }
    @Override
    public int updateGreenSupply2DTOById(GreenSupply2DTO enti){
        return greenSupply2DAO.updateGreenSupply2DTOById(enti);
    }
    @Override
    public int updateGreenSupply2DTO(GreenSupply2DTO value, Assist assist){
        return greenSupply2DAO.updateGreenSupply2DTO(value,assist);
    }
    @Override
    public int updateNonEmptyGreenSupply2DTOById(GreenSupply2DTO enti){
        return greenSupply2DAO.updateNonEmptyGreenSupply2DTOById(enti);
    }
    @Override
    public int updateNonEmptyGreenSupply2DTO(GreenSupply2DTO value, Assist assist){
        return greenSupply2DAO.updateNonEmptyGreenSupply2DTO(value,assist);
    }

    public GreenSupply2DAO getGreenSupply2DAO() {
        return this.greenSupply2DAO;
    }

    public void setGreenSupply2DAO(GreenSupply2DAO greenSupply2DAO) {
        this.greenSupply2DAO = greenSupply2DAO;
    }

}