package com.szit.gg.pojo;

/**
 * 老师表
 */
public class Teacher {
    private String terID;//编号
    private String terName;//姓名
    private String terPassword;//密码

    @Override
    public String toString() {
        return "Teacher{" +
                "terID='" + terID + '\'' +
                ", terName='" + terName + '\'' +
                ", terPassword='" + terPassword + '\'' +
                '}';
    }

    public String getTerID() {
        return terID;
    }

    public void setTerID(String terID) {
        this.terID = terID;
    }

    public String getTerName() {
        return terName;
    }

    public void setTerName(String terName) {
        this.terName = terName;
    }

    public String getTerPassword() {
        return terPassword;
    }

    public void setTerPassword(String terPassword) {
        this.terPassword = terPassword;
    }
}
