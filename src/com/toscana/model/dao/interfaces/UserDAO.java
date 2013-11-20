/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.model.dao.interfaces;

import com.toscana.model.sessions.User;

public interface UserDAO extends GenericDAO<User, Integer>{
    public User findByName(String name);
}
