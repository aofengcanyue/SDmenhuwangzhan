package com.regex.web.dao.evaluation;
import com.regex.web.common.dto.evaluation.EvaluationThreeDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface EvaluationThreeDAO{
	/**
	 * 获得EvaluationThreeDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEvaluationThreeDTORowCount(Assist assist);
	/**
	 * 获得EvaluationThreeDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EvaluationThreeDTO> selectEvaluationThreeDTO(Assist assist);
	/**
	 * 获得一个EvaluationThreeDTO对象,以参数EvaluationThreeDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EvaluationThreeDTO selectEvaluationThreeDTOByObj(EvaluationThreeDTO obj);
	/**
	 * 通过EvaluationThreeDTO的id获得EvaluationThreeDTO对象
	 * @param id
	 * @return
	 */
    EvaluationThreeDTO selectEvaluationThreeDTOById(Long id);
	/**
	 * 插入EvaluationThreeDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationThreeDTO(EvaluationThreeDTO value);
	/**
	 * 插入EvaluationThreeDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEvaluationThreeDTO(EvaluationThreeDTO value);
	/**
	 * 批量插入EvaluationThreeDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEvaluationThreeDTOByBatch(List<EvaluationThreeDTO> value);
	/**
	 * 通过EvaluationThreeDTO的id删除EvaluationThreeDTO
	 * @param id
	 * @return
	 */
    int deleteEvaluationThreeDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EvaluationThreeDTO
	 * @param assist
	 * @return
	 */
    int deleteEvaluationThreeDTO(Assist assist);
	/**
	 * 通过EvaluationThreeDTO的id更新EvaluationThreeDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEvaluationThreeDTOById(EvaluationThreeDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationThreeDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEvaluationThreeDTO(@Param("enti") EvaluationThreeDTO value, @Param("assist") Assist assist);
	/**
	 * 通过EvaluationThreeDTO的id更新EvaluationThreeDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEvaluationThreeDTOById(EvaluationThreeDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EvaluationThreeDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEvaluationThreeDTO(@Param("enti") EvaluationThreeDTO value, @Param("assist") Assist assist);
}