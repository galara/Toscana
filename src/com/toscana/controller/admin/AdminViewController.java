/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.admin;

import com.toscana.controller.user.UserController;

/**
 *
 * @author Arandi
 */
public class AdminViewController {
    
    private UserController userController;

    public AdminViewController() {
        userController = new UserController();
    }

    public UserController getUserController() {
        return userController;
    }
    
}
