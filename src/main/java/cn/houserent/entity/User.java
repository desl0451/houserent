package cn.houserent.entity;

import java.io.Serializable;

/**
 * 用户表结构
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String telephone;
    private String username;
    private String isadmin;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Integer getId() {
        return id;
    }

    public String getIsadmin() {
        return isadmin;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setIsadmin(String isadmin) {
        this.isadmin = isadmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
