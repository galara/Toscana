package com.toscana.model.reports.types;

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

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public int getID_sale() {
        return ID_sale;
    }

    public void setID_sale(int ID_sale) {
        this.ID_sale = ID_sale;
    }

    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private int ID;
    private double amountReceived;
    private CurrencyType currency;
    private int ID_sale;
}
