/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.dao.interfaces.SessionDAO;
import com.toscana.model.sessions.Session;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;

/**
 *
 */
public class SessionDAOManager {
    private SessionDAO sessionDAO;
    
    public void add(Session sessionToAdd){
        try {
            ToscanaHibernateUtil.beginTransaction();
            sessionDAO.add(sessionToAdd);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(Session sessionToDelete){
        try {
            ToscanaHibernateUtil.beginTransaction();
            sessionDAO.delete(sessionToDelete);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(Session sessionToUpdate){
        try {
            ToscanaHibernateUtil.beginTransaction();
            sessionDAO.update(sessionToUpdate);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public Session findByID(Integer ID){
        Session foundSession = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            foundSession = sessionDAO.findByID(Session.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return foundSession;
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
