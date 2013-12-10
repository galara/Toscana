/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.admin;

import com.toscana.controller.product.ProductViewController;
import com.toscana.controller.user.AdminUserViewController;

/**
 *
 * @author Arandi
 */
public class AdminViewController {
    
    

    public AdminViewController() {
        userViewController = new AdminUserViewController();
        productViewController = new ProductViewController();
    }

    public ProductViewController getProductViewController() {
        return productViewController;
    }

    public AdminUserViewController getUserViewController() {
        return userViewController;
    }
    
    private AdminUserViewController userViewController;
    private ProductViewController productViewController;
    
}
