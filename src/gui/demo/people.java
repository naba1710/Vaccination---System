/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.demo;

/**
 *
 * @author Asus
 */
public class people extends PeopleReg  {
    String Fullname;
    String Age;
    String ID;
    String Phone;
    String State;
    String Email;
    String Address;


    
    public people(String data){
    String[] dataArr = data.split(",");
    this.Fullname = dataArr[0];
    this.Age = dataArr[1];
    this.ID = dataArr[2];
    this.Phone = dataArr[3];
    this.State = dataArr[4];
    this.Email = dataArr[5];
    this.Address = dataArr[6];
    }
    
     public people(){
    }
     

    
    public String getfullname() {
        return Fullname;
        
    }
    public void setfullname(String Fullname) {
         this.Fullname = Fullname;
        
    }
    
    public String getage() {
        return Age;
        
    }
    public void setage(String Age) {
         this.Age = Age;
        
    }
    public String getid() {
        return ID;
        
    }
    public void setid(String ID) {
         this.ID = ID;
        
    }
    public String getphone() {
        return Phone;
        
    }
    public void setphone(String Phone) {
         this.Phone = Phone;
        
    }
    public String getstate() {
        return State;
        
    }
    public void setstate(String State) {
         this.State = State;
        
    }
    public String getemail() {
        return Email;
        
    }
    public void setemail(String Email) {
         this.Email = Email;
        
    }
    public String getaddress() {
        return Address;
        
    }
    public void setaddress(String Address) {
         this.Address = Address;
        
    }
    
     @Override
    public String toString() {
        return (this.Fullname + "," + this.Age + "," + this.ID + "," + this.Phone + "," + this.State + "," + this.Email +  "," + this.Address);
    }
    
    
    
}
