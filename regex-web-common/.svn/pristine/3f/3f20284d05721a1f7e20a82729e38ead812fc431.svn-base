package com.regex.web.common.dto.info;

import java.io.Serializable;

import com.regex.web.excel.annotation.ExcelField;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 信息发布DTO
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class NoticeDTO implements Serializable {
    /**
     */
    private static final long serialVersionUID = -2063302446975977337L;
    private Long id;
    private String fileUrl;//附件
    private java.util.Date createTime;
    private Integer reaadCount;
    private String imageUrl;
    private String title;
    private String type;
    private String content;
    private String isTop;
    private String createBy;
    private java.util.Date updateTime;
    private String audit;
    private String isDel;
    public NoticeDTO() {
        super();
    }
    public NoticeDTO(Long id,String fileUrl,java.util.Date createTime,Integer reaadCount,String imageUrl,String title,String type,String content,String isTop,String createBy,java.util.Date updateTime,String audit,String isDel) {
        super();
        this.id = id;
        this.fileUrl = fileUrl;
        this.createTime = createTime;
        this.reaadCount = reaadCount;
        this.imageUrl = imageUrl;
        this.title = title;
        this.type = type;
        this.content = content;
        this.isTop = isTop;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.audit = audit;
        this.isDel = isDel;
    }
    @ExcelField(title="附件", type=1, align=2)
    public String getFileUrl() {
        return fileUrl;
    }
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ExcelField(title="来源", type=1, align=2)
    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @ExcelField(title="更新时间", type=1, align=2)
    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    @ExcelField(title="创建时间", type=1, align=2)
    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    @ExcelField(title="阅读数量", type=1, align=2, fieldType=String.class)
    public Integer getReaadCount() {
        return this.reaadCount;
    }

    public void setReaadCount(Integer reaadCount) {
        this.reaadCount = reaadCount;
    }

    @ExcelField(title="图片地址", type=1, align=2)
    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @ExcelField(title="审核状态", type=1, align=2)
    public String getAudit() {
        return this.audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
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

    @ExcelField(title="类型", type=1, align=2)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ExcelField(title="内容", type=1, align=2)
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ExcelField(title="是否置顶", type=1, align=2)
    public String getIsTop() {
        return this.isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

}
