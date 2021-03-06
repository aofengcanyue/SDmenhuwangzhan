package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.SupplyDemandDTO;
import com.regex.web.common.Assist;
public interface SupplyDemandService{
	/**
	 * 获得SupplyDemandDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSupplyDemandDTORowCount(Assist assist);
	/**
	 * 获得SupplyDemandDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SupplyDemandDTO> selectSupplyDemandDTO(Assist assist);
	/**
	 * 获得一个SupplyDemandDTO对象,以参数SupplyDemandDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SupplyDemandDTO selectSupplyDemandDTOByObj(SupplyDemandDTO obj);
	/**
	 * 通过SupplyDemandDTO的id获得SupplyDemandDTO对象
	 * @param id
	 * @return
	 */
    SupplyDemandDTO selectSupplyDemandDTOById(Long id);
	/**
	 * 插入SupplyDemandDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSupplyDemandDTO(SupplyDemandDTO value);
	/**
	 * 插入SupplyDemandDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySupplyDemandDTO(SupplyDemandDTO value);
	/**
	 * 批量插入SupplyDemandDTO到数据库
	 * @param value
	 * @return
	 */
    int insertSupplyDemandDTOByBatch(List<SupplyDemandDTO> value);
	/**
	 * 通过SupplyDemandDTO的id删除SupplyDemandDTO
	 * @param id
	 * @return
	 */
    int deleteSupplyDemandDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除SupplyDemandDTO
	 * @param assist
	 * @return
	 */
    int deleteSupplyDemandDTO(Assist assist);
	/**
	 * 通过SupplyDemandDTO的id更新SupplyDemandDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSupplyDemandDTOById(SupplyDemandDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新SupplyDemandDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSupplyDemandDTO(SupplyDemandDTO value,  Assist assist);
	/**
	 * 通过SupplyDemandDTO的id更新SupplyDemandDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySupplyDemandDTOById(SupplyDemandDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新SupplyDemandDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySupplyDemandDTO(SupplyDemandDTO value, Assist assist);
}