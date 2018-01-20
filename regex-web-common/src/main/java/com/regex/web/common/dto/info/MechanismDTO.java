package com.regex.web.common.dto.info;

import java.util.Date;

import com.regex.web.excel.annotation.ExcelField;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 金融机构
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class MechanismDTO implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date updateTime;
    private Date createTime;
    private String imageUrl;
    private String isDel;
    private String title;
    private String content;
    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ExcelField(title="更新时间", type=1, align=2)
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @ExcelField(title="创建时间", type=1, align=2)
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @ExcelField(title="图片地址", type=1, align=2)
    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @ExcelField(title="是否删除", type=1, align=2)
    public String getIsDel() {
        return this.isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    @ExcelField(title="标题", type=1, align=2)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ExcelField(title="内容", type=1, align=2)
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

