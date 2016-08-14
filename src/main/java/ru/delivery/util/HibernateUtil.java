package ru.delivery.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.net.URL;


/**
 * Created by artur on 07.08.16.
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    private static ServiceRegistry serviceRegistry;

    private HibernateUtil(){}

    static {
        Configuration configuration = new Configuration();
        configuration.configure("Hibernate.cfg.xml");
        serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
