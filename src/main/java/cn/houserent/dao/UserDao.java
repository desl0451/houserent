package cn.houserent.dao;

import cn.houserent.entity.User;

import java.io.Serializable;

public interface UserDao {

    public User get(Serializable id);

    public User load(Serializable id);

    /**
     * 保存
     * @param user
     */
    public void save(User user);

    /**
     * 删除
     * @param id
     */
    public void delete(Serializable id);

    /**
     * 修改
     * @param user
     */
    public void update(User user);
}
