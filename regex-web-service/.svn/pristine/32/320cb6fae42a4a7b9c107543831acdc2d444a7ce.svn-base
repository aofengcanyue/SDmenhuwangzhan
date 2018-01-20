package com.regex.web.service.info;

import java.util.List;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.WaterDTO;
import com.regex.web.common.utils.QueryConditions;

public interface IWaterService {
    
    int insert(WaterDTO waterDTO);
    
    List<WaterDTO> selectByName(QueryConditions params);
    
    int selectCountByName(QueryConditions params);
    
    int updateById(WaterDTO waterDTO);
    
    int del(long id);
    
    WaterDTO selectById(long id);
    
    List<WaterDTO> selectAll();
    
    /**
     * 获得WaterDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
     * @param assist
     * @return
     */
    long getWaterDTORowCount(Assist assist);
    /**
     * 获得WaterDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
     * @param assist
     * @return
     */
    List<WaterDTO> selectWaterDTO(Assist assist);
    /**
     * 获得一个WaterDTO对象,以参数WaterDTO对象中不为空的属性作为条件进行查询
     * @param obj
     * @return
     */
    WaterDTO selectWaterDTOByObj(WaterDTO obj);
    /**
     * 通过WaterDTO的id获得WaterDTO对象
     * @param id
     * @return
     */
    WaterDTO selectWaterDTOById(Long id);
    /**
     * 插入WaterDTO到数据库,包括null值
     * @param value
     * @return
     */
    int insertWaterDTO(WaterDTO value);
    /**
     * 插入WaterDTO中属性值不为null的数据到数据库
     * @param value
     * @return
     */
    int insertNonEmptyWaterDTO(WaterDTO value);
    /**
     * 批量插入WaterDTO到数据库
     * @param value
     * @return
     */
    int insertWaterDTOByBatch(List<WaterDTO> value);
    /**
     * 通过WaterDTO的id删除WaterDTO
     * @param id
     * @return
     */
    int deleteWaterDTOById(Long id);
    /**
     * 通过辅助工具Assist的条件删除WaterDTO
     * @param assist
     * @return
     */
    int deleteWaterDTO(Assist assist);
    /**
     * 通过WaterDTO的id更新WaterDTO中的数据,包括null值
     * @param enti
     * @return
     */
    int updateWaterDTOById(WaterDTO enti);
    /**
     * 通过辅助工具Assist的条件更新WaterDTO中的数据,包括null值
     * @param value
     * @param assist
     * @return
     */
    int updateWaterDTO(WaterDTO value,  Assist assist);
    /**
     * 通过WaterDTO的id更新WaterDTO中属性不为null的数据
     * @param enti
     * @return
     */
    int updateNonEmptyWaterDTOById(WaterDTO enti);
    /**
     * 通过辅助工具Assist的条件更新WaterDTO中属性不为null的数据
     * @param value
     * @param assist
     * @return
     */
    int updateNonEmptyWaterDTO(WaterDTO value, Assist assist);
}
