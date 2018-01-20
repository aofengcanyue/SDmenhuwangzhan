package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.INoticeDAO;
import com.regex.web.common.dto.info.NoticeDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class NoticeServiceImpl implements INoticeService{
    @Autowired
    private INoticeDAO iNoticeDAO;
    @Override
    public long getNoticeDTORowCount(Assist assist){
        return iNoticeDAO.getNoticeDTORowCount(assist);
    }
    @Override
    public List<NoticeDTO> selectNoticeDTO(Assist assist){
        return iNoticeDAO.selectNoticeDTO(assist);
    }
    @Override
    public NoticeDTO selectNoticeDTOByObj(NoticeDTO obj){
        return iNoticeDAO.selectNoticeDTOByObj(obj);
    }
    @Override
    public NoticeDTO selectNoticeDTOById(Long id){
        return iNoticeDAO.selectNoticeDTOById(id);
    }
    @Override
    public int insertNoticeDTO(NoticeDTO value){
        return iNoticeDAO.insertNoticeDTO(value);
    }
    @Override
    public int insertNonEmptyNoticeDTO(NoticeDTO value){
        return iNoticeDAO.insertNonEmptyNoticeDTO(value);
    }
    @Override
    public int insertNoticeDTOByBatch(List<NoticeDTO> value){
        return iNoticeDAO.insertNoticeDTOByBatch(value);
    }
    @Override
    public int deleteNoticeDTOById(Long id){
        return iNoticeDAO.deleteNoticeDTOById(id);
    }
    @Override
    public int deleteNoticeDTO(Assist assist){
        return iNoticeDAO.deleteNoticeDTO(assist);
    }
    @Override
    public int updateNoticeDTOById(NoticeDTO enti){
        return iNoticeDAO.updateNoticeDTOById(enti);
    }
    @Override
    public int updateNoticeDTO(NoticeDTO value, Assist assist){
        return iNoticeDAO.updateNoticeDTO(value,assist);
    }
    @Override
    public int updateNonEmptyNoticeDTOById(NoticeDTO enti){
        return iNoticeDAO.updateNonEmptyNoticeDTOById(enti);
    }
    @Override
    public int updateNonEmptyNoticeDTO(NoticeDTO value, Assist assist){
        return iNoticeDAO.updateNonEmptyNoticeDTO(value,assist);
    }

    public INoticeDAO getINoticeDAO() {
        return this.iNoticeDAO;
    }

    public void setINoticeDAO(INoticeDAO iNoticeDAO) {
        this.iNoticeDAO = iNoticeDAO;
    }

}