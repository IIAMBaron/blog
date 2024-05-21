package com.liambaron.blog;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Liam Baron
 */
@XmlRootElement
public class Account {
    private String username;
    private String password;
    private String about;
    private String role;

    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return username + " " + password + " " + about + " " + role;
    }

}
