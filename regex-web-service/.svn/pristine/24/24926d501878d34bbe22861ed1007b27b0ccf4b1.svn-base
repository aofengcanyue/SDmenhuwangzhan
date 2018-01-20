package com.regex.web.dao.evaluation;
import com.regex.web.common.dto.evaluation.EvaluationSixDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface EvaluationSixDAO{
	/**
	 * 获得EvaluationSixDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationSixDTORowCount(Assist assist);
	/**
	 * 获得EvaluationSixDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationSixDTO> selectEvaluationSixDTO(Assist assist);
	/**
	 * 获得一个EvaluationSixDTO对象,以参数EvaluationSixDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationSixDTO selectEvaluationSixDTOByObj(EvaluationSixDTO obj);
	/**
	 * 通过EvaluationSixDTO的id获得EvaluationSixDTO对象
	 * @param id
	 * @return
	 */
    EvaluationSixDTO selectEvaluationSixDTOById(Long id);
	/**
	 * 插入EvaluationSixDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationSixDTO(EvaluationSixDTO value);
	/**
	 * 插入EvaluationSixDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationSixDTO(EvaluationSixDTO value);
	/**
	 * 批量插入EvaluationSixDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationSixDTOByBatch(List<EvaluationSixDTO> value);
	/**
	 * 通过EvaluationSixDTO的id删除EvaluationSixDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationSixDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationSixDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationSixDTO(Assist assist);
	/**
	 * 通过EvaluationSixDTO的id更新EvaluationSixDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationSixDTOById(EvaluationSixDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationSixDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationSixDTO(@Param("enti") EvaluationSixDTO value, @Param("assist") Assist assist);
	/**
	 * 通过EvaluationSixDTO的id更新EvaluationSixDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationSixDTOById(EvaluationSixDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationSixDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationSixDTO(@Param("enti") EvaluationSixDTO value, @Param("assist") Assist assist);
}