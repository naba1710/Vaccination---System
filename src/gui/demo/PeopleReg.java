/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Asus
 */
public class PeopleReg{
    String Firstname;
    String Surname;
    String EmailAddress;
    String Phonenumber;
    String Nationality;
    String Country;
    String City;
    String Age;
    String ID;
    String Password;
    
    public PeopleReg(String data){
        System.out.println( data );
    String[] dataArr = data.split(",");
    this.Firstname = dataArr[0];
    this.Surname = dataArr[1];
    this.EmailAddress = dataArr[2];
    this.Phonenumber = dataArr[3];
    this.Nationality = dataArr[4];
    this.Country = dataArr[5];
    this.City = dataArr[6];
    this.Age = dataArr[7];
    this.ID = dataArr[8];
    this.Password = dataArr[9];
    }
    
    public PeopleReg(){
    }
    
    public String getfirstname() {
        return Firstname;
        
    }
    public void setfirstname(String Firstname) {
         this.Firstname = Firstname;
        
    }
    public String getsurname() {
        return Surname;
        
    }
    public void setsurname(String Surname) {
         this.Surname = Surname;
        
    }
    public String getemail() {
        return EmailAddress;
        
    }
    public void setemail(String EmailAddress) {
         this.EmailAddress = EmailAddress;
        
    }
    public String getphone() {
        return Phonenumber;
        
    }
    public void setphone(String Phonenumber) {
         this.Phonenumber = Phonenumber;
        
    }
    public String getnation() {
        return Nationality;
        
    }
    public void setnation(String Nationality) {
         this.Nationality = Nationality;
        
    }
    public String getcountry() {
        return Country;
        
    }
    public void setcountry(String Country) {
         this.Country = Country;
        
    }
    public String getcity() {
        return City;
        
    }
    public void setcity(String City) {
         this.City = City;
        
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
    public String getpass() {
        return Password;
        
    }
    public void setpass(String Password) {
         this.Password = Password;
        
    }
    
    public ArrayList<String[]> modify_details(String view, String mode) {
        ArrayList<String[]> arrayList = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("User.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] ary = line.split(",");
                if (ary.length < 1) {
                    break;
                } else {
                    arrayList.add(ary);
                }
            }

            if (mode.equals("modify")) {
                for (String[] element : arrayList) {
                    if (view.equals(element[9])) {
                        element[1] = this.Firstname;
                        element[2] = this.Surname;
                        element[3] = this.EmailAddress;
                        element[4] = this.Phonenumber;
                        element[5] = this.Nationality;
                        element[6] = this.Country;
                        element[7] = this.City;
                        element[8] = this.Age;
                        element[9] = this.ID;
                        element[10] = this.Password;
                    }
                }
            } else {
                
                for (Iterator<String[]> iterator = arrayList.iterator(); iterator.hasNext();) {
                    String[] value = iterator.next();
                    if (view.equals(value[9])) {
                        iterator.remove();
                    }
                }
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter("User.txt"));
            PrintWriter pw = new PrintWriter(bw);
            for (String[] element : arrayList) {
                pw.println(element[1] + "," + element[2] + "," + element[3] + "," + element[4] + ","
                        + element[5] + "," + element[6] + "," + element[7] + ","
                        + element[8] + ","
                        + element[9] + ","
                        + element[10]);
            }

            pw.flush();
            pw.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

     @Override
    public String toString() {
        return (this.Firstname + "," + this.Surname + "," + this.EmailAddress + "," + this.Phonenumber + "," + this.Nationality +  "," + this.Country + "," + this.City + "," + this.Age+ "," + this.ID + "," + this.Password);
    }

    
    
}
