package com.regex.web.common.utils;

import com.regex.web.common.utils.QueryParam;

public class QueryConditions extends QueryParam{

    private String name;
    
    private String type;
    
    private String model;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
}
