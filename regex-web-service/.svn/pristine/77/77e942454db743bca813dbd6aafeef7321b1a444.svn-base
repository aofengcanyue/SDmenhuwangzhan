package com.regex.web.dao.info;
import com.regex.web.common.dto.info.SupplyEvaluationResultDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface SupplyEvaluationResultDAO{
	/**
	 * 获得SupplyEvaluationResultDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSupplyEvaluationResultDTORowCount(Assist assist);
	/**
	 * 获得SupplyEvaluationResultDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SupplyEvaluationResultDTO> selectSupplyEvaluationResultDTO(Assist assist);
	/**
	 * 获得一个SupplyEvaluationResultDTO对象,以参数SupplyEvaluationResultDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SupplyEvaluationResultDTO selectSupplyEvaluationResultDTOByObj(SupplyEvaluationResultDTO obj);
	/**
	 * 通过SupplyEvaluationResultDTO的id获得SupplyEvaluationResultDTO对象
	 * @param id
	 * @return
	 */
    SupplyEvaluationResultDTO selectSupplyEvaluationResultDTOById(Long id);
	/**
	 * 插入SupplyEvaluationResultDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSupplyEvaluationResultDTO(SupplyEvaluationResultDTO value);
	/**
	 * 插入SupplyEvaluationResultDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySupplyEvaluationResultDTO(SupplyEvaluationResultDTO value);
	/**
	 * 批量插入SupplyEvaluationResultDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSupplyEvaluationResultDTOByBatch(List<SupplyEvaluationResultDTO> value);
	/**
	 * 通过SupplyEvaluationResultDTO的id删除SupplyEvaluationResultDTO
	 * @param id
	 * @return
	 */
    int deleteSupplyEvaluationResultDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除SupplyEvaluationResultDTO
	 * @param assist
	 * @return
	 */
    int deleteSupplyEvaluationResultDTO(Assist assist);
	/**
	 * 通过SupplyEvaluationResultDTO的id更新SupplyEvaluationResultDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSupplyEvaluationResultDTOById(SupplyEvaluationResultDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新SupplyEvaluationResultDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSupplyEvaluationResultDTO(@Param("enti") SupplyEvaluationResultDTO value, @Param("assist") Assist assist);
	/**
	 * 通过SupplyEvaluationResultDTO的id更新SupplyEvaluationResultDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySupplyEvaluationResultDTOById(SupplyEvaluationResultDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新SupplyEvaluationResultDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySupplyEvaluationResultDTO(@Param("enti") SupplyEvaluationResultDTO value, @Param("assist") Assist assist);
}