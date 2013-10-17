package com.model.reports;

import com.model.reports.templates.ReceiptTemplate;
import com.model.sales.DataSale;

public class ReceiptSale {

    /*
     * Class methods
     */
    /*
     * Getters and Setters
     */
    public ReceiptTemplate getReceipt() {
        return receipt;
    }

    public void setReceipt(ReceiptTemplate receipt) {
        this.receipt = receipt;
    }

    public DataSale getDataSale() {
        return dataSale;
    }

    public void setDataSale(DataSale dataSale) {
        this.dataSale = dataSale;
    }

    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private ReceiptTemplate receipt;
    private DataSale dataSale;
}
