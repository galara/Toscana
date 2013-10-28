/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.model.dao.implementations;

import com.toscana.model.dao.interfaces.ProductDAO;
import com.toscana.model.products.Product;

/**
 *
 * @author Arandi
 */
public class ProductsDAOImplementation extends GenericDAOImplementation<Product, Integer> implements ProductDAO{

    @Override
    public Product findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
