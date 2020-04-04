package com.szit.gg.pojo;

/**
 * 班级表
 */
public class Geade {
    private String ID;//班级编号
    private String Name;//班级名称

    @Override
    public String toString() {
        return "Geade{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
