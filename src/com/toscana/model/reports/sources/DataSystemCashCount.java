package com.toscana.model.reports.sources;

import com.toscana.model.sessions.Session;
import javax.persistence.*;

@Entity
@Table(name = "systemcashcount")
public class DataSystemCashCount {
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
     /*
     * Inner methods
     */
    /*
     * Attributes
     */

    @Id
    @Column(name ="id")
    @GeneratedValue
    private int ID;
    
    @OneToOne
    @JoinColumn (name = "id_session")
    @org.hibernate.annotations.ForeignKey(name="FK_SESSION_ID")
    private Session session;

}
 
