package com.model.reports;

import com.model.sessions.Session;
import com.model.reports.types.CurrencyType;
import com.model.reports.templates.ReceiptTemplate;

public class ReceiptCashOut {

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

    public double getRetirementAmount() {
        return retirementAmount;
    }

    public void setRetirementAmount(double retirementAmount) {
        this.retirementAmount = retirementAmount;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
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
    private double retirementAmount;
    private CurrencyType currencyType;
    private ReceiptTemplate receiptTempleate;
}
