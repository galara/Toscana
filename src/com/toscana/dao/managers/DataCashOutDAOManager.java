/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.dao.implementations.DataCashOutDAOImplementation;
import com.toscana.dao.interfaces.DataCashOutDAO;
import com.toscana.model.reports.sources.DataCashOut;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;

/**
 *
 */
public class DataCashOutDAOManager {
    
    
    public DataCashOutDAOManager (){
        dataCashOutDAO = new DataCashOutDAOImplementation();
    }
    
    public void add (DataCashOut cashOutToAdd){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataCashOutDAO.add(cashOutToAdd);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public  void delete(DataCashOut cashOutToDelete){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataCashOutDAO.delete(cashOutToDelete);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update (DataCashOut cashOutTuUpdate){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataCashOutDAO.update(cashOutTuUpdate);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public DataCashOut findByID(Integer ID){
        DataCashOut foundCashOut = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            foundCashOut =  dataCashOutDAO.findByID(DataCashOut.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return foundCashOut;
    }
    
    public ArrayList findAll(){
        ArrayList<DataCashOut> allCashOuts = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            allCashOuts = (ArrayList<DataCashOut>) dataCashOutDAO.findAll(DataCashOut.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        
        return allCashOuts;
    }
    
    private DataCashOutDAO dataCashOutDAO;
}
