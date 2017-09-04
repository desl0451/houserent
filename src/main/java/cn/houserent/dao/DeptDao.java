package cn.houserent.dao;

import cn.houserent.entity.Dept;

import java.io.Serializable;

public interface DeptDao {
    public Dept get(Serializable id);
}
