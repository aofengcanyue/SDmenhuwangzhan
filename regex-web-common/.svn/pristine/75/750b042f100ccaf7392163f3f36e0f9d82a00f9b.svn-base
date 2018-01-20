package com.regex.web.common.dto.info;

import java.io.Serializable;
import java.util.Date;

import com.regex.web.excel.annotation.ExcelField;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 产品取水定额DTO
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class WaterDTO implements Serializable{

    /**
     */
    private static final long serialVersionUID = -688732828498521107L;
    
    private long id;
    /**
     * 行业类别
     */
    private String category;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 定额值
     */
    private String quota;
    /**
     * 单位
     */
    private String unit;
    
    private String remarks;
    /**
     * 是否删除 0正常 1删除
     */
    private String isDel;

    private Date createTime;
    
    private Date updateTime;

    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ExcelField(title="行业类别", type=1, align=2)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @ExcelField(title="产品名称", type=1, align=2)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ExcelField(title="定额值", type=1, align=2)
    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    @ExcelField(title="单位", type=1, align=2)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @ExcelField(title="备注", type=1, align=2)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @ExcelField(title="是否删除", type=1, align=2)
    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    @ExcelField(title="创建时间", type=1, align=2)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @ExcelField(title="更新时间", type=1, align=2)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    
}
