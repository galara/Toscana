/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.model.dao.implementations;

import com.toscana.model.dao.interfaces.UserDAO;
import com.toscana.model.sessions.User;


public class UserDAOImplementation extends DAOImplementation<User, Integer> implements UserDAO {

    @Override
    public User findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
