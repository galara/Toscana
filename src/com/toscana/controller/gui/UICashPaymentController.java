/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.gui;

import com.toscana.controller.sales.SaleController;
import com.toscana.model.reports.sources.DataSale;
import javax.swing.JTextField;

/**
 *
 * @author Compac
 */
public class UICashPaymentController {
    
    /*
     * Public Methods
     */
    public UICashPaymentController(DataSale saleToCash){
        this.saleToCash =saleToCash;
    }
    
    public void setTextAmountToPayField(JTextField amountToPayField){
        String fieldText;
        Double totalCashToPay;
        
        totalCashToPay = saleToCash.getTotal();
        fieldText = doubleToString(totalCashToPay);
        
        amountToPayField.setText(fieldText);
    }
    
    public Double getPaidPesos(JTextField paidPesosAmountField){
        Double paidPesos;
        String paidPesosString;
        
        paidPesosString =paidPesosAmountField.getText();
        paidPesos = stringToDouble(paidPesosString);
        
        return paidPesos;
    }
    
    public void cashingSale(Double paidAmount){
        
        if(isEnoughCash(paidAmount)){
           saleController.addSale(saleToCash);
        }else{
            
        }
        
    }
    
    /*
     * Private Methods
     */
    private boolean isEnoughCash(Double paidCash){
        Double cashToPay = saleToCash.getTotal();
        boolean isEnoughCash = ( paidCash < cashToPay );
        
        return isEnoughCash;
    }
    
    private String doubleToString(Double doubleToParse){
        return String.valueOf(doubleToParse);
    }
    
    private Double stringToDouble(String stringToParse){
        return Double.parseDouble(stringToParse);
    }
    private DataSale saleToCash; 
    private SaleController saleController;
}
