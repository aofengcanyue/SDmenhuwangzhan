package com.regex.web.service.green;
import java.util.List;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.green.GreenSupplyChainEvaluation;
public interface GreenSupplyChainEvaluationService{
	/**
	 * 获得GreenSupplyChainEvaluation数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getGreenSupplyChainEvaluationRowCount(Assist assist);
	/**
	 * 获得GreenSupplyChainEvaluation数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<GreenSupplyChainEvaluation> selectGreenSupplyChainEvaluation(Assist assist);
	/**
	 * 获得一个GreenSupplyChainEvaluation对象,以参数GreenSupplyChainEvaluation对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    GreenSupplyChainEvaluation selectGreenSupplyChainEvaluationByObj(GreenSupplyChainEvaluation obj);
	/**
	 * 通过GreenSupplyChainEvaluation的id获得GreenSupplyChainEvaluation对象
	 * @param id
	 * @return
	 */
    GreenSupplyChainEvaluation selectGreenSupplyChainEvaluationById(Long id);
	/**
	 * 插入GreenSupplyChainEvaluation到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value);
	/**
	 * 插入GreenSupplyChainEvaluation中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value);
	/**
	 * 批量插入GreenSupplyChainEvaluation到数据库
	 * @param value
	 * @return
	 */
    int insertGreenSupplyChainEvaluationByBatch(List<GreenSupplyChainEvaluation> value);
	/**
	 * 通过GreenSupplyChainEvaluation的id删除GreenSupplyChainEvaluation
	 * @param id
	 * @return
	 */
    int deleteGreenSupplyChainEvaluationById(Long id);
	/**
	 * 通过辅助工具Assist的条件删除GreenSupplyChainEvaluation
	 * @param assist
	 * @return
	 */
    int deleteGreenSupplyChainEvaluation(Assist assist);
	/**
	 * 通过GreenSupplyChainEvaluation的id更新GreenSupplyChainEvaluation中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateGreenSupplyChainEvaluationById(GreenSupplyChainEvaluation enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenSupplyChainEvaluation中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value,  Assist assist);
	/**
	 * 通过GreenSupplyChainEvaluation的id更新GreenSupplyChainEvaluation中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyGreenSupplyChainEvaluationById(GreenSupplyChainEvaluation enti);
 	/**
	 * 通过辅助工具Assist的条件更新GreenSupplyChainEvaluation中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyGreenSupplyChainEvaluation(GreenSupplyChainEvaluation value, Assist assist);
}