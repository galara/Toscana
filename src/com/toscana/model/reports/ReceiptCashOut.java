package com.toscana.model.reports;

import com.toscana.model.sessions.Session;
import com.toscana.model.reports.templates.ReceiptTemplate;
import javax.persistence.*;

@Entity
@Table (name = "cashout")
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

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
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
    @Id
    @Column (name = "ID")
    @GeneratedValue
    private int ID;
    @Column (name = "session")
    @OneToOne
    private Session session;
    @Column (name = "amount")
    private double retirementAmount;
    @Column (name = "curencytype")
    private String currencyType;
    
    private ReceiptTemplate receiptTempleate;
}
