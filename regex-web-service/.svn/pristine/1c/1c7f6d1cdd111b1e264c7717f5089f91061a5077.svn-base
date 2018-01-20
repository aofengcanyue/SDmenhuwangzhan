package com.regex.web.dao.evaluation;
import com.regex.web.common.dto.evaluation.EvaluationResultDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface EvaluationResultDAO{
	/**
	 * 获得EvaluationResultDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationResultDTORowCount(Assist assist);
	/**
	 * 获得EvaluationResultDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationResultDTO> selectEvaluationResultDTO(Assist assist);
	/**
	 * 获得一个EvaluationResultDTO对象,以参数EvaluationResultDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationResultDTO selectEvaluationResultDTOByObj(EvaluationResultDTO obj);
	/**
	 * 通过EvaluationResultDTO的id获得EvaluationResultDTO对象
	 * @param id
	 * @return
	 */
    EvaluationResultDTO selectEvaluationResultDTOById(Long id);
	/**
	 * 插入EvaluationResultDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationResultDTO(EvaluationResultDTO value);
	/**
	 * 插入EvaluationResultDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationResultDTO(EvaluationResultDTO value);
	/**
	 * 批量插入EvaluationResultDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationResultDTOByBatch(List<EvaluationResultDTO> value);
	/**
	 * 通过EvaluationResultDTO的id删除EvaluationResultDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationResultDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationResultDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationResultDTO(Assist assist);
	/**
	 * 通过EvaluationResultDTO的id更新EvaluationResultDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationResultDTOById(EvaluationResultDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationResultDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationResultDTO(@Param("enti") EvaluationResultDTO value, @Param("assist") Assist assist);
	/**
	 * 通过EvaluationResultDTO的id更新EvaluationResultDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationResultDTOById(EvaluationResultDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationResultDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationResultDTO(@Param("enti") EvaluationResultDTO value, @Param("assist") Assist assist);
}