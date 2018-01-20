package com.regex.web.common.dto.info;

import java.io.Serializable;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 信息发布类型
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class NoticeTypeDTO implements Serializable {
    /**
     */
    private static final long serialVersionUID = -5491786266710723746L;
    private Long id;
    private java.util.Date updateTime;//更新时间
    private java.util.Date createTime;//创建时间
    private String name;//名称
    private String isDel;//是否删除 0 未删除 1 删除
    private String type;//类型
    public NoticeTypeDTO() {
        super();
    }
    public NoticeTypeDTO(Long id,java.util.Date updateTime,java.util.Date createTime,String name,String isDel,String type) {
        super();
        this.id = id;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.name = name;
        this.isDel = isDel;
        this.type = type;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsDel() {
        return this.isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
