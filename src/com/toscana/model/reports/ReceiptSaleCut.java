package com.toscana.model.reports;

import com.toscana.model.sessions.Session;
import com.toscana.model.sessions.User;
import com.toscana.model.reports.templates.ReceiptTemplate;
import javax.persistence.*;

@Entity
@Table (name = "salecuts")
public class ReceiptSaleCut {

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

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public User getAuthorizerAdmin() {
        return authorizerAdmin;
    }

    public void setAuthorizerAdmin(User authorizerAdmin) {
        this.authorizerAdmin = authorizerAdmin;
    }

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public ReceiptTemplate getReceiptTempleate() {
        return receiptTempleate;
    }

    public void setReceiptTempleate(ReceiptTemplate receiptTempleate) {
        this.receiptTempleate = receiptTempleate;
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
    
    @Column (name = "session")
    @OneToOne
    private Session session;
    
    @Column(name = "authorizeruser")
    @OneToOne
    private User authorizerAdmin;
    
    @Column (name = "totalcash")
    private double totalCash;
    private ReceiptTemplate receiptTempleate;
}
