package com.regex.web.dao.info;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.MechanismDTO;
public interface MechanismDAO{
	/**
	 * 获得MechanismDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getMechanismDTORowCount(Assist assist);
	/**
	 * 获得MechanismDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<MechanismDTO> selectMechanismDTO(Assist assist);
	/**
	 * 获得一个MechanismDTO对象,以参数MechanismDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    MechanismDTO selectMechanismDTOByObj(MechanismDTO obj);
	/**
	 * 通过MechanismDTO的id获得MechanismDTO对象
	 * @param id
	 * @return
	 */
    MechanismDTO selectMechanismDTOById(Long id);
	/**
	 * 插入MechanismDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertMechanismDTO(MechanismDTO value);
	/**
	 * 插入MechanismDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyMechanismDTO(MechanismDTO value);
	/**
	 * 批量插入MechanismDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertMechanismDTOByBatch(List<MechanismDTO> value);
	/**
	 * 通过MechanismDTO的id删除MechanismDTO
	 * @param id
	 * @return
	 */
    int deleteMechanismDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除MechanismDTO
	 * @param assist
	 * @return
	 */
    int deleteMechanismDTO(Assist assist);
	/**
	 * 通过MechanismDTO的id更新MechanismDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateMechanismDTOById(MechanismDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新MechanismDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateMechanismDTO(@Param("enti") MechanismDTO value, @Param("assist") Assist assist);
	/**
	 * 通过MechanismDTO的id更新MechanismDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyMechanismDTOById(MechanismDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新MechanismDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyMechanismDTO(@Param("enti") MechanismDTO value, @Param("assist") Assist assist);
}