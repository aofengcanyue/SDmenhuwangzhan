package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.IExpertDAO;
import com.regex.web.common.dto.info.ExpertDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.IExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ExpertServiceImpl implements IExpertService{
    @Autowired
    private IExpertDAO iExpertDAO;
    @Override
    public long getExpertDTORowCount(Assist assist){
        return iExpertDAO.getExpertDTORowCount(assist);
    }
    @Override
    public List<ExpertDTO> selectExpertDTO(Assist assist){
        return iExpertDAO.selectExpertDTO(assist);
    }
    @Override
    public ExpertDTO selectExpertDTOByObj(ExpertDTO obj){
        return iExpertDAO.selectExpertDTOByObj(obj);
    }
    @Override
    public ExpertDTO selectExpertDTOById(Long id){
        return iExpertDAO.selectExpertDTOById(id);
    }
    @Override
    public int insertExpertDTO(ExpertDTO value){
        return iExpertDAO.insertExpertDTO(value);
    }
    @Override
    public int insertNonEmptyExpertDTO(ExpertDTO value){
        return iExpertDAO.insertNonEmptyExpertDTO(value);
    }
    @Override
    public int insertExpertDTOByBatch(List<ExpertDTO> value){
        return iExpertDAO.insertExpertDTOByBatch(value);
    }
    @Override
    public int deleteExpertDTOById(Long id){
        return iExpertDAO.deleteExpertDTOById(id);
    }
    @Override
    public int deleteExpertDTO(Assist assist){
        return iExpertDAO.deleteExpertDTO(assist);
    }
    @Override
    public int updateExpertDTOById(ExpertDTO enti){
        return iExpertDAO.updateExpertDTOById(enti);
    }
    @Override
    public int updateExpertDTO(ExpertDTO value, Assist assist){
        return iExpertDAO.updateExpertDTO(value,assist);
    }
    @Override
    public int updateNonEmptyExpertDTOById(ExpertDTO enti){
        return iExpertDAO.updateNonEmptyExpertDTOById(enti);
    }
    @Override
    public int updateNonEmptyExpertDTO(ExpertDTO value, Assist assist){
        return iExpertDAO.updateNonEmptyExpertDTO(value,assist);
    }

    public IExpertDAO getIExpertDAO() {
        return this.iExpertDAO;
    }

    public void setIExpertDAO(IExpertDAO iExpertDAO) {
        this.iExpertDAO = iExpertDAO;
    }

}