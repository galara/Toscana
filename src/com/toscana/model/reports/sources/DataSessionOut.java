package com.toscana.model.reports.sources;

import com.toscana.model.sessions.Session;
import javax.persistence.*;

@Entity
@Table (name = "sessionsout")
public class DataSessionOut {
    /*
     * Class methods
     */
    /*
     * Getters and Setters
     */
    public int getID_sessionOut() {
        return ID_sessionOut;
    }

    public void setID_sessionOut(int ID_sessionOut) {
        this.ID_sessionOut = ID_sessionOut;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public double getCashSession() {
        return cashSession;
    }

    public void setCashSession(double cashSession) {
        this.cashSession = cashSession;
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
    private int ID_sessionOut;
    
    @OneToOne
    @JoinColumn(name = "id_session")
    @org.hibernate.annotations.ForeignKey(name="FK_SESSION_ID") 
    private Session session;
    
    @Column (name = "cashsession")
    private double cashSession;
}
