package com.regex.web.dao.info;
import com.regex.web.common.dto.info.NoticeDTO;
import java.util.List;
import com.regex.web.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface INoticeDAO{
	/**
	 * 获得NoticeDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getNoticeDTORowCount(Assist assist);
	/**
	 * 获得NoticeDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<NoticeDTO> selectNoticeDTO(Assist assist);
	/**
	 * 获得一个NoticeDTO对象,以参数NoticeDTO对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    NoticeDTO selectNoticeDTOByObj(NoticeDTO obj);
	/**
	 * 通过NoticeDTO的id获得NoticeDTO对象
	 * @param id
	 * @return
	 */
    NoticeDTO selectNoticeDTOById(Long id);
	/**
	 * 插入NoticeDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertNoticeDTO(NoticeDTO value);
	/**
	 * 插入NoticeDTO中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyNoticeDTO(NoticeDTO value);
	/**
	 * 批量插入NoticeDTO到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertNoticeDTOByBatch(List<NoticeDTO> value);
	/**
	 * 通过NoticeDTO的id删除NoticeDTO
	 * @param id
	 * @return
	 */
    int deleteNoticeDTOById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除NoticeDTO
	 * @param assist
	 * @return
	 */
    int deleteNoticeDTO(Assist assist);
	/**
	 * 通过NoticeDTO的id更新NoticeDTO中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateNoticeDTOById(NoticeDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新NoticeDTO中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNoticeDTO(@Param("enti") NoticeDTO value, @Param("assist") Assist assist);
	/**
	 * 通过NoticeDTO的id更新NoticeDTO中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyNoticeDTOById(NoticeDTO enti);
 	/**
	 * 通过辅助工具Assist的条件更新NoticeDTO中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyNoticeDTO(@Param("enti") NoticeDTO value, @Param("assist") Assist assist);
}