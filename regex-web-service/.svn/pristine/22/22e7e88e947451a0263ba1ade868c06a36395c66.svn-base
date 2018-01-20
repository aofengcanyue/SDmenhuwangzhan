package com.regex.web.service.green;
import java.util.List;
import com.regex.web.common.dto.green.GreenSupply2DTO;
import com.regex.web.common.Assist;
public interface GreenSupply2Service{
	/**
	 * 获得GreenSupply2DTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getGreenSupply2DTORowCount(Assist assist);
	/**
	 * 获得GreenSupply2DTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<GreenSupply2DTO> selectGreenSupply2DTO(Assist assist);
	/**
	 * 获得一个GreenSupply2DTO对象,以参数GreenSupply2DTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    GreenSupply2DTO selectGreenSupply2DTOByObj(GreenSupply2DTO obj);
	/**
	 * 通过GreenSupply2DTO的id获得GreenSupply2DTO对象
	 * @param id
	 * @return
	 */
    GreenSupply2DTO selectGreenSupply2DTOById(Long id);
	/**
	 * 插入GreenSupply2DTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenSupply2DTO(GreenSupply2DTO value);
	/**
	 * 插入GreenSupply2DTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyGreenSupply2DTO(GreenSupply2DTO value);
	/**
	 * 批量插入GreenSupply2DTO到数据库
	 * @param value
	 * @return
	 */
    int insertGreenSupply2DTOByBatch(List<GreenSupply2DTO> value);
	/**
	 * 通过GreenSupply2DTO的id删除GreenSupply2DTO
	 * @param id
	 * @return
	 */
    int deleteGreenSupply2DTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除GreenSupply2DTO
	 * @param assist
	 * @return
	 */
    int deleteGreenSupply2DTO(Assist assist);
	/**
	 * 通过GreenSupply2DTO的id更新GreenSupply2DTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateGreenSupply2DTOById(GreenSupply2DTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenSupply2DTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateGreenSupply2DTO(GreenSupply2DTO value,  Assist assist);
	/**
	 * 通过GreenSupply2DTO的id更新GreenSupply2DTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyGreenSupply2DTOById(GreenSupply2DTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenSupply2DTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyGreenSupply2DTO(GreenSupply2DTO value, Assist assist);
}