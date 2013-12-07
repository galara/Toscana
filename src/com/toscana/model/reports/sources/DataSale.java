package com.toscana.model.reports.sources;

import com.toscana.model.products.Product;
import com.toscana.model.sessions.Session;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name = "sales")
public class DataSale {
     /*
     * Class' constructors
     */
    public DataSale(int ID, Date date, Session session, double totalAmount, ArrayList<Product> productsInSale) {
        this.ID = ID;
        this.date = date;
        this.session = session;
        this.totalAmount = totalAmount;
        this.productsInSale = productsInSale;
    }
  
    public DataSale() {
        this.ID = 0;
        this.date = null ;
        this.session = null;
        this.totalAmount = 0;
        this.productsInSale = null;
    }
    
     /*
     * Class' methods
     */
    
     /*
     * Getters and Setters
     */
    @Id
    @GeneratedValue()
    @Column (name = "ID",unique = true,nullable = false)
    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Column (name = "date", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    @ManyToOne(cascade = CascadeType.ALL)
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    @Column (name = "totalamount", nullable = false)
    public double getTotal() {
        return totalAmount;
    }

    public void setTotal(double total) {
        this.totalAmount = total;
    }
    

    public void addAProductToProductsInSale(Product productToAdd){
        this.productsInSale.add(productToAdd);
    }
    

    public ArrayList<Product> getProductsInSale(){
        return this.productsInSale;
    } 
    
    public void setProductsInSale(ArrayList<Product> productsInSale) {
        this.productsInSale = productsInSale;
    }
    
    

     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
   
    private int ID;
    private Date date;
    private Session session;
    private double totalAmount;
    private ArrayList<Product> productsInSale;
    
}
