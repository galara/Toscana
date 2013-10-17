package com.model.reports.sources;

import com.model.sessions.Session;
import com.model.reports.types.CurrencyType;
import com.model.reports.ReceiptCashOut;

public class CashUserSession {

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

    public double getAmountInCash() {
        return amountInCash;
    }

    public void setAmountInCash(double amountInCash) {
        this.amountInCash = amountInCash;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public ReceiptCashOut getCashOut() {
        return cashOut;
    }

    public void setCashOut(ReceiptCashOut cashOut) {
        this.cashOut = cashOut;
    }

    
    /*
     * Inner methods
     */
    /*
     * Attributes
     */
    private int ID;
    private Session session;
    private double amountInCash;
    private CurrencyType currencyType;
    private ReceiptCashOut cashOut;
}
