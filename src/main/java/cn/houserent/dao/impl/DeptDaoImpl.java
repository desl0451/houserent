package cn.houserent.dao.impl;

import cn.houserent.dao.DeptDao;
import cn.houserent.entity.Dept;
import cn.houserent.util.HibernateUtil;

import java.io.Serializable;

public class DeptDaoImpl implements DeptDao {
    public Dept get(Serializable id) {
        //通过Session的get()方法根据OID加载指定对象
        return (Dept) HibernateUtil.currentSession().get(Dept.class, id);
    }
}
