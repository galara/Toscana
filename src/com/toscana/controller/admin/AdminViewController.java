/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.admin;

import com.toscana.controller.user.UserViewController;

/**
 *
 * @author Arandi
 */
public class AdminViewController {
    
    private UserViewController userViewController;

    public AdminViewController() {
        userViewController = new UserViewController();
    }

    public UserViewController getUserViewController() {
        return userViewController;
    }
    
    
    
}
