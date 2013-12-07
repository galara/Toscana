package com.toscana.controller.sales;

import com.toscana.model.products.Product;
import com.toscana.model.reports.sources.DataSale;

public class SaleController {

    /*
     * Class methods
     */
    /*
     * Getters and Setters
     */
    public DataSale getSale() {
        return sale;
    }
    
    public DataSale getNewSale(){
        DataSale newSale = new DataSale();
        return newSale;
    }

    public void setSale(DataSale sale) {
        this.sale = sale;
    }
    
    public void addProductToCurrentSale(Product productToAdd,DataSale currentSale){
        currentSale.addAProductToProductsInSale(productToAdd);
    }
    
    public void increaseSaleTotalAmount(Product product,DataSale currentSale){
        double productPrice = product.getPrice();
        double oldSaleAmount, newSaleAmount;
        oldSaleAmount=currentSale.getTotal();
        newSaleAmount= oldSaleAmount + productPrice;
        currentSale.setTotal(newSaleAmount);
    }
    

     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private DataSale sale;
}
