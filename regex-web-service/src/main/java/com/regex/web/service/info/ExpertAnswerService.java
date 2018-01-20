package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.ExpertAnswerDTO;
import com.regex.web.common.Assist;
public interface ExpertAnswerService{
	/**
	 * 获得ExpertAnswerDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getExpertAnswerDTORowCount(Assist assist);
	/**
	 * 获得ExpertAnswerDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<ExpertAnswerDTO> selectExpertAnswerDTO(Assist assist);
	/**
	 * 获得一个ExpertAnswerDTO对象,以参数ExpertAnswerDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    ExpertAnswerDTO selectExpertAnswerDTOByObj(ExpertAnswerDTO obj);
	/**
	 * 通过ExpertAnswerDTO的id获得ExpertAnswerDTO对象
	 * @param id
	 * @return
	 */
    ExpertAnswerDTO selectExpertAnswerDTOById(Long id);
	/**
	 * 插入ExpertAnswerDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertExpertAnswerDTO(ExpertAnswerDTO value);
	/**
	 * 插入ExpertAnswerDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyExpertAnswerDTO(ExpertAnswerDTO value);
	/**
	 * 批量插入ExpertAnswerDTO到数据库
	 * @param value
	 * @return
	 */
    int insertExpertAnswerDTOByBatch(List<ExpertAnswerDTO> value);
	/**
	 * 通过ExpertAnswerDTO的id删除ExpertAnswerDTO
	 * @param id
	 * @return
	 */
    int deleteExpertAnswerDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除ExpertAnswerDTO
	 * @param assist
	 * @return
	 */
    int deleteExpertAnswerDTO(Assist assist);
	/**
	 * 通过ExpertAnswerDTO的id更新ExpertAnswerDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateExpertAnswerDTOById(ExpertAnswerDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ExpertAnswerDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateExpertAnswerDTO(ExpertAnswerDTO value,  Assist assist);
	/**
	 * 通过ExpertAnswerDTO的id更新ExpertAnswerDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyExpertAnswerDTOById(ExpertAnswerDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ExpertAnswerDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyExpertAnswerDTO(ExpertAnswerDTO value, Assist assist);
}