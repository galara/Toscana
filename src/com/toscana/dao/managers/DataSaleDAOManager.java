/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.implementations.DataSaleDAOImplementation;
import com.toscana.model.dao.interfaces.DataSaleDAO;
import com.toscana.model.reports.sources.DataSale;
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
    
    public void add(DataSale dataSaleToAdd){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.add(dataSaleToAdd);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(DataSale dataSaleToDelete){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.delete(dataSaleToDelete);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(DataSale dataSaleToUpdate){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.update(dataSaleToUpdate);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public ArrayList findAll(){
        ArrayList<DataSale> allDataSales = new ArrayList<>();
        try {
            ToscanaHibernateUtil.beginTransaction();
            allDataSales = (ArrayList<DataSale>) dataSaleDAO.findAll(DataSale.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return allDataSales;
    }
    
    public DataSale findByID(Integer IDToFind){
        DataSale dataSaleFound = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleFound = dataSaleDAO.findByID(DataSale.class, IDToFind);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return dataSaleFound;
    }
}
