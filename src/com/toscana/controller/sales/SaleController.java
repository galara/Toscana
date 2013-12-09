package com.toscana.controller.sales;

import com.toscana.dao.managers.DataSaleDAOManager;
import com.toscana.model.products.Product;
import com.toscana.model.reports.sources.DataSale;

public class SaleController {

    /*
     * Constructors
     */
    public SaleController(){
        this.sale = new DataSale();
        this.saleDAOManager = new DataSaleDAOManager();
    }

    /*
     * Bloque Altas, Bajos y Cambios
     */
    public void addSale(DataSale saleToAdd) {
        this.saleDAOManager.add(saleToAdd);
    }

    public void updateSale(DataSale saleToUpdate) {
        this.saleDAOManager.update(saleToUpdate);
    }

    public void deleteSale(DataSale saleToDelete) {
        this.saleDAOManager.delete(saleToDelete);
    }

    /*
     * Getters and Setters
     */
    public DataSale getSale() {
        return sale;
    }
    
    public void setSale(DataSale sale) {
        this.sale = sale;
    }
    
    public DataSale getNewSale(){
        DataSale newSale = new DataSale();
        newSale.setTotal(INITAL_TOTAL_AMOUNT);
        
        return newSale;
    }
    /*
     * Others public methods
     */
    
    public void addProductToCurrentSale(Product productToAdd){
        sale.addAProductToProductsInSale(productToAdd);
    }
    
    public void increaseSaleTotalAmount(Product product){
        double productPrice = product.getPrice();
        double oldSaleAmount; 
        double newSaleAmount;
        
        oldSaleAmount=sale.getTotal();
        newSaleAmount= oldSaleAmount + productPrice;
        sale.setTotal(newSaleAmount);
    }
    
    public void saveCurrentSale(){
        try {
            saleDAOManager.add(sale);
        } catch (Exception e) {
        }
    }
     /*
     * Attributes
     */
    private DataSale sale;
    private DataSaleDAOManager saleDAOManager;
    private static double INITAL_TOTAL_AMOUNT = 0.0;
}
