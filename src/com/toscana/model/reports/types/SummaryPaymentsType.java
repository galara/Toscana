package com.toscana.model.reports.types;

import com.toscana.model.sessions.Session;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name ="summaryPayments")
public class SummaryPaymentsType {

    /*
     * Class' methods
     */
    /*
     * Getters and Setters
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
    
    @Column (name = "currency")
    private String currency;
    
    @Column (name = "amount")
    private double amount;
    
    @Column (name = "session")
    @OneToOne
    private Session session;
    
}
