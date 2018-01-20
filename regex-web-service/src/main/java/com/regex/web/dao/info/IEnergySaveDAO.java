package com.regex.web.dao.info;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.EnergySaveDTO;
import com.regex.web.common.utils.QueryConditions;

public interface IEnergySaveDAO {
    
    int insert(EnergySaveDTO energySaveDTO);
    
    List<EnergySaveDTO> selectByName(QueryConditions params);
    
    int selectCountByName(QueryConditions params);
    
    int updateById(EnergySaveDTO energySaveDTO);
    
    int del(long id);
    
    List<EnergySaveDTO> selectAll();
    
    EnergySaveDTO selectById(long id);
    
    /**
     * 获得EnergySaveDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
     * @param assist
     * @return
     */
    long getEnergySaveDTORowCount(Assist assist);
    /**
     * 获得EnergySaveDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
     * @param assist
     * @return
     */
    List<EnergySaveDTO> selectEnergySaveDTO(Assist assist);
    /**
     * 获得一个EnergySaveDTO对象,以参数EnergySaveDTO对象中不为空的属性作为条件进行查询
     * @param obj
     * @return
     */
    EnergySaveDTO selectEnergySaveDTOByObj(EnergySaveDTO obj);
    /**
     * 通过EnergySaveDTO的id获得EnergySaveDTO对象
     * @param id
     * @return
     */
    EnergySaveDTO selectEnergySaveDTOById(Long id);
    /**
     * 插入EnergySaveDTO到数据库,包括null值
     * @param value
     * @return
     */
    int insertEnergySaveDTO(EnergySaveDTO value);
    /**
     * 插入EnergySaveDTO中属性值不为null的数据到数据库
     * @param value
     * @return
     */
    int insertNonEmptyEnergySaveDTO(EnergySaveDTO value);
    /**
     * 批量插入EnergySaveDTO到数据库,包括null值
     * @param value
     * @return
     */
    int insertEnergySaveDTOByBatch(List<EnergySaveDTO> value);
    /**
     * 通过EnergySaveDTO的id删除EnergySaveDTO
     * @param id
     * @return
     */
    int deleteEnergySaveDTOById(Long id);
    /**
     * 通过辅助工具Assist的条件删除EnergySaveDTO
     * @param assist
     * @return
     */
    int deleteEnergySaveDTO(Assist assist);
    /**
     * 通过EnergySaveDTO的id更新EnergySaveDTO中的数据,包括null值
     * @param enti
     * @return
     */
    int updateEnergySaveDTOById(EnergySaveDTO enti);
    /**
     * 通过辅助工具Assist的条件更新EnergySaveDTO中的数据,包括null值
     * @param value
     * @param assist
     * @return
     */
    int updateEnergySaveDTO(@Param("enti") EnergySaveDTO value, @Param("assist") Assist assist);
    /**
     * 通过EnergySaveDTO的id更新EnergySaveDTO中属性不为null的数据
     * @param enti
     * @return
     */
    int updateNonEmptyEnergySaveDTOById(EnergySaveDTO enti);
    /**
     * 通过辅助工具Assist的条件更新EnergySaveDTO中属性不为null的数据
     * @param value
     * @param assist
     * @return
     */
    int updateNonEmptyEnergySaveDTO(@Param("enti") EnergySaveDTO value, @Param("assist") Assist assist);
}
