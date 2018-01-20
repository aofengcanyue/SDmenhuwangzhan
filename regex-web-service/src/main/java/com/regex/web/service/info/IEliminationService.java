package com.regex.web.service.info;

import java.util.List;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.info.EliminationDTO;
import com.regex.web.common.utils.QueryConditions;

public interface IEliminationService {

    int insert(EliminationDTO eliminationDTO); 
    
    List<EliminationDTO> selectByModel(QueryConditions params);
    
    int selectCountByModel(QueryConditions params);
    
    int updateById(EliminationDTO eliminationDTO);
    
    int del(long id);
    
    List<EliminationDTO> selectAll();
    
    EliminationDTO selectById(long id);
    
    /**
     * 获得EliminationDTO数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
     * @param assist
     * @return
     */
    long getEliminationDTORowCount(Assist assist);
    /**
     * 获得EliminationDTO数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
     * @param assist
     * @return
     */
    List<EliminationDTO> selectEliminationDTO(Assist assist);
    /**
     * 获得一个EliminationDTO对象,以参数EliminationDTO对象中不为空的属性作为条件进行查询
     * @param obj
     * @return
     */
    EliminationDTO selectEliminationDTOByObj(EliminationDTO obj);
    /**
     * 通过EliminationDTO的id获得EliminationDTO对象
     * @param id
     * @return
     */
    EliminationDTO selectEliminationDTOById(Long id);
    /**
     * 插入EliminationDTO到数据库,包括null值
     * @param value
     * @return
     */
    int insertEliminationDTO(EliminationDTO value);
    /**
     * 插入EliminationDTO中属性值不为null的数据到数据库
     * @param value
     * @return
     */
    int insertNonEmptyEliminationDTO(EliminationDTO value);
    /**
     * 批量插入EliminationDTO到数据库
     * @param value
     * @return
     */
    int insertEliminationDTOByBatch(List<EliminationDTO> value);
    /**
     * 通过EliminationDTO的id删除EliminationDTO
     * @param id
     * @return
     */
    int deleteEliminationDTOById(Long id);
    /**
     * 通过辅助工具Assist的条件删除EliminationDTO
     * @param assist
     * @return
     */
    int deleteEliminationDTO(Assist assist);
    /**
     * 通过EliminationDTO的id更新EliminationDTO中的数据,包括null值
     * @param enti
     * @return
     */
    int updateEliminationDTOById(EliminationDTO enti);
    /**
     * 通过辅助工具Assist的条件更新EliminationDTO中的数据,包括null值
     * @param value
     * @param assist
     * @return
     */
    int updateEliminationDTO(EliminationDTO value,  Assist assist);
    /**
     * 通过EliminationDTO的id更新EliminationDTO中属性不为null的数据
     * @param enti
     * @return
     */
    int updateNonEmptyEliminationDTOById(EliminationDTO enti);
    /**
     * 通过辅助工具Assist的条件更新EliminationDTO中属性不为null的数据
     * @param value
     * @param assist
     * @return
     */
    int updateNonEmptyEliminationDTO(EliminationDTO value, Assist assist);
}
