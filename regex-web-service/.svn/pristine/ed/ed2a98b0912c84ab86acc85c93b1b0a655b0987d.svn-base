package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.NoticeTypeDAO;
import com.regex.web.common.dto.info.NoticeTypeDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.NoticeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class NoticeTypeServiceImpl implements NoticeTypeService{
    @Autowired
    private NoticeTypeDAO noticeTypeDAO;
    @Override
    public long getNoticeTypeDTORowCount(Assist assist){
        return noticeTypeDAO.getNoticeTypeDTORowCount(assist);
    }
    @Override
    public List<NoticeTypeDTO> selectNoticeTypeDTO(Assist assist){
        return noticeTypeDAO.selectNoticeTypeDTO(assist);
    }
    @Override
    public NoticeTypeDTO selectNoticeTypeDTOByObj(NoticeTypeDTO obj){
        return noticeTypeDAO.selectNoticeTypeDTOByObj(obj);
    }
    @Override
    public NoticeTypeDTO selectNoticeTypeDTOById(Long id){
        return noticeTypeDAO.selectNoticeTypeDTOById(id);
    }
    @Override
    public int insertNoticeTypeDTO(NoticeTypeDTO value){
        return noticeTypeDAO.insertNoticeTypeDTO(value);
    }
    @Override
    public int insertNonEmptyNoticeTypeDTO(NoticeTypeDTO value){
        return noticeTypeDAO.insertNonEmptyNoticeTypeDTO(value);
    }
    @Override
    public int insertNoticeTypeDTOByBatch(List<NoticeTypeDTO> value){
        return noticeTypeDAO.insertNoticeTypeDTOByBatch(value);
    }
    @Override
    public int deleteNoticeTypeDTOById(Long id){
        return noticeTypeDAO.deleteNoticeTypeDTOById(id);
    }
    @Override
    public int deleteNoticeTypeDTO(Assist assist){
        return noticeTypeDAO.deleteNoticeTypeDTO(assist);
    }
    @Override
    public int updateNoticeTypeDTOById(NoticeTypeDTO enti){
        return noticeTypeDAO.updateNoticeTypeDTOById(enti);
    }
    @Override
    public int updateNoticeTypeDTO(NoticeTypeDTO value, Assist assist){
        return noticeTypeDAO.updateNoticeTypeDTO(value,assist);
    }
    @Override
    public int updateNonEmptyNoticeTypeDTOById(NoticeTypeDTO enti){
        return noticeTypeDAO.updateNonEmptyNoticeTypeDTOById(enti);
    }
    @Override
    public int updateNonEmptyNoticeTypeDTO(NoticeTypeDTO value, Assist assist){
        return noticeTypeDAO.updateNonEmptyNoticeTypeDTO(value,assist);
    }

    public NoticeTypeDAO getNoticeTypeDAO() {
        return this.noticeTypeDAO;
    }

    public void setNoticeTypeDAO(NoticeTypeDAO noticeTypeDAO) {
        this.noticeTypeDAO = noticeTypeDAO;
    }

}