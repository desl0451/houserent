package cn.houserent.service;

import cn.houserent.dao.DeptDao;
import cn.houserent.dao.impl.DeptDaoImpl;
import cn.houserent.entity.Dept;
import cn.houserent.util.HibernateUtil;
import org.hibernate.Transaction;

public class DeptBizImpl implements DeptBiz {
    private DeptDao deptDao = new DeptDaoImpl();

    public Dept findDeptById(Byte id) {
        Transaction tx = null;
        Dept result = null;
        try {
            tx = HibernateUtil.currentSession().beginTransaction();
            result = deptDao.get(id);//调用Dao方法,根据IOD加载指定Dept对象
            tx.commit();//提交事务
        } catch (Exception ex) {
            ex.printStackTrace();
            if (tx != null) {
                tx.rollback();
            }
        }
        return result;
    }
}
