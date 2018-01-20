package com.regex.web.service.evaluation;
import java.util.List;
import com.regex.web.common.dto.evaluation.EvaluationZeroDTO;
import com.regex.web.common.Assist;
public interface EvaluationZeroService{
	/**
	 * 获得EvaluationZeroDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationZeroDTORowCount(Assist assist);
	/**
	 * 获得EvaluationZeroDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationZeroDTO> selectEvaluationZeroDTO(Assist assist);
	/**
	 * 获得一个EvaluationZeroDTO对象,以参数EvaluationZeroDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationZeroDTO selectEvaluationZeroDTOByObj(EvaluationZeroDTO obj);
	/**
	 * 通过EvaluationZeroDTO的id获得EvaluationZeroDTO对象
	 * @param id
	 * @return
	 */
    EvaluationZeroDTO selectEvaluationZeroDTOById(Long id);
	/**
	 * 插入EvaluationZeroDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationZeroDTO(EvaluationZeroDTO value);
	/**
	 * 插入EvaluationZeroDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationZeroDTO(EvaluationZeroDTO value);
	/**
	 * 批量插入EvaluationZeroDTO到数据库
	 * @param value
	 * @return
	 */
    int insertEvaluationZeroDTOByBatch(List<EvaluationZeroDTO> value);
	/**
	 * 通过EvaluationZeroDTO的id删除EvaluationZeroDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationZeroDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationZeroDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationZeroDTO(Assist assist);
	/**
	 * 通过EvaluationZeroDTO的id更新EvaluationZeroDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationZeroDTOById(EvaluationZeroDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationZeroDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationZeroDTO(EvaluationZeroDTO value,  Assist assist);
	/**
	 * 通过EvaluationZeroDTO的id更新EvaluationZeroDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationZeroDTOById(EvaluationZeroDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationZeroDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationZeroDTO(EvaluationZeroDTO value, Assist assist);
}