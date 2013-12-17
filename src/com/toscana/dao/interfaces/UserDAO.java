/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.interfaces;

import com.toscana.model.sessions.User;

public interface UserDAO extends GeneralDAO<User, Integer>{
    public User findByName(String userName);
}
