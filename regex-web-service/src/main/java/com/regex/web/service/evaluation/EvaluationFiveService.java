package com.regex.web.service.evaluation;
import java.util.List;
import com.regex.web.common.dto.evaluation.EvaluationFiveDTO;
import com.regex.web.common.Assist;
public interface EvaluationFiveService{
	/**
	 * 获得EvaluationFiveDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationFiveDTORowCount(Assist assist);
	/**
	 * 获得EvaluationFiveDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationFiveDTO> selectEvaluationFiveDTO(Assist assist);
	/**
	 * 获得一个EvaluationFiveDTO对象,以参数EvaluationFiveDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationFiveDTO selectEvaluationFiveDTOByObj(EvaluationFiveDTO obj);
	/**
	 * 通过EvaluationFiveDTO的id获得EvaluationFiveDTO对象
	 * @param id
	 * @return
	 */
    EvaluationFiveDTO selectEvaluationFiveDTOById(Long id);
	/**
	 * 插入EvaluationFiveDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationFiveDTO(EvaluationFiveDTO value);
	/**
	 * 插入EvaluationFiveDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationFiveDTO(EvaluationFiveDTO value);
	/**
	 * 批量插入EvaluationFiveDTO到数据库
	 * @param value
	 * @return
	 */
    int insertEvaluationFiveDTOByBatch(List<EvaluationFiveDTO> value);
	/**
	 * 通过EvaluationFiveDTO的id删除EvaluationFiveDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationFiveDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationFiveDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationFiveDTO(Assist assist);
	/**
	 * 通过EvaluationFiveDTO的id更新EvaluationFiveDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationFiveDTOById(EvaluationFiveDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationFiveDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationFiveDTO(EvaluationFiveDTO value,  Assist assist);
	/**
	 * 通过EvaluationFiveDTO的id更新EvaluationFiveDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationFiveDTOById(EvaluationFiveDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationFiveDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationFiveDTO(EvaluationFiveDTO value, Assist assist);
}