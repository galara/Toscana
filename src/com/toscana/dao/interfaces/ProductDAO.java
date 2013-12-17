/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.interfaces;

import com.toscana.model.products.Product;


public interface ProductDAO extends GeneralDAO<Product, Integer> {
    public Product findByName(String productName);
}
