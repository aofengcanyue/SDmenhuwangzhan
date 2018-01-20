package com.regex.web.dao.green;
import java.util.List;
import com.regex.web.common.Assist;
import com.regex.web.common.dto.green.IndexEvaluationDTO;

import org.apache.ibatis.annotations.Param;
public interface IndexEvaluationDAO{
	/**
	 * 获得IndexEvaluationDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getIndexEvaluationDTORowCount(Assist assist);
	/**
	 * 获得IndexEvaluationDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<IndexEvaluationDTO> selectIndexEvaluationDTO(Assist assist);
	/**
	 * 获得一个IndexEvaluationDTO对象,以参数IndexEvaluationDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    IndexEvaluationDTO selectIndexEvaluationDTOByObj(IndexEvaluationDTO obj);
	/**
	 * 通过IndexEvaluationDTO的id获得IndexEvaluationDTO对象
	 * @param id
	 * @return
	 */
    IndexEvaluationDTO selectIndexEvaluationDTOById(Long id);
	/**
	 * 插入IndexEvaluationDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertIndexEvaluationDTO(IndexEvaluationDTO value);
	/**
	 * 插入IndexEvaluationDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyIndexEvaluationDTO(IndexEvaluationDTO value);
	/**
	 * 批量插入IndexEvaluationDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertIndexEvaluationDTOByBatch(List<IndexEvaluationDTO> value);
	/**
	 * 通过IndexEvaluationDTO的id删除IndexEvaluationDTO
	 * @param id
	 * @return
	 */
    int deleteIndexEvaluationDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除IndexEvaluationDTO
	 * @param assist
	 * @return
	 */
    int deleteIndexEvaluationDTO(Assist assist);
	/**
	 * 通过IndexEvaluationDTO的id更新IndexEvaluationDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateIndexEvaluationDTOById(IndexEvaluationDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新IndexEvaluationDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateIndexEvaluationDTO(@Param("enti") IndexEvaluationDTO value, @Param("assist") Assist assist);
	/**
	 * 通过IndexEvaluationDTO的id更新IndexEvaluationDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyIndexEvaluationDTOById(IndexEvaluationDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新IndexEvaluationDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyIndexEvaluationDTO(@Param("enti") IndexEvaluationDTO value, @Param("assist") Assist assist);
}