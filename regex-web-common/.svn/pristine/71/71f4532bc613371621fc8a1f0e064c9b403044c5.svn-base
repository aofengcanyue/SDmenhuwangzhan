package com.regex.web.common.dto.info;

import com.regex.web.excel.annotation.ExcelField;

public class AchievementDTO {
    private Long id;
    private String fileUrl;//附件
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private String imageUrl;//图片
    private String isDel;//0正常 1删除
    private String title;//标题
    private String type;//成果类型 0绿色发展 1技能减排 2典型项目 3园区循环化改造 4 产业布局调整
    private String content;//内容
    public AchievementDTO() {
        super();
    }
    public AchievementDTO(Long id,String fileUrl,java.util.Date updateTime,java.util.Date createTime,String imageUrl,String isDel,String title,String type,String content) {
        super();
        this.id = id;
        this.fileUrl = fileUrl;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.imageUrl = imageUrl;
        this.isDel = isDel;
        this.title = title;
        this.type = type;
        this.content = content;
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

    @ExcelField(title="图片链接", type=1, align=2)
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
