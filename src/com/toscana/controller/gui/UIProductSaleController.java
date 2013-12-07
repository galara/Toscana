/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.gui;

import com.toscana.controller.product.ProductController;
import com.toscana.controller.sales.SaleController;
import com.toscana.model.products.Product;
import com.toscana.model.reports.sources.DataSale;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Compac
 */
public class UIProductSaleController {
    
    public void addProductToSale(String productName){
        /*
         * Adding the product to the Sale
         */
        Product productToAdd=null;
        productToAdd =productController.getProductByName(productName);
        saleController.addProductToCurrentSale(productToAdd,currentSale);   
    }
    
    public void increaseSalePrice(String productName){
        Product product=null;
        product =productController.getProductByName(productName);
        saleController.increaseSaleTotalAmount(product, currentSale);
    }
    
    public void createNewSale(){
        currentSale = saleController.getSale();
        currentSale.setTotal(INITAL_TOTAL_AMOUNT);
    }
    
    public void refreshDataSaleUIElements(JTable saleProductTable,JTextField totalCashToPayField){
        refreshTotalCashFieldText(totalCashToPayField);
        showAllSaleProductsInTable(saleProductTable);
    }
    
    private void refreshTotalCashFieldText(JTextField totalCashToPayField){
        String totalCashTextField;
        totalCashTextField = String.valueOf(currentSale.getTotal());
        totalCashToPayField.setText(totalCashTextField);
    }
    
    private void showAllSaleProductsInTable(JTable saleProductTable){
        ArrayList <Product> allProductInSale = currentSale.getProductsInSale();
    }
    
   
    
     private DataSale currentSale;
     private ProductController productController;
     private SaleController saleController;
     
     private static double INITAL_TOTAL_AMOUNT = 0.0;
}
