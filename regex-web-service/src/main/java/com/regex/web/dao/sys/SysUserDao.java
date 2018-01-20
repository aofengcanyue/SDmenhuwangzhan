package com.regex.web.dao.sys;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.regex.web.common.Assist;
import com.regex.web.common.dto.sys.SysUser;
public interface SysUserDao{
    /**
     * 
     * 功能描述: <br>
     * 〈功能详细描述〉
     *
     * @param userName
     * @return
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    SysUser getByLoginName(String userName);
	/**
	 * 获得SysUser数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getSysUserRowCount(Assist assist);
	/**
	 * 获得SysUser数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<SysUser> selectSysUser(Assist assist);
	/**
	 * 获得一个SysUser对象,以参数SysUser对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    SysUser selectSysUserByObj(SysUser obj);
	/**
	 * 通过SysUser的id获得SysUser对象
	 * @param id
	 * @return
	 */
    SysUser selectSysUserById(String id);
	/**
	 * 插入SysUser到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysUser(SysUser value);
	/**
	 * 插入SysUser中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySysUser(SysUser value);
	/**
	 * 批量插入SysUser到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSysUserByBatch(List<SysUser> value);
	/**
	 * 通过SysUser的id删除SysUser
	 * @param id
	 * @return
	 */
    int deleteSysUserById(String id);
	/**
	 * 通过辅助工具Assist的条件删除SysUser
	 * @param assist
	 * @return
	 */
    int deleteSysUser(Assist assist);
	/**
	 * 通过SysUser的id更新SysUser中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSysUserById(SysUser enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysUser中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateSysUser(@Param("enti") SysUser value, @Param("assist") Assist assist);
	/**
	 * 通过SysUser的id更新SysUser中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySysUserById(SysUser enti);
 	/**
	 * 通过辅助工具Assist的条件更新SysUser中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptySysUser(@Param("enti") SysUser value, @Param("assist") Assist assist);
}