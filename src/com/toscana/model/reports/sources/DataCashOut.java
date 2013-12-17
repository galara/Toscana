package com.toscana.model.reports.sources;

import com.toscana.model.sessions.Session;
import javax.persistence.*;

@Entity
@Table (name = "cashout")
public class DataCashOut {

    /*
     * Class methods
     */
    public DataCashOut(Session session, double retirementAmount, String currencyType) {
        this.session = session;
        this.retirementAmount = retirementAmount;
        this.currencyType = currencyType;
    }

    public DataCashOut() {
        this.ID=DEFAULT_ID;
        this.currencyType = DEFAULT_CURRENCY_TYPE;
        this.retirementAmount = DEFAULT_RETIRAMENT_AMOUNT;
        this.session = DEFAULT_SESSION;
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

    public double getRetirementAmount() {
        return retirementAmount;
    }

    public void setRetirementAmount(double retirementAmount) {
        this.retirementAmount = retirementAmount;
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
    @Column (name = "ID")
    @GeneratedValue
    private int ID;
    
    @OneToOne
    @JoinColumn(name = "id_session")
    @org.hibernate.annotations.ForeignKey(name="FK_SESSION_ID")   
    private Session session;
    
    @Column (name = "retirementamount")
    private double retirementAmount;
    
    @Column (name = "curencytype")
    private String currencyType;
    
    private final static int DEFAULT_ID=0;
    private final static String DEFAULT_CURRENCY_TYPE=null;
    private final static double DEFAULT_RETIRAMENT_AMOUNT=0.0;
    private final static Session DEFAULT_SESSION=null;
}
/*
 * Esta clase es la referencia al retiro de efectivo
 */
