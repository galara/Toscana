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
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    @Id
    @Column (name = "id")
    @GeneratedValue
    private int ID;
    
    @OneToOne
    @JoinColumn(name = "id_session")
    @org.hibernate.annotations.ForeignKey(name="FK_SESSION_ID")   
    private Session session;
    
    @OneToOne
    @JoinColumn(name = "id_user")
    @org.hibernate.annotations.ForeignKey(name="FK_USER_ID") 
    private User authorizerAdmin;
    
    @Column (name = "totalcash")
    private double totalCash;
}