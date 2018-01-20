package com.regex.web.common.dto.info;
public class ExpertDTO implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String resume;//简历
    private java.util.Date updateTime;
    private String technicalTitle;//技术职称
    private java.util.Date createTime;
    private String phone;
    private String origin;//籍贯
    private String name;
    private String isDel;
    private String headPic;//头像
    private String company;
    private String professional;//专业领域
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResume() {
        return this.resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTechnicalTitle() {
        return this.technicalTitle;
    }

    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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

    public String getHeadPic() {
        return this.headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProfessional() {
        return this.professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

}
