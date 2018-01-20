package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.CommonAccordEvaluateDTO;
import com.regex.web.common.Assist;
public interface CommonAccordEvaluateService{
	/**
	 * 获得CommonAccordEvaluateDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCommonAccordEvaluateDTORowCount(Assist assist);
	/**
	 * 获得CommonAccordEvaluateDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<CommonAccordEvaluateDTO> selectCommonAccordEvaluateDTO(Assist assist);
	/**
	 * 获得一个CommonAccordEvaluateDTO对象,以参数CommonAccordEvaluateDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    CommonAccordEvaluateDTO selectCommonAccordEvaluateDTOByObj(CommonAccordEvaluateDTO obj);
	/**
	 * 通过CommonAccordEvaluateDTO的id获得CommonAccordEvaluateDTO对象
	 * @param id
	 * @return
	 */
    CommonAccordEvaluateDTO selectCommonAccordEvaluateDTOById(Long id);
	/**
	 * 插入CommonAccordEvaluateDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value);
	/**
	 * 插入CommonAccordEvaluateDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value);
	/**
	 * 批量插入CommonAccordEvaluateDTO到数据库
	 * @param value
	 * @return
	 */
    int insertCommonAccordEvaluateDTOByBatch(List<CommonAccordEvaluateDTO> value);
	/**
	 * 通过CommonAccordEvaluateDTO的id删除CommonAccordEvaluateDTO
	 * @param id
	 * @return
	 */
    int deleteCommonAccordEvaluateDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除CommonAccordEvaluateDTO
	 * @param assist
	 * @return
	 */
    int deleteCommonAccordEvaluateDTO(Assist assist);
	/**
	 * 通过CommonAccordEvaluateDTO的id更新CommonAccordEvaluateDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCommonAccordEvaluateDTOById(CommonAccordEvaluateDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新CommonAccordEvaluateDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value,  Assist assist);
	/**
	 * 通过CommonAccordEvaluateDTO的id更新CommonAccordEvaluateDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCommonAccordEvaluateDTOById(CommonAccordEvaluateDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新CommonAccordEvaluateDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCommonAccordEvaluateDTO(CommonAccordEvaluateDTO value, Assist assist);
}