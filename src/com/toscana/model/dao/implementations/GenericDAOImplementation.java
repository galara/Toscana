/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.model.dao.implementations;

import com.toscana.model.dao.interfaces.GenericDAO;
import com.toscana.util.ToscanaHibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Arandi
 */
public abstract class GenericDAOImplementation<T, ID extends Serializable> implements GenericDAO<T, ID> {
    protected Session getSession() {
        return ToscanaHibernateUtil.getSession();
    }
    @Override
    public void update(T e){
        Session hibernateSession = this.getSession();
        hibernateSession.merge(e);
    }

    @Override
    public void delete(T e){
        Session hibernateSession = this.getSession();
        hibernateSession.delete(e);
    }

    @Override
    public void add(T e){
        Session hibernateSession = this.getSession();
        hibernateSession.saveOrUpdate(e);
    }

    @Override
    public T findByID(Class c, Integer ID){
        Session hibernateSession = this.getSession();
        T t = null;
        t = (T) hibernateSession.get(c, ID);
        return t;
    }
    
    @Override
    public List findAll(Class c){
        Session hibernateSession = this.getSession();
        List T = null;
        Query query = hibernateSession.createQuery("from " + c.getName());
        T = query.list();
        return T;
    }
}
