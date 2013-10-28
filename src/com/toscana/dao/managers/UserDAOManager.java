/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.util.ToscanaHibernateUtil;
import com.toscana.model.dao.implementations.UserDAOImplementation;
import com.toscana.model.dao.interfaces.UserDAO;
import com.toscana.model.sessions.User;
import java.util.ArrayList;

/**
 *
 * @author Arandi
 */
public class UserDAOManager {

    public UserDAOManager() {
        userDAO = new UserDAOImplementation();
    }

    public void add(User user) {
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.add(user);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(User user){
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.delete(user);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
        }
    }
    
    public void update(User user){
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.update(user);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public User findByID(Integer ID){
        User user=null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            user =  userDAO.findByID(User.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
        }
        
        return user;
    }
    
    public ArrayList<User> findAll(){
        ArrayList<User> users = new ArrayList<>();
        try {
            ToscanaHibernateUtil.beginTransaction();
            users = (ArrayList<User>) userDAO.findAll(User.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
        }
        
        return users;
    }
    private UserDAO userDAO;
}
