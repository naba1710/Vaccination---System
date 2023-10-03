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
public class Appointment extends people {
    String ID;
    String Time;
    String Date;
    String Center;
    String Vaccine;
    
    public Appointment(String data){
    String[] dataArr = data.split(",");
    this.ID = dataArr[0];
    this.Time = dataArr[1];
    this.Date = dataArr[2];
    this.Center = dataArr[3];
    this.Vaccine = dataArr[4];

}
    
    public Appointment(){
    }
    
    public String getid() {
        return ID;
        
    }
    public void setid(String ID) {
         this.ID = ID;
    }
         
    public String gettime(){
        return Time;
        
    }
    public void settime(String Time) {
         this.Time = Time;
        
    }
    public String getdate(){
        return Date;
        
    }
    public void setdate(String Date) {
         this.Date = Date;
        
    }
    public String getcenter(){
        return Center;
        
    }
    public void setcenter(String Center) {
         this.Center = Center;
        
    }
    public String getvaccine(){
        return Vaccine;
        
    }
    public void setvaccine(String Vaccine) {
         this.Vaccine = Vaccine;
        
    }
    
    
    @Override
    public String toString() {
        return (this.ID + "," + this.Time + "," + this.Date + "," + this.Center + "," + this.Vaccine);
    }
        
    

}




