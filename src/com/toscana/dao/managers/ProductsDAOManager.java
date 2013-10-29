/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.implementations.ProductsDAOImplementation;
import com.toscana.model.dao.interfaces.ProductDAO;
import com.toscana.model.products.Product;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;

/**
 *
 * @author Arandi
 */
public class ProductsDAOManager {
    private ProductDAO productsDAO;
    
    public ProductsDAOManager(){
        productsDAO = new ProductsDAOImplementation();
    }
    
    public void add (Product product){
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.add(product);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete (Product product){
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.delete(product);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update (Product product){
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.update(product);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public Product findByID(Integer ID){
        Product product = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.findByID(Product.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return product;
    }
    
    public ArrayList findAll(){
        ArrayList<Product> products = new ArrayList<>();
        try {
            ToscanaHibernateUtil.beginTransaction();
            products = (ArrayList<Product>) productsDAO.findAll(Product.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return products;
    }
}
