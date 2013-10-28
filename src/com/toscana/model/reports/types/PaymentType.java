package com.toscana.model.reports.types;

import javax.persistence.*;

@Entity
@Table (name ="paymenttypes")
public class PaymentType {

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

    public double getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    @Id
    @Column (name="id")
    @GeneratedValue
    private int ID;
    
    @Column (name ="amountreceived")
    private double amountReceived;
    
    @Column (name ="currency")
    private String currency;
    
    @Column (name ="sale")
    @OneToMany
    private int sale;
}
