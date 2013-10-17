package com.model.reports.types;

import com.model.sessions.Session;

public class SummaryPaymentsType {

    /*
     * Class' methods
     */
    /*
     * Getters and Setters
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    
     /*
     * Inner methods
     */
    
    /*
     * Attributes
     */
    private CurrencyType currency;
    private double amount;
    private Session session;
}
