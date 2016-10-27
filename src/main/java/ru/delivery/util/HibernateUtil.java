package ru.delivery.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    private static ServiceRegistry serviceRegistry;

    private HibernateUtil(){}

    public static SessionFactory getSessionFactory() {
        return new Configuration().configure().buildSessionFactory(
                new StandardServiceRegistryBuilder().build() );
    }
}
