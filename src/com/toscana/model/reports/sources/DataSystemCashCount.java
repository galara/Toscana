package com.toscana.model.reports.sources;

import com.toscana.model.reports.types.SummaryPaymentsType;
import com.toscana.model.sessions.Session;
import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name = "cashout")
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
    
    public ArrayList<SummaryPaymentsType> getSummaryPayments() {
        return summaryPayments;
    }

    public void setSummaryPayments(ArrayList<SummaryPaymentsType> summaryPayments) {
        this.summaryPayments = summaryPayments;
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

    @OneToMany
    private ArrayList<SummaryPaymentsType> summaryPayments;
}
 
