/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.interfaces.DataSystemCashCountDAO;
import com.toscana.model.reports.sources.DataSystemCashCount;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;

/**
 *
 * @author Arandi
 */
public class DataSystemCashCountDAOManager {
    private DataSystemCashCountDAO systemCashCountDAO;
    
    public void add(DataSystemCashCount cashCount){
        try {
            ToscanaHibernateUtil.beginTransaction();
            systemCashCountDAO.add(cashCount);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(DataSystemCashCount cashCount){
        try {
            ToscanaHibernateUtil.beginTransaction();
            systemCashCountDAO.delete(cashCount);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(DataSystemCashCount cashCount){
        try {
            ToscanaHibernateUtil.beginTransaction();
            systemCashCountDAO.update(cashCount);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public ArrayList findAll(){
        ArrayList<DataSystemCashCount> cashCounts = new ArrayList<>();
        try {
            ToscanaHibernateUtil.beginTransaction();
            cashCounts = (ArrayList<DataSystemCashCount>) systemCashCountDAO.findAll(DataSystemCashCount.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return cashCounts;
    }
    
    public DataSystemCashCount findByID(Integer ID){
        DataSystemCashCount cashCount =null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            cashCount = systemCashCountDAO.findByID(DataSystemCashCount.class , ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return cashCount;
    }
}
