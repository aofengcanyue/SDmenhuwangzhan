package com.regex.web.dao.sys;
import com.regex.web.common.Assist;
import com.regex.web.common.dto.sys.SysMenu;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface SysMenuDao{
	/**
	 * 获得SysMenu数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysMenuRowCount(Assist assist);
	/**
	 * 获得SysMenu数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysMenu> selectSysMenu(Assist assist);
	/**
	 * 获得一个SysMenu对象,以参数SysMenu对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysMenu selectSysMenuByObj(SysMenu obj);
	/**
	 * 通过SysMenu的id获得SysMenu对象
	 * @param id
	 * @return
	 */
    SysMenu selectSysMenuById(Integer id);
	/**
	 * 插入SysMenu到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysMenu(SysMenu value);
	/**
	 * 插入SysMenu中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysMenu(SysMenu value);
	/**
	 * 批量插入SysMenu到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysMenuByBatch(List<SysMenu> value);
	/**
	 * 通过SysMenu的id删除SysMenu
	 * @param id
	 * @return
	 */
    int deleteSysMenuById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除SysMenu
	 * @param assist
	 * @return
	 */
    int deleteSysMenu(Assist assist);
	/**
	 * 通过SysMenu的id更新SysMenu中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysMenuById(SysMenu enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysMenu中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysMenu(@Param("enti") SysMenu value, @Param("assist") Assist assist);
	/**
	 * 通过SysMenu的id更新SysMenu中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysMenuById(SysMenu enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysMenu中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysMenu(@Param("enti") SysMenu value, @Param("assist") Assist assist);
}