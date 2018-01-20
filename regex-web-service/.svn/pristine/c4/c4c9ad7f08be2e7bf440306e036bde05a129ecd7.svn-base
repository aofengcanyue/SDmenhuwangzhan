package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.SystemColumnDAO;
import com.regex.web.common.dto.info.SystemColumnDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.SystemColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SystemColumnServiceImpl implements SystemColumnService{
    @Autowired
    private SystemColumnDAO systemColumnDAO;
    @Override
    public long getSystemColumnDTORowCount(Assist assist){
        return systemColumnDAO.getSystemColumnDTORowCount(assist);
    }
    @Override
    public List<SystemColumnDTO> selectSystemColumnDTO(Assist assist){
        return systemColumnDAO.selectSystemColumnDTO(assist);
    }
    @Override
    public SystemColumnDTO selectSystemColumnDTOByObj(SystemColumnDTO obj){
        return systemColumnDAO.selectSystemColumnDTOByObj(obj);
    }
    @Override
    public SystemColumnDTO selectSystemColumnDTOById(Long id){
        return systemColumnDAO.selectSystemColumnDTOById(id);
    }
    @Override
    public int insertSystemColumnDTO(SystemColumnDTO value){
        return systemColumnDAO.insertSystemColumnDTO(value);
    }
    @Override
    public int insertNonEmptySystemColumnDTO(SystemColumnDTO value){
        return systemColumnDAO.insertNonEmptySystemColumnDTO(value);
    }
    @Override
    public int insertSystemColumnDTOByBatch(List<SystemColumnDTO> value){
        return systemColumnDAO.insertSystemColumnDTOByBatch(value);
    }
    @Override
    public int deleteSystemColumnDTOById(Long id){
        return systemColumnDAO.deleteSystemColumnDTOById(id);
    }
    @Override
    public int deleteSystemColumnDTO(Assist assist){
        return systemColumnDAO.deleteSystemColumnDTO(assist);
    }
    @Override
    public int updateSystemColumnDTOById(SystemColumnDTO enti){
        return systemColumnDAO.updateSystemColumnDTOById(enti);
    }
    @Override
    public int updateSystemColumnDTO(SystemColumnDTO value, Assist assist){
        return systemColumnDAO.updateSystemColumnDTO(value,assist);
    }
    @Override
    public int updateNonEmptySystemColumnDTOById(SystemColumnDTO enti){
        return systemColumnDAO.updateNonEmptySystemColumnDTOById(enti);
    }
    @Override
    public int updateNonEmptySystemColumnDTO(SystemColumnDTO value, Assist assist){
        return systemColumnDAO.updateNonEmptySystemColumnDTO(value,assist);
    }

    public SystemColumnDAO getSystemColumnDAO() {
        return this.systemColumnDAO;
    }

    public void setSystemColumnDAO(SystemColumnDAO systemColumnDAO) {
        this.systemColumnDAO = systemColumnDAO;
    }

}