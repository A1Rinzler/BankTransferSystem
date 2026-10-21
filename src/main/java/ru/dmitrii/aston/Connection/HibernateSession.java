package ru.dmitrii.aston.Conncetion;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author : Dmitrii Frolov, a.k.a. A1Rinzler
 * @created : 20.10.2026
 **/

public class HibernateSession {
    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
}
