/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.interfaces.SessionDAO;
import com.toscana.model.sessions.Session;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;

/**
 *
 */
public class SessionDAOManager {
    private SessionDAO sessionDAO;
    
    public void add(Session session){
        try {
            ToscanaHibernateUtil.beginTransaction();
            sessionDAO.add(session);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(Session dataSaleCut){
        try {
            ToscanaHibernateUtil.beginTransaction();
            sessionDAO.delete(dataSaleCut);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(Session session){
        try {
            ToscanaHibernateUtil.beginTransaction();
            sessionDAO.update(session);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public Session findByID(Integer ID){
        Session session = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            session = sessionDAO.findByID(Session.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return session;
    }
    
    public ArrayList findAll(){
        ArrayList<Session> sessions = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            sessions = (ArrayList<Session>) sessionDAO.findAll(Session.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return sessions;
    }
    
    
}
