package com.regex.web.service.info;
import java.util.List;
import com.regex.web.common.dto.info.AnswerInfoDTO;
import com.regex.web.common.Assist;
public interface AnswerInfoService{
	/**
	 * 获得AnswerInfoDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getAnswerInfoDTORowCount(Assist assist);
	/**
	 * 获得AnswerInfoDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<AnswerInfoDTO> selectAnswerInfoDTO(Assist assist);
	/**
	 * 获得一个AnswerInfoDTO对象,以参数AnswerInfoDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    AnswerInfoDTO selectAnswerInfoDTOByObj(AnswerInfoDTO obj);
	/**
	 * 通过AnswerInfoDTO的id获得AnswerInfoDTO对象
	 * @param id
	 * @return
	 */
    AnswerInfoDTO selectAnswerInfoDTOById(Long id);
	/**
	 * 插入AnswerInfoDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertAnswerInfoDTO(AnswerInfoDTO value);
	/**
	 * 插入AnswerInfoDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyAnswerInfoDTO(AnswerInfoDTO value);
	/**
	 * 批量插入AnswerInfoDTO到数据库
	 * @param value
	 * @return
	 */
    int insertAnswerInfoDTOByBatch(List<AnswerInfoDTO> value);
	/**
	 * 通过AnswerInfoDTO的id删除AnswerInfoDTO
	 * @param id
	 * @return
	 */
    int deleteAnswerInfoDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除AnswerInfoDTO
	 * @param assist
	 * @return
	 */
    int deleteAnswerInfoDTO(Assist assist);
	/**
	 * 通过AnswerInfoDTO的id更新AnswerInfoDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateAnswerInfoDTOById(AnswerInfoDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新AnswerInfoDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateAnswerInfoDTO(AnswerInfoDTO value,  Assist assist);
	/**
	 * 通过AnswerInfoDTO的id更新AnswerInfoDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyAnswerInfoDTOById(AnswerInfoDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新AnswerInfoDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyAnswerInfoDTO(AnswerInfoDTO value, Assist assist);
}