package com.regex.web.common.dto.info;

import java.io.Serializable;

import com.regex.web.excel.annotation.ExcelField;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 金融政策
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class PolicyDTO implements Serializable {
    /**
     */
    private static final long serialVersionUID = -5286650079205280129L;
    private Long id;
    private String fileUrl;//附件
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private String isDel;//0正常 1删除
    private String title;//标题
    private String type;//类型 0金融机构 1担保公司 2合同能源管理服务公司
    private String content;//内容
    private String isTop;//0正常 1置顶
    public PolicyDTO() {
        super();
    }
    public PolicyDTO(Long id,String fileUrl,java.util.Date updateTime,java.util.Date createTime,String isDel,String title,String type,String content,String isTop) {
        super();
        this.id = id;
        this.fileUrl = fileUrl;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.isDel = isDel;
        this.title = title;
        this.type = type;
        this.content = content;
        this.isTop = isTop;
    }
    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ExcelField(title="附件", type=1, align=2)
    public String getFileUrl() {
        return this.fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
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
