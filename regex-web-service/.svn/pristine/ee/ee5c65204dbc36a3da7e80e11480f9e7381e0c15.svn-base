package com.regex.web.service.info.impl;
import java.util.List;
import com.regex.web.dao.info.AchievementDAO;
import com.regex.web.common.dto.info.AchievementDTO;
import com.regex.web.common.Assist;
import com.regex.web.service.info.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AchievementServiceImpl implements AchievementService{
    @Autowired
    private AchievementDAO achievementDAO;
    @Override
    public long getAchievementDTORowCount(Assist assist){
        return achievementDAO.getAchievementDTORowCount(assist);
    }
    @Override
    public List<AchievementDTO> selectAchievementDTO(Assist assist){
        return achievementDAO.selectAchievementDTO(assist);
    }
    @Override
    public AchievementDTO selectAchievementDTOByObj(AchievementDTO obj){
        return achievementDAO.selectAchievementDTOByObj(obj);
    }
    @Override
    public AchievementDTO selectAchievementDTOById(Long id){
        return achievementDAO.selectAchievementDTOById(id);
    }
    @Override
    public int insertAchievementDTO(AchievementDTO value){
        return achievementDAO.insertAchievementDTO(value);
    }
    @Override
    public int insertNonEmptyAchievementDTO(AchievementDTO value){
        return achievementDAO.insertNonEmptyAchievementDTO(value);
    }
    @Override
    public int insertAchievementDTOByBatch(List<AchievementDTO> value){
        return achievementDAO.insertAchievementDTOByBatch(value);
    }
    @Override
    public int deleteAchievementDTOById(Long id){
        return achievementDAO.deleteAchievementDTOById(id);
    }
    @Override
    public int deleteAchievementDTO(Assist assist){
        return achievementDAO.deleteAchievementDTO(assist);
    }
    @Override
    public int updateAchievementDTOById(AchievementDTO enti){
        return achievementDAO.updateAchievementDTOById(enti);
    }
    @Override
    public int updateAchievementDTO(AchievementDTO value, Assist assist){
        return achievementDAO.updateAchievementDTO(value,assist);
    }
    @Override
    public int updateNonEmptyAchievementDTOById(AchievementDTO enti){
        return achievementDAO.updateNonEmptyAchievementDTOById(enti);
    }
    @Override
    public int updateNonEmptyAchievementDTO(AchievementDTO value, Assist assist){
        return achievementDAO.updateNonEmptyAchievementDTO(value,assist);
    }

    public AchievementDAO getAchievementDAO() {
        return this.achievementDAO;
    }

    public void setAchievementDAO(AchievementDAO achievementDAO) {
        this.achievementDAO = achievementDAO;
    }

}