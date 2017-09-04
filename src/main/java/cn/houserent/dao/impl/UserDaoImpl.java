package cn.houserent.dao.impl;

import cn.houserent.dao.UserDao;
import cn.houserent.entity.User;
import cn.houserent.util.HibernateUtil;

import java.io.Serializable;

public class UserDaoImpl implements UserDao {

    public User get(Serializable id) {
        return (User)HibernateUtil.currentSession().get(User.class, id);
    }

    public User load(Serializable id) {
        return (User) HibernateUtil.currentSession().load(User.class,id);
    }

    public void save(User user) {
        HibernateUtil.currentSession().save(user);
    }

    public void delete(Serializable id) {
        HibernateUtil.currentSession().delete(id);
    }

    public void update(User user) {
        HibernateUtil.currentSession().update(user);
    }
}
