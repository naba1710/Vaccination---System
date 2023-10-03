/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

/**
 *
 * @author Asus
 */
public class Login {
     public boolean verify( String usr, String pwd ) {
        return usr.equals("Admin") && pwd.equals("pwd");
    }
    
}
