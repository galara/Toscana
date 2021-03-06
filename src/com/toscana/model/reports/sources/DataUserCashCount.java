package com.toscana.model.reports.sources;

import com.toscana.model.sessions.Session;
import javax.persistence.*;

@Entity
@Table (name = "cashusercount")
public class DataUserCashCount {

    /*
     * Class methods
     */
    public DataUserCashCount(Session session, double amountInCash, String currencyType) {
        this.session = session;
        this.amountInCash = amountInCash;
        this.currencyType = currencyType;
    }

    public DataUserCashCount() {
        this.session = DEFAULT_SESSION;
        this.amountInCash = DEFAULT_AMOUNT_CASH;
        this.currencyType = DEFAULT_CURRENCY_TYPE;
    }
    
    
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

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
    /*
     * Inner methods
     */
    /*
     * Attributes
     */
    @Id
    @Column (name ="id") 
    @GeneratedValue
    private int ID;
       
    @OneToOne
    @JoinColumn (name = "id_session")
    @org.hibernate.annotations.ForeignKey(name="FK_SESSION_ID")
    private Session session;
    
    @Column (name ="amountInCash")
    private double amountInCash;
    
    @Column (name = "currencyType")
    private String currencyType;
    
    private final static String DEFAULT_CURRENCY_TYPE=null;
    private final static double DEFAULT_AMOUNT_CASH=0.0;
    private final static Session DEFAULT_SESSION=null;
}
