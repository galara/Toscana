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
    
    public void add(DataSale inp_dataSale){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.add(inp_dataSale);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(DataSale inp_dataSale){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.delete(inp_dataSale);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(DataSale inp_dataSale){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleDAO.update(inp_dataSale);
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
