package com.regex.web.dao.info;
import com.regex.web.common.dto.info.TrainingDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface TrainingDAO{
	/**
	 * 获得TrainingDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getTrainingDTORowCount(Assist assist);
	/**
	 * 获得TrainingDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<TrainingDTO> selectTrainingDTO(Assist assist);
	/**
	 * 获得一个TrainingDTO对象,以参数TrainingDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    TrainingDTO selectTrainingDTOByObj(TrainingDTO obj);
	/**
	 * 通过TrainingDTO的id获得TrainingDTO对象
	 * @param id
	 * @return
	 */
    TrainingDTO selectTrainingDTOById(Long id);
	/**
	 * 插入TrainingDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertTrainingDTO(TrainingDTO value);
	/**
	 * 插入TrainingDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyTrainingDTO(TrainingDTO value);
	/**
	 * 批量插入TrainingDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertTrainingDTOByBatch(List<TrainingDTO> value);
	/**
	 * 通过TrainingDTO的id删除TrainingDTO
	 * @param id
	 * @return
	 */
    int deleteTrainingDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除TrainingDTO
	 * @param assist
	 * @return
	 */
    int deleteTrainingDTO(Assist assist);
	/**
	 * 通过TrainingDTO的id更新TrainingDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateTrainingDTOById(TrainingDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新TrainingDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateTrainingDTO(@Param("enti") TrainingDTO value, @Param("assist") Assist assist);
	/**
	 * 通过TrainingDTO的id更新TrainingDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyTrainingDTOById(TrainingDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新TrainingDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyTrainingDTO(@Param("enti") TrainingDTO value, @Param("assist") Assist assist);
}