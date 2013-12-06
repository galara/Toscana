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
 */
public class ProductDAOManager {
    private ProductDAO productsDAO;
    
    public ProductDAOManager(){
        productsDAO = new ProductsDAOImplementation();
    }
    
    public void add (Product productToAdd){
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.add(productToAdd);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete (Product productToDelete){
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.delete(productToDelete);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update (Product productToUpdate){
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.update(productToUpdate);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public Product findByID(Integer IDToFind){
        Product productFound = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            productsDAO.findByID(Product.class, IDToFind);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return productFound;
    }
    
    public ArrayList findAll(){
        ArrayList<Product> allProducts = new ArrayList<>();
        try {
            ToscanaHibernateUtil.beginTransaction();
            allProducts = (ArrayList<Product>) productsDAO.findAll(Product.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return allProducts;
    }
}
