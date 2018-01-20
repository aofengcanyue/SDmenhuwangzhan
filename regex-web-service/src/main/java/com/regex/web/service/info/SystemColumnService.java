package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.SystemColumnDTO;
import com.regex.web.common.Assist;
public interface SystemColumnService{
	/**
	 * 获得SystemColumnDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSystemColumnDTORowCount(Assist assist);
	/**
	 * 获得SystemColumnDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SystemColumnDTO> selectSystemColumnDTO(Assist assist);
	/**
	 * 获得一个SystemColumnDTO对象,以参数SystemColumnDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SystemColumnDTO selectSystemColumnDTOByObj(SystemColumnDTO obj);
	/**
	 * 通过SystemColumnDTO的id获得SystemColumnDTO对象
	 * @param id
	 * @return
	 */
    SystemColumnDTO selectSystemColumnDTOById(Long id);
	/**
	 * 插入SystemColumnDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSystemColumnDTO(SystemColumnDTO value);
	/**
	 * 插入SystemColumnDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySystemColumnDTO(SystemColumnDTO value);
	/**
	 * 批量插入SystemColumnDTO到数据库
	 * @param value
	 * @return
	 */
    int insertSystemColumnDTOByBatch(List<SystemColumnDTO> value);
	/**
	 * 通过SystemColumnDTO的id删除SystemColumnDTO
	 * @param id
	 * @return
	 */
    int deleteSystemColumnDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除SystemColumnDTO
	 * @param assist
	 * @return
	 */
    int deleteSystemColumnDTO(Assist assist);
	/**
	 * 通过SystemColumnDTO的id更新SystemColumnDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSystemColumnDTOById(SystemColumnDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新SystemColumnDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSystemColumnDTO(SystemColumnDTO value,  Assist assist);
	/**
	 * 通过SystemColumnDTO的id更新SystemColumnDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySystemColumnDTOById(SystemColumnDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新SystemColumnDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySystemColumnDTO(SystemColumnDTO value, Assist assist);
}