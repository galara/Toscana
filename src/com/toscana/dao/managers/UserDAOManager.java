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
 */
public class UserDAOManager {

    public UserDAOManager() {
        userDAO = new UserDAOImplementation();
    }

    public void add(User userToAdd) { //inp_user or userAdd
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.add(userToAdd);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(User userToDelete){
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.delete(userToDelete);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
        }
    }
    
    public void update(User userToUpdate){
        try {
            ToscanaHibernateUtil.beginTransaction();
            userDAO.update(userToUpdate);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public User findByID(Integer IDToFind){
        User userFound=null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            userFound =  userDAO.findByID(User.class, IDToFind);
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
