/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.model.dao.interfaces;

import com.toscana.model.products.Product;

/**
 *
 * @author Arandi
 */
public interface ProductDAO extends GenericDAO<Product, Integer> {
    public Product findByName(String name);
}
