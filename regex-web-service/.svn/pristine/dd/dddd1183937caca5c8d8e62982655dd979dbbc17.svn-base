package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.EfficiencyDTO;
import com.regex.web.common.Assist;
public interface EfficiencyService{
	/**
	 * 获得EfficiencyDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getEfficiencyDTORowCount(Assist assist);
	/**
	 * 获得EfficiencyDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<EfficiencyDTO> selectEfficiencyDTO(Assist assist);
	/**
	 * 获得一个EfficiencyDTO对象,以参数EfficiencyDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    EfficiencyDTO selectEfficiencyDTOByObj(EfficiencyDTO obj);
	/**
	 * 通过EfficiencyDTO的id获得EfficiencyDTO对象
	 * @param id
	 * @return
	 */
    EfficiencyDTO selectEfficiencyDTOById(Long id);
	/**
	 * 插入EfficiencyDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertEfficiencyDTO(EfficiencyDTO value);
	/**
	 * 插入EfficiencyDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyEfficiencyDTO(EfficiencyDTO value);
	/**
	 * 批量插入EfficiencyDTO到数据库
	 * @param value
	 * @return
	 */
    int insertEfficiencyDTOByBatch(List<EfficiencyDTO> value);
	/**
	 * 通过EfficiencyDTO的id删除EfficiencyDTO
	 * @param id
	 * @return
	 */
    int deleteEfficiencyDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除EfficiencyDTO
	 * @param assist
	 * @return
	 */
    int deleteEfficiencyDTO(Assist assist);
	/**
	 * 通过EfficiencyDTO的id更新EfficiencyDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateEfficiencyDTOById(EfficiencyDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EfficiencyDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateEfficiencyDTO(EfficiencyDTO value,  Assist assist);
	/**
	 * 通过EfficiencyDTO的id更新EfficiencyDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyEfficiencyDTOById(EfficiencyDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新EfficiencyDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyEfficiencyDTO(EfficiencyDTO value, Assist assist);
}