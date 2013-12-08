package com.toscana.controller.sales;

import com.toscana.dao.managers.DataSaleDAOManager;
import com.toscana.model.dao.implementations.DataSaleDAOImplementation;
import com.toscana.model.dao.interfaces.DataSaleDAO;
import com.toscana.model.products.Product;
import com.toscana.model.reports.sources.DataSale;

public class SaleController {

    /*
     * Class methods
     */
    
    
    public SaleController(){
        this.sale = new DataSale();
        this.saleDAOManager = new DataSaleDAOManager();
    }

    
    
    public void addProductToCurrentSale(Product productToAdd){
        sale.addAProductToProductsInSale(productToAdd);
    }
    
    public void increaseSaleTotalAmount(Product product){
        double productPrice = product.getPrice();
        double oldSaleAmount, newSaleAmount;
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
     * Getters and Setters
     */
    public DataSale getSale() {
        return sale;
    }
    
    public DataSale getNewSale(){
        DataSale newSale = new DataSale();
        newSale.setTotal(INITAL_TOTAL_AMOUNT);
        
        return newSale;
    }

    public void setSale(DataSale sale) {
        this.sale = sale;
    }

     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private DataSale sale;
    private DataSaleDAOManager saleDAOManager;
    private static double INITAL_TOTAL_AMOUNT = 0.0;
}
