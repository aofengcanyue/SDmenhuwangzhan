package com.regex.web.service.sys;
import java.util.List;
import com.regex.web.common.dto.sys.SysFhbutton;
import com.regex.web.common.Assist;
public interface SysFhbuttonService{
	/**
	 * 获得SysFhbutton数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysFhbuttonRowCount(Assist assist);
	/**
	 * 获得SysFhbutton数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysFhbutton> selectSysFhbutton(Assist assist);
	/**
	 * 获得一个SysFhbutton对象,以参数SysFhbutton对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysFhbutton selectSysFhbuttonByObj(SysFhbutton obj);
	/**
	 * 通过SysFhbutton的id获得SysFhbutton对象
	 * @param id
	 * @return
	 */
    SysFhbutton selectSysFhbuttonById(String id);
	/**
	 * 插入SysFhbutton到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysFhbutton(SysFhbutton value);
	/**
	 * 插入SysFhbutton中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysFhbutton(SysFhbutton value);
	/**
	 * 批量插入SysFhbutton到数据库
	 * @param value
	 * @return
	 */
    int insertSysFhbuttonByBatch(List<SysFhbutton> value);
	/**
	 * 通过SysFhbutton的id删除SysFhbutton
	 * @param id
	 * @return
	 */
    int deleteSysFhbuttonById(String id);
	/**
	 * 通过辅助工具Assist的条件删除SysFhbutton
	 * @param assist
	 * @return
	 */
    int deleteSysFhbutton(Assist assist);
	/**
	 * 通过SysFhbutton的id更新SysFhbutton中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysFhbuttonById(SysFhbutton enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysFhbutton中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysFhbutton(SysFhbutton value,  Assist assist);
	/**
	 * 通过SysFhbutton的id更新SysFhbutton中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysFhbuttonById(SysFhbutton enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysFhbutton中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysFhbutton(SysFhbutton value, Assist assist);
}