package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.CommonAccordEvaluateDAO;
import com.regex.web.common.dto.info.CommonAccordEvaluateDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.CommonAccordEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CommonAccordEvaluateServiceImpl implements CommonAccordEvaluateService{
    @Autowired
    private CommonAccordEvaluateDAO commonAccordEvaluateDAO;
    @Override
    public long getCommonAccordEvaluateDTORowCount(Assist assist){
        return commonAccordEvaluateDAO.getCommonAccordEvaluateDTORowCount(assist);
    }
    @Override
    public List<CommonAccordEvaluateDTO> selectCommonAccordEvaluateDTO(Assist assist){
        return commonAccordEvaluateDAO.selectCommonAccordEvaluateDTO(assist);
    }
    @Override
    public CommonAccordEvaluateDTO selectCommonAccordEvaluateDTOByObj(CommonAccordEvaluateDTO obj){
        return commonAccordEvaluateDAO.selectCommonAccordEvaluateDTOByObj(obj);
    }
    @Override
    public CommonAccordEvaluateDTO selectCommonAccordEvaluateDTOById(Long id){
        return commonAccordEvaluateDAO.selectCommonAccordEvaluateDTOById(id);
    }
    @Override
    public int insertCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value){
        return commonAccordEvaluateDAO.insertCommonAccordEvaluateDTO(value);
    }
    @Override
    public int insertNonEmptyCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value){
        return commonAccordEvaluateDAO.insertNonEmptyCommonAccordEvaluateDTO(value);
    }
    @Override
    public int insertCommonAccordEvaluateDTOByBatch(List<CommonAccordEvaluateDTO> value){
        return commonAccordEvaluateDAO.insertCommonAccordEvaluateDTOByBatch(value);
    }
    @Override
    public int deleteCommonAccordEvaluateDTOById(Long id){
        return commonAccordEvaluateDAO.deleteCommonAccordEvaluateDTOById(id);
    }
    @Override
    public int deleteCommonAccordEvaluateDTO(Assist assist){
        return commonAccordEvaluateDAO.deleteCommonAccordEvaluateDTO(assist);
    }
    @Override
    public int updateCommonAccordEvaluateDTOById(CommonAccordEvaluateDTO enti){
        return commonAccordEvaluateDAO.updateCommonAccordEvaluateDTOById(enti);
    }
    @Override
    public int updateCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value, Assist assist){
        return commonAccordEvaluateDAO.updateCommonAccordEvaluateDTO(value,assist);
    }
    @Override
    public int updateNonEmptyCommonAccordEvaluateDTOById(CommonAccordEvaluateDTO enti){
        return commonAccordEvaluateDAO.updateNonEmptyCommonAccordEvaluateDTOById(enti);
    }
    @Override
    public int updateNonEmptyCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value, Assist assist){
        return commonAccordEvaluateDAO.updateNonEmptyCommonAccordEvaluateDTO(value,assist);
    }

    public CommonAccordEvaluateDAO getCommonAccordEvaluateDAO() {
        return this.commonAccordEvaluateDAO;
    }

    public void setCommonAccordEvaluateDAO(CommonAccordEvaluateDAO commonAccordEvaluateDAO) {
        this.commonAccordEvaluateDAO = commonAccordEvaluateDAO;
    }

}