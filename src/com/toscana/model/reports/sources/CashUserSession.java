package com.toscana.model.reports.sources;

import com.toscana.model.sessions.Session;
import com.toscana.model.reports.types.CurrencyType;
import com.toscana.model.reports.ReceiptCashOut;
import javax.persistence.*;

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
    @Id
    @Column (name ="Id") 
    @GeneratedValue
    private int ID;
    
    @Column (name = "session")
    @OneToOne
    private Session session;
    
    @Column (name ="amountInCash")
    private double amountInCash;
    
    @Column (name = "currencyType")
    @OneToOne
    private CurrencyType currencyType;
    
    @Column (name = "cashOut")
    private ReceiptCashOut cashOut;
}
