package com.regex.web.dao.sys;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.sys.SysRole;
public interface SysRoleDao{
    /**
     * 
     * 功能描述: <br>
     * get By ID
     *
     * @param roleId
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    SysRole getById(String roleId);
    /**
     * 
     * 功能描述: <br>
     * 获取子权限
     *
     * @param parentId
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    List<SysRole> getByParentId(String parentId);
	/**
	 * 获得SysRole数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysRoleRowCount(Assist assist);
	/**
	 * 获得SysRole数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysRole> selectSysRole(Assist assist);
	/**
	 * 获得一个SysRole对象,以参数SysRole对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysRole selectSysRoleByObj(SysRole obj);
	/**
	 * 通过SysRole的id获得SysRole对象
	 * @param id
	 * @return
	 */
    SysRole selectSysRoleById(String id);
	/**
	 * 插入SysRole到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysRole(SysRole value);
	/**
	 * 插入SysRole中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysRole(SysRole value);
	/**
	 * 批量插入SysRole到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysRoleByBatch(List<SysRole> value);
	/**
	 * 通过SysRole的id删除SysRole
	 * @param id
	 * @return
	 */
    int deleteSysRoleById(String id);
	/**
	 * 通过辅助工具Assist的条件删除SysRole
	 * @param assist
	 * @return
	 */
    int deleteSysRole(Assist assist);
	/**
	 * 通过SysRole的id更新SysRole中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysRoleById(SysRole enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysRole中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysRole(@Param("enti") SysRole value, @Param("assist") Assist assist);
	/**
	 * 通过SysRole的id更新SysRole中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysRoleById(SysRole enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysRole中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysRole(@Param("enti") SysRole value, @Param("assist") Assist assist);
}