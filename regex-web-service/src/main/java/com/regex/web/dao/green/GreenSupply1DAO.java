package com.regex.web.dao.green;
import com.regex.web.common.dto.green.GreenSupply1DTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface GreenSupply1DAO{
	/**
	 * 获得GreenSupply1DTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getGreenSupply1DTORowCount(Assist assist);
	/**
	 * 获得GreenSupply1DTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<GreenSupply1DTO> selectGreenSupply1DTO(Assist assist);
	/**
	 * 获得一个GreenSupply1DTO对象,以参数GreenSupply1DTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    GreenSupply1DTO selectGreenSupply1DTOByObj(GreenSupply1DTO obj);
	/**
	 * 通过GreenSupply1DTO的id获得GreenSupply1DTO对象
	 * @param id
	 * @return
	 */
    GreenSupply1DTO selectGreenSupply1DTOById(Long id);
	/**
	 * 插入GreenSupply1DTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenSupply1DTO(GreenSupply1DTO value);
	/**
	 * 插入GreenSupply1DTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyGreenSupply1DTO(GreenSupply1DTO value);
	/**
	 * 批量插入GreenSupply1DTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenSupply1DTOByBatch(List<GreenSupply1DTO> value);
	/**
	 * 通过GreenSupply1DTO的id删除GreenSupply1DTO
	 * @param id
	 * @return
	 */
    int deleteGreenSupply1DTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除GreenSupply1DTO
	 * @param assist
	 * @return
	 */
    int deleteGreenSupply1DTO(Assist assist);
	/**
	 * 通过GreenSupply1DTO的id更新GreenSupply1DTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateGreenSupply1DTOById(GreenSupply1DTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenSupply1DTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateGreenSupply1DTO(@Param("enti") GreenSupply1DTO value, @Param("assist") Assist assist);
	/**
	 * 通过GreenSupply1DTO的id更新GreenSupply1DTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyGreenSupply1DTOById(GreenSupply1DTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenSupply1DTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyGreenSupply1DTO(@Param("enti") GreenSupply1DTO value, @Param("assist") Assist assist);
}