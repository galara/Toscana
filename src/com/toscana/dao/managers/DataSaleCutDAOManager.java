/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.interfaces.DataSaleCutDAO;
import com.toscana.model.reports.sources.DataSaleCut;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;

/**
 *
 * 
 */
public class DataSaleCutDAOManager {
    
    
    public void add(DataSaleCut dataSaleCut){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleCutDAO.add(dataSaleCut);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(DataSaleCut dataSaleCut){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleCutDAO.delete(dataSaleCut);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(DataSaleCut dataSaleCut){
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleCutDAO.update(dataSaleCut);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public DataSaleCut findByID(Integer ID){
        DataSaleCut dataSaleCut = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleCut = dataSaleCutDAO.findByID(DataSaleCut.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return dataSaleCut;
    }
    
    public ArrayList findAll(){
        ArrayList<DataSaleCut> dataSaleCuts = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            dataSaleCuts = (ArrayList<DataSaleCut>) dataSaleCutDAO.findAll(DataSaleCut.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return dataSaleCuts;
    }
    
    private DataSaleCutDAO dataSaleCutDAO;
}
