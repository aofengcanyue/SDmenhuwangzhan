package com.regex.web.common.dto.info;

import java.io.Serializable;

/**
 * 
 * 〈一句话功能简述〉<br> 
 *  行业分类DTO
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class IndustryClassIfyDTO implements Serializable{

    /**
     */
    private static final long serialVersionUID = 8863915162237102762L;
    
    /**
     * 分类Id
     */
    private String classIfyId;
    /**
     * 分类名称
     */
    private String classIfyName;
    /**
     * 分类编号
     */
    private String classIfyCode;
    public String getClassIfyId() {
        return classIfyId;
    }
    public void setClassIfyId(String classIfyId) {
        this.classIfyId = classIfyId;
    }
    public String getClassIfyName() {
        return classIfyName;
    }
    public void setClassIfyName(String classIfyName) {
        this.classIfyName = classIfyName;
    }
    public String getClassIfyCode() {
        return classIfyCode;
    }
    public void setClassIfyCode(String classIfyCode) {
        this.classIfyCode = classIfyCode;
    }
    
}
