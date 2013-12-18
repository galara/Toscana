/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.implementations;

import com.toscana.dao.interfaces.UserDAO;
import com.toscana.model.sessions.User;


public class UserDAOImplementation extends GeneralDAOImplementation<User, Integer> implements UserDAO {

    @Override
    public User findByName(String userName) {
        throw new UnsupportedOperationException(UNSUPPORTED_OPERATION_MESSAGE); //To change body of generated methods, choose Tools | Templates.
    }
 
    private static final String UNSUPPORTED_OPERATION_MESSAGE="Not supported yet.";
}
