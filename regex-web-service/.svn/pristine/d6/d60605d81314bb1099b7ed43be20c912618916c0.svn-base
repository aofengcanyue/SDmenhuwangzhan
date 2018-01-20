package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.AnswerInfoDAO;
import com.regex.web.common.dto.info.AnswerInfoDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.AnswerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnswerInfoServiceImpl implements AnswerInfoService{
    @Autowired
    private AnswerInfoDAO answerInfoDAO;
    @Override
    public long getAnswerInfoDTORowCount(Assist assist){
        return answerInfoDAO.getAnswerInfoDTORowCount(assist);
    }
    @Override
    public List<AnswerInfoDTO> selectAnswerInfoDTO(Assist assist){
        return answerInfoDAO.selectAnswerInfoDTO(assist);
    }
    @Override
    public AnswerInfoDTO selectAnswerInfoDTOByObj(AnswerInfoDTO obj){
        return answerInfoDAO.selectAnswerInfoDTOByObj(obj);
    }
    @Override
    public AnswerInfoDTO selectAnswerInfoDTOById(Long id){
        return answerInfoDAO.selectAnswerInfoDTOById(id);
    }
    @Override
    public int insertAnswerInfoDTO(AnswerInfoDTO value){
        return answerInfoDAO.insertAnswerInfoDTO(value);
    }
    @Override
    public int insertNonEmptyAnswerInfoDTO(AnswerInfoDTO value){
        return answerInfoDAO.insertNonEmptyAnswerInfoDTO(value);
    }
    @Override
    public int insertAnswerInfoDTOByBatch(List<AnswerInfoDTO> value){
        return answerInfoDAO.insertAnswerInfoDTOByBatch(value);
    }
    @Override
    public int deleteAnswerInfoDTOById(Long id){
        return answerInfoDAO.deleteAnswerInfoDTOById(id);
    }
    @Override
    public int deleteAnswerInfoDTO(Assist assist){
        return answerInfoDAO.deleteAnswerInfoDTO(assist);
    }
    @Override
    public int updateAnswerInfoDTOById(AnswerInfoDTO enti){
        return answerInfoDAO.updateAnswerInfoDTOById(enti);
    }
    @Override
    public int updateAnswerInfoDTO(AnswerInfoDTO value, Assist assist){
        return answerInfoDAO.updateAnswerInfoDTO(value,assist);
    }
    @Override
    public int updateNonEmptyAnswerInfoDTOById(AnswerInfoDTO enti){
        return answerInfoDAO.updateNonEmptyAnswerInfoDTOById(enti);
    }
    @Override
    public int updateNonEmptyAnswerInfoDTO(AnswerInfoDTO value, Assist assist){
        return answerInfoDAO.updateNonEmptyAnswerInfoDTO(value,assist);
    }

    public AnswerInfoDAO getAnswerInfoDAO() {
        return this.answerInfoDAO;
    }

    public void setAnswerInfoDAO(AnswerInfoDAO answerInfoDAO) {
        this.answerInfoDAO = answerInfoDAO;
    }

}