package com.toscana.model.sessions;

import javax.persistence.*;

@Entity
@Table (name="users")
public class User {
    /*
     * Class Constructor
     */
    
    public User() {
        this.ID = 0;
        this.name = "";
        this.nickname = "";
        this.password="";
        this.privilegeAdmin = false;
    }

    public User(int ID, String name, String password, String nickname, boolean privilegeAdmin) {
        this.ID = ID;
        this.name = name;
        this.password=password;
        this.nickname = nickname;
        this.privilegeAdmin = privilegeAdmin;
    }
    
    public User(String name, String nickname, String password) {
        this.name = name;
        this.nickname = nickname;
        this.privilegeAdmin = privilegeAdmin;
    }
     /*
     * Class' Methods
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isPrivalegeAdmin() {
        return privilegeAdmin;
    }

    public void setPrivalegeAdmin(boolean privalageAdmin) {
        this.privilegeAdmin = privalageAdmin;
    }
    /*
     * Inner methods
     */
    
    /*
     * Attributes
     */
    @Id
    @Column (name="ID")
    @GeneratedValue
    private int ID;
    @Column (name="name")
    private String name;
    @Column (name="password")
    private String password;
    @Column (name="nickname")
    private String nickname;
    @Column (name="privilege")
    private boolean privilegeAdmin;
}
