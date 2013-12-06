/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toscana.controller.user;

import com.toscana.dao.managers.UserDAOManager;
import com.toscana.model.sessions.User;
import java.util.ArrayList;

/**
 *
 * @author SG_05
 */
public class UserController {

    public UserController() {
        userDAOManager = new UserDAOManager();
    }

    /*
     * Bloque Altas, Bajos y Cambios
     */
    public void addUser(User userToAdd) {
        this.userDAOManager.add(userToAdd);
    }

    public void updateUser(User userToUpdate) {
        this.userDAOManager.update(userToUpdate);
    }

    public void deleteUser(User userToDelete) {
        this.userDAOManager.delete(userToDelete);
    }

    /*
     * Bloque Gets
     */
    public ArrayList<User> getAllUsers() {
        ArrayList<User> allUsersList = (ArrayList<User>) userDAOManager.findAll();

        return allUsersList;
    }

    private UserDAOManager userDAOManager;
      
}