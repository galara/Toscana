/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.payment;

import com.toscana.controller.sales.DataSaleController;
import com.toscana.helper.parsing.ToscanaParseUtility;
import com.toscana.model.reports.sources.DataSale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Compac
 */
public class CashPaymentViewController {
    
    /*
     * Public Methods
     */
    public CashPaymentViewController(DataSale saleToCash){
        this.saleToCash =saleToCash;
        dataSaleController = new DataSaleController();
    }

    public CashPaymentViewController() {
        dataSaleController = new DataSaleController();
        saleToCash = new DataSale();
    }
    
    public void setTextAmountToPayField(JTextField amountToPayField){
        String fieldText;
        Double totalCashToPay;
        
        totalCashToPay = saleToCash.getTotal();
        fieldText = ToscanaParseUtility.toString(totalCashToPay);
        
        amountToPayField.setText(fieldText);
    }
    
    public Double getPaidPesos(JTextField paidPesosAmountField){
        Double paidPesos;
        String paidPesosString;
        
        paidPesosString =paidPesosAmountField.getText();
        paidPesos = ToscanaParseUtility.stringToDouble(paidPesosString);
        
        return paidPesos;
    }
    
    public void cashingSale(Double paidAmount){
        
        if(isEnoughCash(paidAmount)){
           dataSaleController.addSale(saleToCash);
        }else{
            JOptionPane.showMessageDialog(null, WARNING_MESSAGE_NOT_ENOUGH_CASH, WARNING_TITLE, JOptionPane.WARNING_MESSAGE);
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
    
    private DataSale saleToCash; 
    private DataSaleController dataSaleController;
    private static final String WARNING_TITLE = "Advertancia";
    private static final String WARNING_MESSAGE_NOT_ENOUGH_CASH = "Falta dinero";
}
