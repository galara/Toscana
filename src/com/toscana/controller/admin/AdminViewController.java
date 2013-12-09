/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.admin;

import com.toscana.controller.product.ProductViewController;
import com.toscana.controller.user.UserViewController;

/**
 *
 * @author Arandi
 */
public class AdminViewController {
    
    

    public AdminViewController() {
        userViewController = new UserViewController();
        productViewController = new ProductViewController();
    }

    public ProductViewController getProductViewController() {
        return productViewController;
    }

    public UserViewController getUserViewController() {
        return userViewController;
    }
    
    
    
    private UserViewController userViewController;
    private ProductViewController productViewController;
    
}
