package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.IndustryInfoDAO;
import com.regex.web.common.dto.info.IndustryInfoDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.IndustryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IndustryInfoServiceImpl implements IndustryInfoService{
    @Autowired
    private IndustryInfoDAO industryInfoDAO;
    @Override
    public long getIndustryInfoDTORowCount(Assist assist){
        return industryInfoDAO.getIndustryInfoDTORowCount(assist);
    }
    @Override
    public List<IndustryInfoDTO> selectIndustryInfoDTO(Assist assist){
        return industryInfoDAO.selectIndustryInfoDTO(assist);
    }
    @Override
    public IndustryInfoDTO selectIndustryInfoDTOByObj(IndustryInfoDTO obj){
        return industryInfoDAO.selectIndustryInfoDTOByObj(obj);
    }
    @Override
    public IndustryInfoDTO selectIndustryInfoDTOById(String id){
        return industryInfoDAO.selectIndustryInfoDTOById(id);
    }
    @Override
    public int insertIndustryInfoDTO(IndustryInfoDTO value){
        return industryInfoDAO.insertIndustryInfoDTO(value);
    }
    @Override
    public int insertNonEmptyIndustryInfoDTO(IndustryInfoDTO value){
        return industryInfoDAO.insertNonEmptyIndustryInfoDTO(value);
    }
    @Override
    public int insertIndustryInfoDTOByBatch(List<IndustryInfoDTO> value){
        return industryInfoDAO.insertIndustryInfoDTOByBatch(value);
    }
    @Override
    public int deleteIndustryInfoDTOById(String id){
        return industryInfoDAO.deleteIndustryInfoDTOById(id);
    }
    @Override
    public int deleteIndustryInfoDTO(Assist assist){
        return industryInfoDAO.deleteIndustryInfoDTO(assist);
    }
    @Override
    public int updateIndustryInfoDTOById(IndustryInfoDTO enti){
        return industryInfoDAO.updateIndustryInfoDTOById(enti);
    }
    @Override
    public int updateIndustryInfoDTO(IndustryInfoDTO value, Assist assist){
        return industryInfoDAO.updateIndustryInfoDTO(value,assist);
    }
    @Override
    public int updateNonEmptyIndustryInfoDTOById(IndustryInfoDTO enti){
        return industryInfoDAO.updateNonEmptyIndustryInfoDTOById(enti);
    }
    @Override
    public int updateNonEmptyIndustryInfoDTO(IndustryInfoDTO value, Assist assist){
        return industryInfoDAO.updateNonEmptyIndustryInfoDTO(value,assist);
    }

    public IndustryInfoDAO getIndustryInfoDAO() {
        return this.industryInfoDAO;
    }

    public void setIndustryInfoDAO(IndustryInfoDAO industryInfoDAO) {
        this.industryInfoDAO = industryInfoDAO;
    }

}