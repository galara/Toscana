package com.toscana.model.sales;

import java.util.ArrayList;
import java.util.Date;
import com.toscana.model.sessions.Session;
import java.util.List;

public class DataSale {
    
     /*
     * Class' methods
     */
    
     /*
     * Getters and Setters
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList getProductsInSale() {
        return productsInSale;
    }

    public void setProductsInSale(ArrayList productsInSale) {
        this.productsInSale = productsInSale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public List getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(List paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private int ID;
    private ArrayList productsInSale;
    private Date date;
    private Session session;
    private List paymentTypes;
    private double total;
}
