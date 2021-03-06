package com.regex.web.common.dto.info;

import java.io.Serializable;

import com.regex.web.excel.annotation.ExcelField;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 专家咨询总表
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class ExpertAnswerDTO implements Serializable {
    /**
     */
    private static final long serialVersionUID = -4436126253120493644L;
    private Long id;
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private String userId;//提问userid
    private String audit;//审核状态 0 待审核 1 审核通过 2审核驳回
    private String isDel;//0正常 1删除
    private String title;//名字
    private String type;//提问类型 0能源计量与信息化 1通用技术节能 2循环经济与清洁生产 3节能咨询 4政策咨询
    private String expertId;//专家id
    private String isTop;//置顶 0正常 1置顶
    private Integer readCount;//浏览量
    private String time;
    
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 回复数量
     */
    private long answerCount;
    
    public long getAnswerCount() {
        return answerCount;
    }
    public void setAnswerCount(long answerCount) {
        this.answerCount = answerCount;
    }
    public ExpertAnswerDTO() {
        super();
    }
    public ExpertAnswerDTO(Long id,java.util.Date updateTime,java.util.Date createTime,String userId,String audit,String isDel,String title,String type,String expertId,String isTop,Integer readCount) {
        super();
        this.id = id;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.userId = userId;
        this.audit = audit;
        this.isDel = isDel;
        this.title = title;
        this.type = type;
        this.expertId = expertId;
        this.isTop = isTop;
        this.readCount = readCount;
    }
    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @ExcelField(title="提问者", type=1, align=2)
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @ExcelField(title="审核状态", type=1, align=2)
    public String getAudit() {
        return this.audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    @ExcelField(title="删除状态", type=1, align=2)
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

    @ExcelField(title="专家id", type=1, align=2)
    public String getExpertId() {
        return this.expertId;
    }

    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    @ExcelField(title="是否置顶", type=1, align=2)
    public String getIsTop() {
        return this.isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    @ExcelField(title="阅读数量", type=1, align=2)
    public Integer getReadCount() {
        return this.readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

}
