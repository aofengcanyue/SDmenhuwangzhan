package com.regex.web.service.green.impl;
import java.util.List;
import com.regex.web.dao.green.GreenParkDAO;
import com.regex.web.common.dto.green.GreenParkDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.green.GreenParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GreenParkServiceImpl implements GreenParkService{
    @Autowired
    private GreenParkDAO greenParkDAO;
    @Override
    public long getGreenParkDTORowCount(Assist assist){
        return greenParkDAO.getGreenParkDTORowCount(assist);
    }
    @Override
    public List<GreenParkDTO> selectGreenParkDTO(Assist assist){
        return greenParkDAO.selectGreenParkDTO(assist);
    }
    @Override
    public GreenParkDTO selectGreenParkDTOByObj(GreenParkDTO obj){
        return greenParkDAO.selectGreenParkDTOByObj(obj);
    }
    @Override
    public GreenParkDTO selectGreenParkDTOById(Long id){
        return greenParkDAO.selectGreenParkDTOById(id);
    }
    @Override
    public int insertGreenParkDTO(GreenParkDTO value){
        return greenParkDAO.insertGreenParkDTO(value);
    }
    @Override
    public int insertNonEmptyGreenParkDTO(GreenParkDTO value){
        return greenParkDAO.insertNonEmptyGreenParkDTO(value);
    }
    @Override
    public int insertGreenParkDTOByBatch(List<GreenParkDTO> value){
        return greenParkDAO.insertGreenParkDTOByBatch(value);
    }
    @Override
    public int deleteGreenParkDTOById(Long id){
        return greenParkDAO.deleteGreenParkDTOById(id);
    }
    @Override
    public int deleteGreenParkDTO(Assist assist){
        return greenParkDAO.deleteGreenParkDTO(assist);
    }
    @Override
    public int updateGreenParkDTOById(GreenParkDTO enti){
        return greenParkDAO.updateGreenParkDTOById(enti);
    }
    @Override
    public int updateGreenParkDTO(GreenParkDTO value, Assist assist){
        return greenParkDAO.updateGreenParkDTO(value,assist);
    }
    @Override
    public int updateNonEmptyGreenParkDTOById(GreenParkDTO enti){
        return greenParkDAO.updateNonEmptyGreenParkDTOById(enti);
    }
    @Override
    public int updateNonEmptyGreenParkDTO(GreenParkDTO value, Assist assist){
        return greenParkDAO.updateNonEmptyGreenParkDTO(value,assist);
    }

    public GreenParkDAO getGreenParkDAO() {
        return this.greenParkDAO;
    }

    public void setGreenParkDAO(GreenParkDAO greenParkDAO) {
        this.greenParkDAO = greenParkDAO;
    }

}