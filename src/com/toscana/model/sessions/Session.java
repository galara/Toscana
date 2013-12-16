
package com.toscana.model.sessions;

import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table (name = "sessions")
public class Session {
    
    /*
     * Class Constructors
     */
    public Session() {
      this.ID = DEFAULT_ID;
        this.initialTime = DEFAULT_INITIAL_TIME;
        this.finalTime = DEFAULT_FINAL_TIME;
        this.user = DEFAULT_USER;
        this.isOver = DEFAULT_IS_OVER_STATE;
    }

    public Session(int ID, Date initialTime, Date finalTime, User user, boolean isOver) {
        this.ID = ID;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.user = user;
        this.isOver = isOver;
    }

    
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
    @Id
    @Column (name = "ID")
    @GeneratedValue
    private int ID;
    
    @Column (name = "initialtime")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date initialTime;
    
    @Column (name = "finaltime")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date finalTime;
    
    @ManyToOne
    @JoinColumn (name = "user")
    private User user;
    
    @Column (name = "isover")
    private boolean isOver;
    
    private final static int DEFAULT_ID=0;
    private final static Time DEFAULT_INITIAL_TIME=null;
    private final static Time DEFAULT_FINAL_TIME=null;
    private final static User DEFAULT_USER=null;
    private final static boolean DEFAULT_IS_OVER_STATE=false;
}
