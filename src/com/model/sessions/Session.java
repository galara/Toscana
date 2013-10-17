package com.model.sessions;

import java.util.Date;

public class Session {
    
    /*
     * Class Methods
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

    public Date getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(Date initialTime) {
        this.initialTime = initialTime;
    }

    public Date getFinalTime() {
        return finalTime;
    }

    public void setFinalTime(Date finalTime) {
        this.finalTime = finalTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isIsOver() {
        return isOver;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
    }
    
    /*
     * Inner Methods
     */
    
     /*
     * Attributes 
     */
    private int ID;
    private Date initialTime;
    private Date finalTime;
    private User user;
    private boolean isOver;
}
