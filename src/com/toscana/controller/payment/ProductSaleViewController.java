/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.payment;

import com.toscana.controller.product.ProductController;
import com.toscana.controller.product.ProductViewController;
import com.toscana.controller.sales.SaleController;
import com.toscana.model.products.Product;
import com.toscana.view.sale.UICashPayment;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Compac
 */
public class ProductSaleViewController {
    
    public void addProductToSale(String productName){
        /*
         * Adding the product to the Sale
         */
        Product productToAdd=null;
        productToAdd =productController.getProductByName(productName);
        saleController.addProductToCurrentSale(productToAdd);   
    }
    
    public void increaseSalePrice(String productName){
        Product product=null;
        product =productController.getProductByName(productName);
        saleController.increaseSaleTotalAmount(product);
    }
    
    public void createNewSale(){
        saleController.getNewSale();
    }
    
    public void refreshDataSaleUIElements(JTable saleProductTable,JTextField totalCashToPayField){
        refreshTotalCashFieldText(totalCashToPayField);
        showAllSaleProductsInTable(saleProductTable);
    }
    
    public void cashCurrentSale(){
        UICashPayment cashPaymentUI;
        cashPaymentUI = new UICashPayment(saleController.getSale());
        cashPaymentUI.setVisible(true);
    }
    
    /*
     * Private Methods
     */
 
    private void refreshTotalCashFieldText(JTextField totalCashToPayField){
        String totalCashTextField;
        totalCashTextField = String.valueOf(saleController.getSale().getTotal());
        totalCashToPayField.setText(totalCashTextField);
    }
    
    private void showAllSaleProductsInTable(JTable saleProductTable){
        ArrayList <Product> allProductsInSale = saleController.getSale().getProductsInSale();
        productViewController.showAllProductsFromSaleInTable(saleProductTable, allProductsInSale); 
    }
       
     private SaleController saleController;
     private ProductController productController;
     private ProductViewController productViewController;
     

}
