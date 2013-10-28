package com.toscana.model.sales;

import com.toscana.model.products.Product;
import com.toscana.model.reports.types.PaymentType;
import java.util.ArrayList;
import java.util.Date;
import com.toscana.model.sessions.Session;
import javax.persistence.*;

@Entity
@Table (name = "sales")
public class DataSale {
    
     /*
     * Class' methods
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

    public ArrayList getProductsInSale() {
        return productsInSale;
    }

    public void setProductsInSale(ArrayList<Product> productsInSale) {
        this.productsInSale = productsInSale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public ArrayList<PaymentType> getPaymentTypes() {
        return paymentTypes;
    }

    public void setPaymentTypes(ArrayList<PaymentType> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    public double getTotal() {
        return totalAmount;
    }

    public void setTotal(double total) {
        this.totalAmount = total;
    }
    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    @Id
    @Column (name = "ID")
    @GeneratedValue
    private int ID;
    
    @Column (name = "product")
    @OneToMany
    private ArrayList<Product> productsInSale;
    
    @Column (name = "date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @Column (name = "session")
    @ManyToOne
    private Session session;
    
    @Column (name = "paymentypes")
    @OneToMany
    private ArrayList<PaymentType> paymentTypes;
    
    @Column (name = "totalamount")
    private double totalAmount;
}
