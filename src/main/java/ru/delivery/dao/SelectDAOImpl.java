package ru.delivery.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import ru.delivery.model.Category;
import ru.delivery.model.Product;
import ru.delivery.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class SelectDAOImpl implements SelectDAO{

    private final static Logger loger = Logger.getLogger(SelectDAOImpl.class);

    public List<Category> getListCategory() {
        Session session = null;
        List<Category> list=null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            list = (List<Category>) session.createCriteria(Category.class).list();
        }catch (Exception ex){
            loger.error(ex);
        }finally {
            if (session!=null){
                session.close();
            }
        }
        return list;
    }

    public List<Product> getListProduct(Category category) {
        Session session = null;
        List<Product> list = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            list = (List<Product>) session.createCriteria(Product.class)
                    .add(Restrictions.eq("Product.id_category", category.getId_category())).list();
        }catch (Exception ex){
            loger.error(ex);
        }finally {
            if (session!=null){
                session.close();
            }
        }
        return list;
    }
}
