package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.PolicyDTO;
import com.regex.web.common.Assist;
public interface PolicyService{
	/**
	 * 获得PolicyDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getPolicyDTORowCount(Assist assist);
	/**
	 * 获得PolicyDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<PolicyDTO> selectPolicyDTO(Assist assist);
	/**
	 * 获得一个PolicyDTO对象,以参数PolicyDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    PolicyDTO selectPolicyDTOByObj(PolicyDTO obj);
	/**
	 * 通过PolicyDTO的id获得PolicyDTO对象
	 * @param id
	 * @return
	 */
    PolicyDTO selectPolicyDTOById(Long id);
	/**
	 * 插入PolicyDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPolicyDTO(PolicyDTO value);
	/**
	 * 插入PolicyDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyPolicyDTO(PolicyDTO value);
	/**
	 * 批量插入PolicyDTO到数据库
	 * @param value
	 * @return
	 */
    int insertPolicyDTOByBatch(List<PolicyDTO> value);
	/**
	 * 通过PolicyDTO的id删除PolicyDTO
	 * @param id
	 * @return
	 */
    int deletePolicyDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除PolicyDTO
	 * @param assist
	 * @return
	 */
    int deletePolicyDTO(Assist assist);
	/**
	 * 通过PolicyDTO的id更新PolicyDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updatePolicyDTOById(PolicyDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新PolicyDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updatePolicyDTO(PolicyDTO value,  Assist assist);
	/**
	 * 通过PolicyDTO的id更新PolicyDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyPolicyDTOById(PolicyDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新PolicyDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyPolicyDTO(PolicyDTO value, Assist assist);
}