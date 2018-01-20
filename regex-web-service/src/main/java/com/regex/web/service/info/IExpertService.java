package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.ExpertDTO;
import com.regex.web.common.Assist;
public interface IExpertService{
	/**
	 * 获得ExpertDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getExpertDTORowCount(Assist assist);
	/**
	 * 获得ExpertDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<ExpertDTO> selectExpertDTO(Assist assist);
	/**
	 * 获得一个ExpertDTO对象,以参数ExpertDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    ExpertDTO selectExpertDTOByObj(ExpertDTO obj);
	/**
	 * 通过ExpertDTO的id获得ExpertDTO对象
	 * @param id
	 * @return
	 */
    ExpertDTO selectExpertDTOById(Long id);
	/**
	 * 插入ExpertDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertExpertDTO(ExpertDTO value);
	/**
	 * 插入ExpertDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyExpertDTO(ExpertDTO value);
	/**
	 * 批量插入ExpertDTO到数据库
	 * @param value
	 * @return
	 */
    int insertExpertDTOByBatch(List<ExpertDTO> value);
	/**
	 * 通过ExpertDTO的id删除ExpertDTO
	 * @param id
	 * @return
	 */
    int deleteExpertDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除ExpertDTO
	 * @param assist
	 * @return
	 */
    int deleteExpertDTO(Assist assist);
	/**
	 * 通过ExpertDTO的id更新ExpertDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateExpertDTOById(ExpertDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ExpertDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateExpertDTO(ExpertDTO value,  Assist assist);
	/**
	 * 通过ExpertDTO的id更新ExpertDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyExpertDTOById(ExpertDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ExpertDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyExpertDTO(ExpertDTO value, Assist assist);
}