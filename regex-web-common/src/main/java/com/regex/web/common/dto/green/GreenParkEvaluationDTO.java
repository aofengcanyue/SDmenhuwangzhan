package com.regex.web.common.dto.green;
public class GreenParkEvaluationDTO {
    private Long id;
    private String unit;//单位
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private String isDel;
    private String classb;//二级指标
    private String classa;//一级指标
    public GreenParkEvaluationDTO() {
        super();
    }
    public GreenParkEvaluationDTO(Long id,String unit,java.util.Date updateTime,java.util.Date createTime,String isDel,String classb,String classa) {
        super();
        this.id = id;
        this.unit = unit;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.isDel = isDel;
        this.classb = classb;
        this.classa = classa;
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public String getClassb() {
        return this.classb;
    }

    public void setClassb(String classb) {
        this.classb = classb;
    }

    public String getClassa() {
        return this.classa;
    }

    public void setClassa(String classa) {
        this.classa = classa;
    }

}
