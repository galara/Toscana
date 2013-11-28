/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.dao.managers;

import com.toscana.model.dao.interfaces.SummaryPaymentsTypeDAO;
import com.toscana.model.reports.types.SummaryPaymentsType;
import com.toscana.persistance.util.ToscanaHibernateUtil;
import java.util.ArrayList;


/**
 *
 */
public class SummaryPaymentsTypeDAOManager {
    private SummaryPaymentsTypeDAO summaryPaymentsTypeDAO ;
    
    public void add(SummaryPaymentsType summaryPaymentsType){
        try {
            ToscanaHibernateUtil.beginTransaction();
            summaryPaymentsTypeDAO.add(summaryPaymentsType);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void delete(SummaryPaymentsType summaryPaymentsType){
        try {
            ToscanaHibernateUtil.beginTransaction();
            summaryPaymentsTypeDAO.delete(summaryPaymentsType);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public void update(SummaryPaymentsType summaryPaymentsType){
        try {
            ToscanaHibernateUtil.beginTransaction();
            summaryPaymentsTypeDAO.update(summaryPaymentsType);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
            ToscanaHibernateUtil.rollbackTransaction();
        }
    }
    
    public SummaryPaymentsType findByID(Integer ID){
        SummaryPaymentsType summaryPaymentsType = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            summaryPaymentsType = summaryPaymentsTypeDAO.findByID(SummaryPaymentsType.class, ID);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return summaryPaymentsType;
    }
    
    public ArrayList findAll(){
        ArrayList<SummaryPaymentsType> summaryPaymentsTypes = null;
        try {
            ToscanaHibernateUtil.beginTransaction();
            summaryPaymentsTypes = (ArrayList<SummaryPaymentsType>) summaryPaymentsTypeDAO.findAll(SummaryPaymentsType.class);
            ToscanaHibernateUtil.commitTransaction();
        } catch (Exception e) {
            System.err.println(e);
        }
        return summaryPaymentsTypes;
    }
}
