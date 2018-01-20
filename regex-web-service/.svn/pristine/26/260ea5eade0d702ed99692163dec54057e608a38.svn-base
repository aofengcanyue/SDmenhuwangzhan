package com.regex.web.dao.evaluation;
import com.regex.web.common.dto.evaluation.EvaluationOneDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface EvaluationOneDAO{
	/**
	 * 获得EvaluationOneDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationOneDTORowCount(Assist assist);
	/**
	 * 获得EvaluationOneDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationOneDTO> selectEvaluationOneDTO(Assist assist);
	/**
	 * 获得一个EvaluationOneDTO对象,以参数EvaluationOneDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationOneDTO selectEvaluationOneDTOByObj(EvaluationOneDTO obj);
	/**
	 * 通过EvaluationOneDTO的id获得EvaluationOneDTO对象
	 * @param id
	 * @return
	 */
    EvaluationOneDTO selectEvaluationOneDTOById(Long id);
	/**
	 * 插入EvaluationOneDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationOneDTO(EvaluationOneDTO value);
	/**
	 * 插入EvaluationOneDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationOneDTO(EvaluationOneDTO value);
	/**
	 * 批量插入EvaluationOneDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationOneDTOByBatch(List<EvaluationOneDTO> value);
	/**
	 * 通过EvaluationOneDTO的id删除EvaluationOneDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationOneDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationOneDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationOneDTO(Assist assist);
	/**
	 * 通过EvaluationOneDTO的id更新EvaluationOneDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationOneDTOById(EvaluationOneDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationOneDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationOneDTO(@Param("enti") EvaluationOneDTO value, @Param("assist") Assist assist);
	/**
	 * 通过EvaluationOneDTO的id更新EvaluationOneDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationOneDTOById(EvaluationOneDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationOneDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationOneDTO(@Param("enti") EvaluationOneDTO value, @Param("assist") Assist assist);
}