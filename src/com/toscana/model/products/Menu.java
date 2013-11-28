package com.toscana.model.products;

import java.util.ArrayList;

public class Menu {
     /*
     * Class Constructor
     */
    public Menu() {
    }

    public Menu(ArrayList products) {
        this.products = products;
    }
    
    /*
     * Class methods
     */
    /*
     * Getters and Setters
     */
    public ArrayList getProducts() {
        return products;
    }

    public void setProducts(ArrayList products) {
        this.products = products;
    }

    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private ArrayList products;
}
