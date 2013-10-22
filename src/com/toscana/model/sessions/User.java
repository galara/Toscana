package com.toscana.model.sessions;

public class User {
    
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

    public boolean isPrivalageAdmin() {
        return privalageAdmin;
    }

    public void setPrivalageAdmin(boolean privalageAdmin) {
        this.privalageAdmin = privalageAdmin;
    }
    /*
     * Inner methods
     */
    
    /*
     * Attributes
     */
    private int ID;
    private String name;
    private String password;
    private String nickname;
    private boolean privalageAdmin;
}
