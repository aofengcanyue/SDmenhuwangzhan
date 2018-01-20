package com.regex.web.dao.green;
import com.regex.web.common.dto.green.GreenParkDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface GreenParkDAO{
	/**
	 * 获得GreenParkDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getGreenParkDTORowCount(Assist assist);
	/**
	 * 获得GreenParkDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<GreenParkDTO> selectGreenParkDTO(Assist assist);
	/**
	 * 获得一个GreenParkDTO对象,以参数GreenParkDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    GreenParkDTO selectGreenParkDTOByObj(GreenParkDTO obj);
	/**
	 * 通过GreenParkDTO的id获得GreenParkDTO对象
	 * @param id
	 * @return
	 */
    GreenParkDTO selectGreenParkDTOById(Long id);
	/**
	 * 插入GreenParkDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenParkDTO(GreenParkDTO value);
	/**
	 * 插入GreenParkDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyGreenParkDTO(GreenParkDTO value);
	/**
	 * 批量插入GreenParkDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenParkDTOByBatch(List<GreenParkDTO> value);
	/**
	 * 通过GreenParkDTO的id删除GreenParkDTO
	 * @param id
	 * @return
	 */
    int deleteGreenParkDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除GreenParkDTO
	 * @param assist
	 * @return
	 */
    int deleteGreenParkDTO(Assist assist);
	/**
	 * 通过GreenParkDTO的id更新GreenParkDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateGreenParkDTOById(GreenParkDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenParkDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateGreenParkDTO(@Param("enti") GreenParkDTO value, @Param("assist") Assist assist);
	/**
	 * 通过GreenParkDTO的id更新GreenParkDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyGreenParkDTOById(GreenParkDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenParkDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyGreenParkDTO(@Param("enti") GreenParkDTO value, @Param("assist") Assist assist);
}