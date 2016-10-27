package ru.delivery.dao;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.bytecode.buildtime.spi.ExecutionException;
import org.hibernate.jpa.boot.archive.spi.AbstractArchiveDescriptor;
import ru.delivery.model.*;
import ru.delivery.util.HibernateUtil;

public class FunctionTableDAOImpl implements FunctionTableDAO {

    private final static Logger loger = Logger.getLogger(FunctionTableDAOImpl.class);

    public void firstCreateTable() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.createCriteria(Category.class).list();
            session.createCriteria(Client.class).list();
            session.createCriteria(Currency.class).list();
            session.createCriteria(Operation.class).list();
            session.createCriteria(Order.class).list();
            session.createCriteria(Product.class).list();
            session.createCriteria(TypeCurrency.class).list();
        }catch (Exception ex){
            loger.error(ex);
        }finally {
            if(session != null){
                session.close();
            }
        }
    }

    public void allDeleteTable() {

    }

    public void deleteTable(String nameTable) {

    }
}
