package com.regex.web.common.dto.info;
public class IndustryInfoDTO implements java.io.Serializable {
    
    /**
     */
    private static final long serialVersionUID = -1112962154637004822L;
    private String industryId;//主键
    private String industryName;//行业名称
    private String classifyId;//行业分类
    private String industryCode;//行业编码
    public String getIndustryId() {
        return this.industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getIndustryName() {
        return this.industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getClassifyId() {
        return this.classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    public String getIndustryCode() {
        return this.industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

}
