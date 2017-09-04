package cn.houserent.test;

import cn.houserent.entity.Dept;
import cn.houserent.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
    public static void main(String args[]) {
        load();


    }

    public static void load() {
        Session session = null;
        Transaction tx = null;
        Dept dept = null;
        try {

            session = HibernateUtil.currentSession();
            // 开始一个事务
            tx = session.beginTransaction();
            // 获取用户对象
            dept = (Dept) session.load(Dept.class, new Integer("1"));
            // 输出对象的状态
            System.out.println("user对象的状态：持久状态");
            // 修改用户信息
            //user.setUsername("rose");
            System.out.println("部名名称:" + dept.getDeptName());
            // 输出对象的状态
            System.out.println("user对象的状态：持久状态");
            // 提交事务
            tx.commit();
            // 输出对象的状态
            System.out.println("user对象的状态：游离状态");
        } catch (HibernateException e) {
            e.printStackTrace();
            // 回滚事务
            if (tx != null)
                tx.rollback();
        }
    }
}
