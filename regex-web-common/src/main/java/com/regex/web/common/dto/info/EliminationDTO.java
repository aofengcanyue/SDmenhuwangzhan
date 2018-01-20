package com.regex.web.common.dto.info;

import java.io.Serializable;
import java.util.Date;

import com.regex.web.excel.annotation.ExcelField;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 高耗能落后机电设备淘汰DTO
 *
 * @author Administrator
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class EliminationDTO implements Serializable{

    /**
     */
    private static final long serialVersionUID = 7943691110679401423L;
    
    
    private long id;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 设备类型 0电动机 1变压器 2风机 3水泵 4锅炉 5落后工艺、设备和产品
     */
    private String type;
    /**
     * 产品型号
     */
    private String model;
    /**
     * 产品规格
     */
    private String specification;
    /**
     * 淘汰理由
     */
    private String reason;
    /**
     * 淘汰范围及时间
     */
    private String rangeTime;
    /**
     * 是否删除 0正常 1删除
     */
    private String isDel;
    
    private Date createTime;
    
    private Date updateTime;

    @ExcelField(title="设备类型", type=1, align=2)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ExcelField(title="设备名称", type=1, align=2)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ExcelField(title="设备型号", type=1, align=2)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @ExcelField(title="产品规格", type=1, align=2)
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @ExcelField(title="淘汰理由", type=1, align=2)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @ExcelField(title="淘汰范围及时间", type=1, align=2)
    public String getRangeTime() {
        return rangeTime;
    }

    public void setRangeTime(String rangeTime) {
        this.rangeTime = rangeTime;
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
