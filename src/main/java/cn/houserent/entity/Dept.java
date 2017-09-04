package cn.houserent.entity;

import java.io.Serializable;

public class Dept implements Serializable {
    /*字段*/
    private Integer deptNo;
    private String deptName;
    private String location;

    public Dept() {

    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}