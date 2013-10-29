/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.persistance.util.ToscanaHibernateUtil;
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

    public void add(User inp_user) { //inp_user or userAdd
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.add(inp_user);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(User inp_user){
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.delete(inp_user);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
        }
    }
    
    public void update(User inp_user){
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.update(inp_user);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public User findByID(Integer ID){
        User userFound=null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            userFound =  userDAO.findByID(User.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
        }
        
        return userFound;
    }
    
    public ArrayList<User> findAll(){
        ArrayList<User> allUsers = new ArrayList<>();
        try {
            ToscanaHibernateUtil.beginTransaction();
            allUsers = (ArrayList<User>) userDAO.findAll(User.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
        }
        
        return allUsers;
    }
    private UserDAO userDAO;
}
