package com.regex.web.common.dto.info;
public class SupplyEvaluationResultDTO {
    private Long id;
    private java.util.Date updateTime;
    private java.util.Date createTime;
    private String year;
    private String name;
    private String isDel;
    private String point;
    public SupplyEvaluationResultDTO() {
        super();
    }
    public SupplyEvaluationResultDTO(Long id,java.util.Date updateTime,java.util.Date createTime,String year,String name,String isDel,String point) {
        super();
        this.id = id;
        this.updateTime = updateTime;
        this.createTime = createTime;
        this.year = year;
        this.name = name;
        this.isDel = isDel;
        this.point = point;
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

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsDel() {
        return this.isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getPoint() {
        return this.point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

}
