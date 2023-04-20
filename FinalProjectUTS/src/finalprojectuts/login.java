/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectuts;

/**
 *
 * @author Pak Pin
 */
public class login {
    
    private String user;
    private String pass;

    // Constructor
    public login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    //Getter dan Setter
    public String getUsername() {
        return user;
    }

    public void setUsername(String user) {
        this.user = user;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }
}
