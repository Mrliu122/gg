package com.szit.gg.pojo;

import java.util.Date;

/**
 * 学分表
 */
public class Credit {
    private String stuType;//学分类型
    private String stuSize;//学分值
    private Date stuDate;//日期

    @Override
    public String toString() {
        return "Credit{" +
                "stuType='" + stuType + '\'' +
                ", stuSize='" + stuSize + '\'' +
                ", stuDate=" + stuDate +
                '}';
    }

    public String getStuType() {
        return stuType;
    }

    public void setStuType(String stuType) {
        this.stuType = stuType;
    }

    public String getStuSize() {
        return stuSize;
    }

    public void setStuSize(String stuSize) {
        this.stuSize = stuSize;
    }

    public Date getStuDate() {
        return stuDate;
    }

    public void setStuDate(Date stuDate) {
        this.stuDate = stuDate;
    }
}
