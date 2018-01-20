package com.regex.web.service.info.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.EliminationDTO;
import com.regex.web.common.utils.QueryConditions;
import com.regex.web.dao.info.IEliminationDAO;
import com.regex.web.service.info.IEliminationService;
@Service
public class EliminationServiceImpl implements IEliminationService {
    
    @Autowired
    private IEliminationDAO eliminationDAO;
    
    @Override
    public int insert(EliminationDTO eliminationDTO) {

        return eliminationDAO.insert(eliminationDTO);
    }

    @Override
    public List<EliminationDTO> selectByModel(QueryConditions params) {
        
        return eliminationDAO.selectByModel(params);
    }

    @Override
    public int selectCountByModel(QueryConditions params) {
        
        return eliminationDAO.selectCountByModel(params);
    }

    @Override
    public int updateById(EliminationDTO eliminationDTO) {
        
        return eliminationDAO.updateById(eliminationDTO);
    }

    @Override
    public int del(long id) {
        
        return eliminationDAO.del(id);
    }

    @Override
    public List<EliminationDTO> selectAll() {
        
        return eliminationDAO.selectAll();
    }

    @Override
    public EliminationDTO selectById(long id) {
        
        return eliminationDAO.selectById(id);
    }
    
    @Override
    public long getEliminationDTORowCount(Assist assist){
        return eliminationDAO.getEliminationDTORowCount(assist);
    }
    @Override
    public List<EliminationDTO> selectEliminationDTO(Assist assist){
        return eliminationDAO.selectEliminationDTO(assist);
    }
    @Override
    public EliminationDTO selectEliminationDTOByObj(EliminationDTO obj){
        return eliminationDAO.selectEliminationDTOByObj(obj);
    }
    @Override
    public EliminationDTO selectEliminationDTOById(Long id){
        return eliminationDAO.selectEliminationDTOById(id);
    }
    @Override
    public int insertEliminationDTO(EliminationDTO value){
        return eliminationDAO.insertEliminationDTO(value);
    }
    @Override
    public int insertNonEmptyEliminationDTO(EliminationDTO value){
        return eliminationDAO.insertNonEmptyEliminationDTO(value);
    }
    @Override
    public int insertEliminationDTOByBatch(List<EliminationDTO> value){
        return eliminationDAO.insertEliminationDTOByBatch(value);
    }
    @Override
    public int deleteEliminationDTOById(Long id){
        return eliminationDAO.deleteEliminationDTOById(id);
    }
    @Override
    public int deleteEliminationDTO(Assist assist){
        return eliminationDAO.deleteEliminationDTO(assist);
    }
    @Override
    public int updateEliminationDTOById(EliminationDTO enti){
        return eliminationDAO.updateEliminationDTOById(enti);
    }
    @Override
    public int updateEliminationDTO(EliminationDTO value, Assist assist){
        return eliminationDAO.updateEliminationDTO(value,assist);
    }
    @Override
    public int updateNonEmptyEliminationDTOById(EliminationDTO enti){
        return eliminationDAO.updateNonEmptyEliminationDTOById(enti);
    }
    @Override
    public int updateNonEmptyEliminationDTO(EliminationDTO value, Assist assist){
        return eliminationDAO.updateNonEmptyEliminationDTO(value,assist);
    }

    public IEliminationDAO getIEliminationDAO() {
        return this.eliminationDAO;
    }

    public void setIEliminationDAO(IEliminationDAO iEliminationDAO) {
        this.eliminationDAO = iEliminationDAO;
    }
}
