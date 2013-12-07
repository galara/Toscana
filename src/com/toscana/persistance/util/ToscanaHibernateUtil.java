/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.persistance.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Arandi
 */
public class ToscanaHibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new Configuration().configure(
                                 "/com/toscana/config/hibernate.cfg.xml"
                                 ).buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session beginTransaction() {
        Session hibernateSession = ToscanaHibernateUtil.getSession();
        hibernateSession.beginTransaction();
        return hibernateSession;
    }

    public static void commitTransaction() {
        ToscanaHibernateUtil.getSession().getTransaction().commit();
    }

    public static void rollbackTransaction() {
        ToscanaHibernateUtil.getSession().getTransaction().rollback();
    }

    public static void closeSession() {
        ToscanaHibernateUtil.getSession().close();
    }

    public static Session getSession() {
        Session hibernateSession = sessionFactory.getCurrentSession();
        return hibernateSession;
    }
    
    public static void main(String[] args) {
        Session session = ToscanaHibernateUtil.getSession();
        session.toString();
    }
}
