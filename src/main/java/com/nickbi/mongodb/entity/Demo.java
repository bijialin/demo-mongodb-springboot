package com.nickbi.mongodb.entity;

import java.io.Serializable;

/**
 * @author nickbi
 * @date 2018-03-14
 */
public class Demo implements Serializable {
    private static final long serialVersionUID = -2690172857360156293L;
    private Long id;
    private String demo;
    private String demoName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }
}
