package com.toscana.model.products;

import javax.persistence.*;

@Entity
@Table (name="products")
public class Product {
    /*
     * Class methods
     */
    /*
     * Getters and Setters
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    @Id
    @Column (name="ID")
    @GeneratedValue
    private int ID;
    @Column (name="name")
    private String name;
    @Column (name="price")
    private double price;
    @Column (name="description")
    private String description;
    @Column (name="discount")
    private double discount;
}
