package com.regex.web.service.sys;
import java.util.List;
import com.regex.web.common.dto.sys.SysRoleFhbutton;
import com.regex.web.common.Assist;
public interface SysRoleFhbuttonService{
	/**
	 * 获得SysRoleFhbutton数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysRoleFhbuttonRowCount(Assist assist);
	/**
	 * 获得SysRoleFhbutton数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysRoleFhbutton> selectSysRoleFhbutton(Assist assist);
	/**
	 * 获得一个SysRoleFhbutton对象,以参数SysRoleFhbutton对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysRoleFhbutton selectSysRoleFhbuttonByObj(SysRoleFhbutton obj);
	/**
	 * 通过SysRoleFhbutton的id获得SysRoleFhbutton对象
	 * @param id
	 * @return
	 */
    SysRoleFhbutton selectSysRoleFhbuttonById(String id);
	/**
	 * 插入SysRoleFhbutton到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysRoleFhbutton(SysRoleFhbutton value);
	/**
	 * 插入SysRoleFhbutton中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysRoleFhbutton(SysRoleFhbutton value);
	/**
	 * 批量插入SysRoleFhbutton到数据库
	 * @param value
	 * @return
	 */
    int insertSysRoleFhbuttonByBatch(List<SysRoleFhbutton> value);
	/**
	 * 通过SysRoleFhbutton的id删除SysRoleFhbutton
	 * @param id
	 * @return
	 */
    int deleteSysRoleFhbuttonById(String id);
	/**
	 * 通过辅助工具Assist的条件删除SysRoleFhbutton
	 * @param assist
	 * @return
	 */
    int deleteSysRoleFhbutton(Assist assist);
	/**
	 * 通过SysRoleFhbutton的id更新SysRoleFhbutton中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysRoleFhbuttonById(SysRoleFhbutton enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysRoleFhbutton中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysRoleFhbutton(SysRoleFhbutton value,  Assist assist);
	/**
	 * 通过SysRoleFhbutton的id更新SysRoleFhbutton中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysRoleFhbuttonById(SysRoleFhbutton enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysRoleFhbutton中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysRoleFhbutton(SysRoleFhbutton value, Assist assist);
}