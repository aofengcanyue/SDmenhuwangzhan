package com.regex.web.common.dto.info;

import java.io.Serializable;

/**
 * 
 * 〈一句话功能简述〉<br> 
 * 专家回复表
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class AnswerInfoDTO implements Serializable {
    /**
     */
    private static final long serialVersionUID = 2037963566702232004L;
    private Long id;
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private String isDel;//是否删除
    private Long answerId;//提问id
    private String userid;//用户id
    private String content;//内容
    public AnswerInfoDTO() {
        super();
    }
    public AnswerInfoDTO(Long id,java.util.Date updateTime,java.util.Date createTime,String isDel,Long answerId,String userid,String content) {
        super();
        this.id = id;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.isDel = isDel;
        this.answerId = answerId;
        this.userid = userid;
        this.content = content;
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

    public String getIsDel() {
        return this.isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public Long getAnswerId() {
        return this.answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
