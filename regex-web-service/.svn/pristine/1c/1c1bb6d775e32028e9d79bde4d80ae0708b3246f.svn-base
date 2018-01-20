package com.regex.web.service.green;
import java.util.List;
import com.regex.web.common.dto.green.ParkAssessmentDTO;
import com.regex.web.common.Assist;
public interface ParkAssessmentService{
	/**
	 * 获得ParkAssessmentDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getParkAssessmentDTORowCount(Assist assist);
	/**
	 * 获得ParkAssessmentDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<ParkAssessmentDTO> selectParkAssessmentDTO(Assist assist);
	/**
	 * 获得一个ParkAssessmentDTO对象,以参数ParkAssessmentDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    ParkAssessmentDTO selectParkAssessmentDTOByObj(ParkAssessmentDTO obj);
	/**
	 * 通过ParkAssessmentDTO的id获得ParkAssessmentDTO对象
	 * @param id
	 * @return
	 */
    ParkAssessmentDTO selectParkAssessmentDTOById(Long id);
	/**
	 * 插入ParkAssessmentDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertParkAssessmentDTO(ParkAssessmentDTO value);
	/**
	 * 插入ParkAssessmentDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyParkAssessmentDTO(ParkAssessmentDTO value);
	/**
	 * 批量插入ParkAssessmentDTO到数据库
	 * @param value
	 * @return
	 */
    int insertParkAssessmentDTOByBatch(List<ParkAssessmentDTO> value);
	/**
	 * 通过ParkAssessmentDTO的id删除ParkAssessmentDTO
	 * @param id
	 * @return
	 */
    int deleteParkAssessmentDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除ParkAssessmentDTO
	 * @param assist
	 * @return
	 */
    int deleteParkAssessmentDTO(Assist assist);
	/**
	 * 通过ParkAssessmentDTO的id更新ParkAssessmentDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateParkAssessmentDTOById(ParkAssessmentDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ParkAssessmentDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateParkAssessmentDTO(ParkAssessmentDTO value,  Assist assist);
	/**
	 * 通过ParkAssessmentDTO的id更新ParkAssessmentDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyParkAssessmentDTOById(ParkAssessmentDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新ParkAssessmentDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyParkAssessmentDTO(ParkAssessmentDTO value, Assist assist);
}