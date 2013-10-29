/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.implementations.ProductsDAOImplementation;
import com.toscana.model.dao.interfaces.ProductDAO;
import com.toscana.persistance.util.ToscanaHibernateUtil;

/**
 *
 * @author Arandi
 */
public class ProductsDAOManager {
    private ProductDAO productsDAO;
    
    public ProductsDAOManager(){
        productsDAO = new ProductsDAOImplementation();
    }
    
    public void add (){
        
    }
    
    public void delete (){
        
    }
    
    public void update (){
        
    }
    
    public Product findByID(){
        
    }
    
    public ArrayList findAll(){
        
    }
}
