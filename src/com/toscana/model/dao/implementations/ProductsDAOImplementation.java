/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.model.dao.implementations;

import com.toscana.model.dao.interfaces.ProductDAO;
import com.toscana.model.products.Product;


public class ProductsDAOImplementation extends DAOImplementation<Product, Integer> implements ProductDAO{

    @Override
    public Product findByName(String productName) {
        throw new UnsupportedOperationException(UNSUPPORTED_OPERATION_MESSAGE); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static final String UNSUPPORTED_OPERATION_MESSAGE="Not supported yet.";
    
}
