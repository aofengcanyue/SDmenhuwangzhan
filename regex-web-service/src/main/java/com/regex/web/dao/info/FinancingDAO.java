package com.regex.web.dao.info;
import com.regex.web.common.dto.info.FinancingDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface FinancingDAO{
	/**
	 * 获得FinancingDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getFinancingDTORowCount(Assist assist);
	/**
	 * 获得FinancingDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<FinancingDTO> selectFinancingDTO(Assist assist);
	/**
	 * 获得一个FinancingDTO对象,以参数FinancingDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    FinancingDTO selectFinancingDTOByObj(FinancingDTO obj);
	/**
	 * 通过FinancingDTO的id获得FinancingDTO对象
	 * @param id
	 * @return
	 */
    FinancingDTO selectFinancingDTOById(Long id);
	/**
	 * 插入FinancingDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertFinancingDTO(FinancingDTO value);
	/**
	 * 插入FinancingDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyFinancingDTO(FinancingDTO value);
	/**
	 * 批量插入FinancingDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertFinancingDTOByBatch(List<FinancingDTO> value);
	/**
	 * 通过FinancingDTO的id删除FinancingDTO
	 * @param id
	 * @return
	 */
    int deleteFinancingDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除FinancingDTO
	 * @param assist
	 * @return
	 */
    int deleteFinancingDTO(Assist assist);
	/**
	 * 通过FinancingDTO的id更新FinancingDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateFinancingDTOById(FinancingDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新FinancingDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateFinancingDTO(@Param("enti") FinancingDTO value, @Param("assist") Assist assist);
	/**
	 * 通过FinancingDTO的id更新FinancingDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyFinancingDTOById(FinancingDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新FinancingDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyFinancingDTO(@Param("enti") FinancingDTO value, @Param("assist") Assist assist);
}