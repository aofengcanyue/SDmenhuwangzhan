package com.regex.web.common.dto.info;

import com.regex.web.excel.annotation.ExcelField;

public class SupplyDemandDTO {
    private Long id;
    private String quantity;//数量
    private java.util.Date createTime;
    private String endTime;//到期时间
    private String transport;//运输方式
    private String materielType;//物资类别
    private String type;//供求类型 0供应 1求购
    private java.util.Date updateTime;
    private String phone;//电话
    private String imgUrl;//图片
    private String userId;//发布者id
    private String price;//价格
    private String audit;//审核状态 0 待审核 1 审核通过 2 驳回
    private String contact;//联系人
    private String name;//名称
    private String isDel;//0正常 1删除
    private String company;//公司
    private String introduction;//简介
    private String time;
    
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public SupplyDemandDTO() {
        super();
    }
    public SupplyDemandDTO(Long id,String quantity,java.util.Date createTime,String endTime,String transport,String materielType,String type,java.util.Date updateTime,String phone,String imgUrl,String userId,String price,String audit,String contact,String name,String isDel,String company,String introduction) {
        super();
        this.id = id;
        this.quantity = quantity;
        this.createTime = createTime;
        this.endTime = endTime;
        this.transport = transport;
        this.materielType = materielType;
        this.type = type;
        this.updateTime = updateTime;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.userId = userId;
        this.price = price;
        this.audit = audit;
        this.contact = contact;
        this.name = name;
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

    @ExcelField(title="数量", type=1, align=2)
    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @ExcelField(title="创建时间", type=1, align=2)
    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    @ExcelField(title="到期时间", type=1, align=2)
    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @ExcelField(title="运输方式", type=1, align=2)
    public String getTransport() {
        return this.transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @ExcelField(title="物资类别", type=1, align=2)
    public String getMaterielType() {
        return this.materielType;
    }

    public void setMaterielType(String materielType) {
        this.materielType = materielType;
    }

    @ExcelField(title="供求类型", type=1, align=2)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
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

    @ExcelField(title="物资图片", type=1, align=2)
    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @ExcelField(title="发布用户id", type=1, align=2)
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    @ExcelField(title="单价", type=1, align=2)
    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    @ExcelField(title="名称", type=1, align=2)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ExcelField(title="是否删除", type=1, align=2)
    public String getIsDel() {
        return this.isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    @ExcelField(title="公司", type=1, align=2)
    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @ExcelField(title="简介", type=1, align=2)
    public String getIntroduction() {
        return this.introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

}
