package com.regex.web.service.evaluation;
import java.util.List;
import com.regex.web.common.dto.evaluation.EvaluationTwoDTO;
import com.regex.web.common.Assist;
public interface EvaluationTwoService{
	/**
	 * 获得EvaluationTwoDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationTwoDTORowCount(Assist assist);
	/**
	 * 获得EvaluationTwoDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationTwoDTO> selectEvaluationTwoDTO(Assist assist);
	/**
	 * 获得一个EvaluationTwoDTO对象,以参数EvaluationTwoDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationTwoDTO selectEvaluationTwoDTOByObj(EvaluationTwoDTO obj);
	/**
	 * 通过EvaluationTwoDTO的id获得EvaluationTwoDTO对象
	 * @param id
	 * @return
	 */
    EvaluationTwoDTO selectEvaluationTwoDTOById(Long id);
	/**
	 * 插入EvaluationTwoDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationTwoDTO(EvaluationTwoDTO value);
	/**
	 * 插入EvaluationTwoDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationTwoDTO(EvaluationTwoDTO value);
	/**
	 * 批量插入EvaluationTwoDTO到数据库
	 * @param value
	 * @return
	 */
    int insertEvaluationTwoDTOByBatch(List<EvaluationTwoDTO> value);
	/**
	 * 通过EvaluationTwoDTO的id删除EvaluationTwoDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationTwoDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationTwoDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationTwoDTO(Assist assist);
	/**
	 * 通过EvaluationTwoDTO的id更新EvaluationTwoDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationTwoDTOById(EvaluationTwoDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationTwoDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationTwoDTO(EvaluationTwoDTO value,  Assist assist);
	/**
	 * 通过EvaluationTwoDTO的id更新EvaluationTwoDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationTwoDTOById(EvaluationTwoDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationTwoDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationTwoDTO(EvaluationTwoDTO value, Assist assist);
}