package com.regex.web.dao.green;
import com.regex.web.common.dto.green.GreenParkEvaluationDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface GreenParkEvaluationDAO{
	/**
	 * 获得GreenParkEvaluationDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getGreenParkEvaluationDTORowCount(Assist assist);
	/**
	 * 获得GreenParkEvaluationDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<GreenParkEvaluationDTO> selectGreenParkEvaluationDTO(Assist assist);
	/**
	 * 获得一个GreenParkEvaluationDTO对象,以参数GreenParkEvaluationDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    GreenParkEvaluationDTO selectGreenParkEvaluationDTOByObj(GreenParkEvaluationDTO obj);
	/**
	 * 通过GreenParkEvaluationDTO的id获得GreenParkEvaluationDTO对象
	 * @param id
	 * @return
	 */
    GreenParkEvaluationDTO selectGreenParkEvaluationDTOById(Long id);
	/**
	 * 插入GreenParkEvaluationDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenParkEvaluationDTO(GreenParkEvaluationDTO value);
	/**
	 * 插入GreenParkEvaluationDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyGreenParkEvaluationDTO(GreenParkEvaluationDTO value);
	/**
	 * 批量插入GreenParkEvaluationDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenParkEvaluationDTOByBatch(List<GreenParkEvaluationDTO> value);
	/**
	 * 通过GreenParkEvaluationDTO的id删除GreenParkEvaluationDTO
	 * @param id
	 * @return
	 */
    int deleteGreenParkEvaluationDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除GreenParkEvaluationDTO
	 * @param assist
	 * @return
	 */
    int deleteGreenParkEvaluationDTO(Assist assist);
	/**
	 * 通过GreenParkEvaluationDTO的id更新GreenParkEvaluationDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateGreenParkEvaluationDTOById(GreenParkEvaluationDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenParkEvaluationDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateGreenParkEvaluationDTO(@Param("enti") GreenParkEvaluationDTO value, @Param("assist") Assist assist);
	/**
	 * 通过GreenParkEvaluationDTO的id更新GreenParkEvaluationDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyGreenParkEvaluationDTOById(GreenParkEvaluationDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenParkEvaluationDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyGreenParkEvaluationDTO(@Param("enti") GreenParkEvaluationDTO value, @Param("assist") Assist assist);
}