/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toscana.controller.product;

import com.toscana.dao.managers.ProductDAOManager;
import com.toscana.model.products.Product;
import java.util.ArrayList;


/**
 *
 * @author SG_05
 */
public class ProductController {
 
     public ProductController() {
        productDAOManager = new ProductDAOManager();
    }

    /*
     * Bloque Altas, Bajos y Cambios
     */
    public void addProduct(Product productToAdd) {
        productDAOManager.add(productToAdd);
    }

    public void updateProduct(Product productToUpdate) {
        productDAOManager.update(productToUpdate);
    }

    public void deleteProduct(Product productToDelete) {
        productDAOManager.delete(productToDelete);
    }

    /*
     * Bloque Gets
     */
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> allProductsList = (ArrayList<Product>) productDAOManager.findAll();

        return allProductsList;
    }

    private ProductDAOManager productDAOManager;
}
