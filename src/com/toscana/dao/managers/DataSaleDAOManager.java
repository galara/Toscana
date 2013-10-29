/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.implementations.DataSaleDAOImplementation;
import com.toscana.model.dao.interfaces.DataSaleDAO;
import com.toscana.model.sales.DataSale;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;

/**
 *
 * @author Arandi
 */
public class DataSaleDAOManager {
    private DataSaleDAO dataSaleDAO;
    
    public DataSaleDAOManager(){
        dataSaleDAO = new DataSaleDAOImplementation();
    }
    
    public void add(DataSale dataSale){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.add(dataSale);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(DataSale dataSale){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.delete(dataSale);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(DataSale dataSale){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.update(dataSale);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public ArrayList findAll(){
        ArrayList<DataSale> dataSales = new ArrayList<>();
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSales = (ArrayList<DataSale>) dataSaleDAO.findAll(DataSale.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return dataSales;
    }
    
    public DataSale findByID(Integer ID){
        DataSale dataSale = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSale = dataSaleDAO.findByID(DataSale.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return dataSale;
    }
}
