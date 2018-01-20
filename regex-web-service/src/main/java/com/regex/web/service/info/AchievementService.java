package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.AchievementDTO;
import com.regex.web.common.Assist;
public interface AchievementService{
	/**
	 * 获得AchievementDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getAchievementDTORowCount(Assist assist);
	/**
	 * 获得AchievementDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<AchievementDTO> selectAchievementDTO(Assist assist);
	/**
	 * 获得一个AchievementDTO对象,以参数AchievementDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    AchievementDTO selectAchievementDTOByObj(AchievementDTO obj);
	/**
	 * 通过AchievementDTO的id获得AchievementDTO对象
	 * @param id
	 * @return
	 */
    AchievementDTO selectAchievementDTOById(Long id);
	/**
	 * 插入AchievementDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertAchievementDTO(AchievementDTO value);
	/**
	 * 插入AchievementDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyAchievementDTO(AchievementDTO value);
	/**
	 * 批量插入AchievementDTO到数据库
	 * @param value
	 * @return
	 */
    int insertAchievementDTOByBatch(List<AchievementDTO> value);
	/**
	 * 通过AchievementDTO的id删除AchievementDTO
	 * @param id
	 * @return
	 */
    int deleteAchievementDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除AchievementDTO
	 * @param assist
	 * @return
	 */
    int deleteAchievementDTO(Assist assist);
	/**
	 * 通过AchievementDTO的id更新AchievementDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateAchievementDTOById(AchievementDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新AchievementDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateAchievementDTO(AchievementDTO value,  Assist assist);
	/**
	 * 通过AchievementDTO的id更新AchievementDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyAchievementDTOById(AchievementDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新AchievementDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyAchievementDTO(AchievementDTO value, Assist assist);
}