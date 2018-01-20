package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.IndustryInfoDTO;
import com.regex.web.common.Assist;
public interface IndustryInfoService{
	/**
	 * 获得IndustryInfoDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getIndustryInfoDTORowCount(Assist assist);
	/**
	 * 获得IndustryInfoDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<IndustryInfoDTO> selectIndustryInfoDTO(Assist assist);
	/**
	 * 获得一个IndustryInfoDTO对象,以参数IndustryInfoDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    IndustryInfoDTO selectIndustryInfoDTOByObj(IndustryInfoDTO obj);
	/**
	 * 通过IndustryInfoDTO的id获得IndustryInfoDTO对象
	 * @param id
	 * @return
	 */
    IndustryInfoDTO selectIndustryInfoDTOById(String id);
	/**
	 * 插入IndustryInfoDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertIndustryInfoDTO(IndustryInfoDTO value);
	/**
	 * 插入IndustryInfoDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyIndustryInfoDTO(IndustryInfoDTO value);
	/**
	 * 批量插入IndustryInfoDTO到数据库
	 * @param value
	 * @return
	 */
    int insertIndustryInfoDTOByBatch(List<IndustryInfoDTO> value);
	/**
	 * 通过IndustryInfoDTO的id删除IndustryInfoDTO
	 * @param id
	 * @return
	 */
    int deleteIndustryInfoDTOById(String id);
	/**
	 * 通过辅助工具Assist的条件删除IndustryInfoDTO
	 * @param assist
	 * @return
	 */
    int deleteIndustryInfoDTO(Assist assist);
	/**
	 * 通过IndustryInfoDTO的id更新IndustryInfoDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateIndustryInfoDTOById(IndustryInfoDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新IndustryInfoDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateIndustryInfoDTO(IndustryInfoDTO value,  Assist assist);
	/**
	 * 通过IndustryInfoDTO的id更新IndustryInfoDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyIndustryInfoDTOById(IndustryInfoDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新IndustryInfoDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyIndustryInfoDTO(IndustryInfoDTO value, Assist assist);
}