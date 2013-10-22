package com.toscana.model.reports;

import com.toscana.model.sessions.Session;
import com.toscana.model.sessions.User;
import com.toscana.model.reports.templates.ReceiptTemplate;

public class ReceiptSaleCut {

    /*
     * Class methods
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

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public User getAuthorizerAdmin() {
        return authorizerAdmin;
    }

    public void setAuthorizerAdmin(User authorizerAdmin) {
        this.authorizerAdmin = authorizerAdmin;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public ReceiptTemplate getReceiptTempleate() {
        return receiptTempleate;
    }

    public void setReceiptTempleate(ReceiptTemplate receiptTempleate) {
        this.receiptTempleate = receiptTempleate;
    }

    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private int ID;
    private Session session;
    private User authorizerAdmin;
    private double totalCash;
    private ReceiptTemplate receiptTempleate;
}
