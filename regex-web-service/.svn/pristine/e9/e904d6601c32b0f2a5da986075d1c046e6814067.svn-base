package com.regex.web.dao.info;
import com.regex.web.common.dto.info.NoticeTypeDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface NoticeTypeDAO{
	/**
	 * 获得NoticeTypeDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getNoticeTypeDTORowCount(Assist assist);
	/**
	 * 获得NoticeTypeDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<NoticeTypeDTO> selectNoticeTypeDTO(Assist assist);
	/**
	 * 获得一个NoticeTypeDTO对象,以参数NoticeTypeDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    NoticeTypeDTO selectNoticeTypeDTOByObj(NoticeTypeDTO obj);
	/**
	 * 通过NoticeTypeDTO的id获得NoticeTypeDTO对象
	 * @param id
	 * @return
	 */
    NoticeTypeDTO selectNoticeTypeDTOById(Long id);
	/**
	 * 插入NoticeTypeDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertNoticeTypeDTO(NoticeTypeDTO value);
	/**
	 * 插入NoticeTypeDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyNoticeTypeDTO(NoticeTypeDTO value);
	/**
	 * 批量插入NoticeTypeDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertNoticeTypeDTOByBatch(List<NoticeTypeDTO> value);
	/**
	 * 通过NoticeTypeDTO的id删除NoticeTypeDTO
	 * @param id
	 * @return
	 */
    int deleteNoticeTypeDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除NoticeTypeDTO
	 * @param assist
	 * @return
	 */
    int deleteNoticeTypeDTO(Assist assist);
	/**
	 * 通过NoticeTypeDTO的id更新NoticeTypeDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateNoticeTypeDTOById(NoticeTypeDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新NoticeTypeDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNoticeTypeDTO(@Param("enti") NoticeTypeDTO value, @Param("assist") Assist assist);
	/**
	 * 通过NoticeTypeDTO的id更新NoticeTypeDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyNoticeTypeDTOById(NoticeTypeDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新NoticeTypeDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyNoticeTypeDTO(@Param("enti") NoticeTypeDTO value, @Param("assist") Assist assist);
}