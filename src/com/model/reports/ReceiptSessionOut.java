package com.model.reports;

import com.model.sessions.Session;

public class ReceiptSessionOut {

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

    public Session getCashSession() {
        return cashSession;
    }

    public void setCashSession(Session cashSession) {
        this.cashSession = cashSession;
    }

    
     /*
     * Inner methods
     */
    
     /*
     * Attributes
     */
    private int ID_sessionOut;
    private Session session;
    private Session cashSession;
}
