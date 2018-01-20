package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.ParkAccordDTO;
import com.regex.web.common.Assist;
public interface ParkAccordService{
	/**
	 * 获得ParkAccordDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getParkAccordDTORowCount(Assist assist);
	/**
	 * 获得ParkAccordDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<ParkAccordDTO> selectParkAccordDTO(Assist assist);
	/**
	 * 获得一个ParkAccordDTO对象,以参数ParkAccordDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    ParkAccordDTO selectParkAccordDTOByObj(ParkAccordDTO obj);
	/**
	 * 通过ParkAccordDTO的id获得ParkAccordDTO对象
	 * @param id
	 * @return
	 */
    ParkAccordDTO selectParkAccordDTOById(Long id);
	/**
	 * 插入ParkAccordDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertParkAccordDTO(ParkAccordDTO value);
	/**
	 * 插入ParkAccordDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyParkAccordDTO(ParkAccordDTO value);
	/**
	 * 批量插入ParkAccordDTO到数据库
	 * @param value
	 * @return
	 */
    int insertParkAccordDTOByBatch(List<ParkAccordDTO> value);
	/**
	 * 通过ParkAccordDTO的id删除ParkAccordDTO
	 * @param id
	 * @return
	 */
    int deleteParkAccordDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除ParkAccordDTO
	 * @param assist
	 * @return
	 */
    int deleteParkAccordDTO(Assist assist);
	/**
	 * 通过ParkAccordDTO的id更新ParkAccordDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateParkAccordDTOById(ParkAccordDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ParkAccordDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateParkAccordDTO(ParkAccordDTO value,  Assist assist);
	/**
	 * 通过ParkAccordDTO的id更新ParkAccordDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyParkAccordDTOById(ParkAccordDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ParkAccordDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyParkAccordDTO(ParkAccordDTO value, Assist assist);
}