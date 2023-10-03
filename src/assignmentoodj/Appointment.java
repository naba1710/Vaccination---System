/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentoodj;

/**
 *
 * @author INFOBRIDGE COMPANY
 */
public class Appointment {
    
    private String Fullname;
    private String Age;
    private int Id;
    private int Phone;
   private String State;
   private String Email;
   private String Address;
   
   
   
   //setters and getters

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    // methods
     public void register(){
        
    }
    public void modify(){
    }
    
    public void view(){
        
    }
    public void search(){
    }
    
    public void cancel(){
    }
}
