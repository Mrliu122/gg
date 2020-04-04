package com.szit.gg.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生表
 */
public class Student implements Serializable {
    private Integer stuID; //学号
    private String stuName; //姓名
    private String stuPassword;//密码
    private Date ClassDate;//入班日期
    private String stuAddress;//地址
    private String stuPhone;//电话

    @Override
    public String toString() {
        return "Student{" +
                "stuID=" + stuID +
                ", stuName='" + stuName + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                ", ClassDate=" + ClassDate +
                ", stuAddress='" + stuAddress + '\'' +
                ", stuPhone='" + stuPhone + '\'' +
                '}';
    }

    public Integer getStuID() {
        return stuID;
    }

    public void setStuID(Integer stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public Date getClassDate() {
        return ClassDate;
    }

    public void setClassDate(Date classDate) {
        ClassDate = classDate;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }
}
