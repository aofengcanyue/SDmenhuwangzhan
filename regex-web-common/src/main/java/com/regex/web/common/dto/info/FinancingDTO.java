package com.regex.web.common.dto.info;

import java.io.Serializable;

import com.regex.web.excel.annotation.ExcelField;
/**
 * 
 * 〈一句话功能简述〉<br> 
 * 投资项目
 *
 * @author admin
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class FinancingDTO implements Serializable {
    /**
     */
    private static final long serialVersionUID = -4276946073562437451L;
    private Long id;
    private String address;//地址
    private java.util.Date createTime;
    private String investment;//投资预算
    private String title;//标题
    private String demand;//资金需求
    private java.util.Date updateTime;
    private String phone;//电话
    private String userId;
    private String imgUrl;//图片地址
    private String audit;//审核状态 0 待审核 1 审核通过 2 驳回
    private String contact;//联系人
    private String isDel;//0正常 1删除
    private String company;//公司名称
    private String introduction;//项目简介
    public FinancingDTO() {
        super();
    }
    public FinancingDTO(Long id,String address,java.util.Date createTime,String investment,String title,String demand,java.util.Date updateTime,String phone,String userId,String imgUrl,String audit,String contact,String isDel,String company,String introduction) {
        super();
        this.id = id;
        this.address = address;
        this.createTime = createTime;
        this.investment = investment;
        this.title = title;
        this.demand = demand;
        this.updateTime = updateTime;
        this.phone = phone;
        this.userId = userId;
        this.imgUrl = imgUrl;
        this.audit = audit;
        this.contact = contact;
        this.isDel = isDel;
        this.company = company;
        this.introduction = introduction;
    }
    
    @ExcelField(title="ID", type=1, align=2, sort=1, fieldType =String.class)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ExcelField(title="地址", type=1, align=2)
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ExcelField(title="创建时间", type=1, align=2)
    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    @ExcelField(title="项目预算", type=1, align=2)
    public String getInvestment() {
        return this.investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @ExcelField(title="项目名称", type=1, align=2)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ExcelField(title="资金需求", type=1, align=2)
    public String getDemand() {
        return this.demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    @ExcelField(title="更新时间", type=1, align=2)
    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    @ExcelField(title="联系电话", type=1, align=2)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @ExcelField(title="用户id", type=1, align=2)
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @ExcelField(title="图片链接", type=1, align=2)
    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @ExcelField(title="审核状态", type=1, align=2)
    public String getAudit() {
        return this.audit;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    @ExcelField(title="联系人", type=1, align=2)
    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @ExcelField(title="是否删除", type=1, align=2)
    public String getIsDel() {
        return this.isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    @ExcelField(title="公司名称", type=1, align=2)
    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @ExcelField(title="项目简介", type=1, align=2)
    public String getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}
