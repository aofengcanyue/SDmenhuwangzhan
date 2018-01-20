package com.regex.web.common.dto.info;

import com.regex.web.excel.annotation.ExcelField;

public class TrainingDTO implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String download;//下载链接
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private String upload;//上传地址
    private String imageUrl;//图片
    private String isDel;//0正常 1删除
    private String title;//标题
    private String type;//type
    private String content;//内容
    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ExcelField(title="下载地址", type=1, align=2)
    public String getDownload() {
        return this.download;
    }

    public void setDownload(String download) {
        this.download = download;
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

    public String getUpload() {
        return this.upload;
    }

    public void setUpload(String upload) {
        this.upload = upload;
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

}
