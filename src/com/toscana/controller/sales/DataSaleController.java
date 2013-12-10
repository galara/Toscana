package com.toscana.controller.sales;

import com.toscana.dao.managers.DataSaleDAOManager;
import com.toscana.model.products.Product;
import com.toscana.model.reports.sources.DataSale;

public class DataSaleController {

    /*
     * Constructors
     */
    public DataSaleController(){
        this.dataSale = new DataSale();
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
        return dataSale;
    }
    
    public void setSale(DataSale sale) {
        this.dataSale = sale;
    }
    
    /*
     * Others public methods
     */
    
    public void addProductToCurrentSale(Product productToAdd){
        dataSale.addAProductToProductsInSale(productToAdd);
    }
    
    public void increaseSaleTotalAmount(Product product){
        double productPrice = product.getPrice();
        double oldSaleAmount; 
        double newSaleAmount;
        
        oldSaleAmount=dataSale.getTotal();
        newSaleAmount= oldSaleAmount + productPrice;
        dataSale.setTotal(newSaleAmount);
    }
    
//    public void saveCurrentSale(){
//        try {
//            saleDAOManager.add(dataSale);
//        } catch (Exception e) {
//            
//        }
 //   }
    
     /*
     * Attributes
     */
    private DataSale dataSale;
    private DataSaleDAOManager saleDAOManager;
}
