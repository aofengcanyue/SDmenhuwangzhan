package com.regex.web.dao.evaluation;
import com.regex.web.common.dto.evaluation.EvaluationFourDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface EvaluationFourDAO{
	/**
	 * 获得EvaluationFourDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationFourDTORowCount(Assist assist);
	/**
	 * 获得EvaluationFourDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationFourDTO> selectEvaluationFourDTO(Assist assist);
	/**
	 * 获得一个EvaluationFourDTO对象,以参数EvaluationFourDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationFourDTO selectEvaluationFourDTOByObj(EvaluationFourDTO obj);
	/**
	 * 通过EvaluationFourDTO的id获得EvaluationFourDTO对象
	 * @param id
	 * @return
	 */
    EvaluationFourDTO selectEvaluationFourDTOById(Long id);
	/**
	 * 插入EvaluationFourDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationFourDTO(EvaluationFourDTO value);
	/**
	 * 插入EvaluationFourDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationFourDTO(EvaluationFourDTO value);
	/**
	 * 批量插入EvaluationFourDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationFourDTOByBatch(List<EvaluationFourDTO> value);
	/**
	 * 通过EvaluationFourDTO的id删除EvaluationFourDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationFourDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationFourDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationFourDTO(Assist assist);
	/**
	 * 通过EvaluationFourDTO的id更新EvaluationFourDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationFourDTOById(EvaluationFourDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationFourDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationFourDTO(@Param("enti") EvaluationFourDTO value, @Param("assist") Assist assist);
	/**
	 * 通过EvaluationFourDTO的id更新EvaluationFourDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationFourDTOById(EvaluationFourDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationFourDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationFourDTO(@Param("enti") EvaluationFourDTO value, @Param("assist") Assist assist);
}