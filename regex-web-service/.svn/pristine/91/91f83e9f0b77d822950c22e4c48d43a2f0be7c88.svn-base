package com.regex.web.service.green.impl;
import java.util.List;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.green.IndexEvaluationDTO;
import com.regex.web.dao.green.IndexEvaluationDAO;
import com.regex.web.service.green.IndexEvaluationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IndexEvaluationServiceImpl implements IndexEvaluationService{
    @Autowired
    private IndexEvaluationDAO indexEvaluationDAO;
    @Override
    public long getIndexEvaluationDTORowCount(Assist assist){
        return indexEvaluationDAO.getIndexEvaluationDTORowCount(assist);
    }
    @Override
    public List<IndexEvaluationDTO> selectIndexEvaluationDTO(Assist assist){
        return indexEvaluationDAO.selectIndexEvaluationDTO(assist);
    }
    @Override
    public IndexEvaluationDTO selectIndexEvaluationDTOByObj(IndexEvaluationDTO obj){
        return indexEvaluationDAO.selectIndexEvaluationDTOByObj(obj);
    }
    @Override
    public IndexEvaluationDTO selectIndexEvaluationDTOById(Long id){
        return indexEvaluationDAO.selectIndexEvaluationDTOById(id);
    }
    @Override
    public int insertIndexEvaluationDTO(IndexEvaluationDTO value){
        return indexEvaluationDAO.insertIndexEvaluationDTO(value);
    }
    @Override
    public int insertNonEmptyIndexEvaluationDTO(IndexEvaluationDTO value){
        return indexEvaluationDAO.insertNonEmptyIndexEvaluationDTO(value);
    }
    @Override
    public int insertIndexEvaluationDTOByBatch(List<IndexEvaluationDTO> value){
        return indexEvaluationDAO.insertIndexEvaluationDTOByBatch(value);
    }
    @Override
    public int deleteIndexEvaluationDTOById(Long id){
        return indexEvaluationDAO.deleteIndexEvaluationDTOById(id);
    }
    @Override
    public int deleteIndexEvaluationDTO(Assist assist){
        return indexEvaluationDAO.deleteIndexEvaluationDTO(assist);
    }
    @Override
    public int updateIndexEvaluationDTOById(IndexEvaluationDTO enti){
        return indexEvaluationDAO.updateIndexEvaluationDTOById(enti);
    }
    @Override
    public int updateIndexEvaluationDTO(IndexEvaluationDTO value, Assist assist){
        return indexEvaluationDAO.updateIndexEvaluationDTO(value,assist);
    }
    @Override
    public int updateNonEmptyIndexEvaluationDTOById(IndexEvaluationDTO enti){
        return indexEvaluationDAO.updateNonEmptyIndexEvaluationDTOById(enti);
    }
    @Override
    public int updateNonEmptyIndexEvaluationDTO(IndexEvaluationDTO value, Assist assist){
        return indexEvaluationDAO.updateNonEmptyIndexEvaluationDTO(value,assist);
    }

    public IndexEvaluationDAO getIndexEvaluationDAO() {
        return this.indexEvaluationDAO;
    }

    public void setIndexEvaluationDAO(IndexEvaluationDAO indexEvaluationDAO) {
        this.indexEvaluationDAO = indexEvaluationDAO;
    }

}