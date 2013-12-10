/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toscana.controller.payment;

import com.toscana.controller.product.ProductViewController;
import com.toscana.controller.sales.DataSaleController;
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

    public ProductSaleViewController() {
        //productController = new ProductController();
        productViewController = new ProductViewController();
        dataSaleController = new DataSaleController();
    }
    
    public void addProductToSale(String productName){
        /*
         * Adding the product to the Sale
         */
        Product productToAdd=null;
        productToAdd = productViewController.getProductController().getProductByName(productName);
        dataSaleController.addProductToCurrentSale(productToAdd);   
    }
    
    public void increaseSaleTotalAmount(String productName){
        Product product=null;
        product = productViewController.getProductController().getProductByName(productName);
        dataSaleController.increaseSaleTotalAmount(product);
    }
    
    public void refreshDataSaleUIElements(JTable saleProductTable,JTextField totalCashToPayField){
        refreshTotalCashFieldText(totalCashToPayField);
        showAllSaleProductsInTable(saleProductTable);
    }
    
    public void showCashPaymentUI(){
        UICashPayment cashPaymentUI;
        cashPaymentUI = new UICashPayment(dataSaleController.getSale());
        cashPaymentUI.setVisible(true);
    }
    
    /*
     * Private Methods
     */
 
    private void refreshTotalCashFieldText(JTextField totalCashToPayField){
        String totalCashTextField;
        totalCashTextField = String.valueOf(dataSaleController.getSale().getTotal());
        totalCashToPayField.setText(totalCashTextField);
    }
    
    private void showAllSaleProductsInTable(JTable saleProductTable){
        ArrayList <Product> allProductsInSale = dataSaleController.getSale().getProductsInSale();
        productViewController.showAllProductsInTable(saleProductTable, allProductsInSale); 
    }
       
     DataSaleController dataSaleController;
     //private ProductController productController;
     private ProductViewController productViewController;
     

}
