/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Asus
 */
public class vaccinestatus {
    private static final String FILEPATH = "C:/Users/Asus/OneDrive - Asia Pacific University/Desktop/Semester 3/OODJ/Assignment/AssignmentOODJ/User.txt";

    
    
    
    public PeopleReg view(String ID) throws IOException{
        PeopleReg peoplee = null;

        try{
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            
            BufferedReader buffeRedreader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = buffeRedreader.readLine()) != null);
            String[] detailspeople = readLine.split(",");
            if(ID.equals(detailspeople[9])){
                peoplee = new PeopleReg();
                peoplee.setfirstname(detailspeople[1]);
                peoplee.setsurname(detailspeople[2]);
                peoplee.setemail(detailspeople[3]);
                peoplee.setphone(detailspeople[4]);
                peoplee.setnation(detailspeople[5]);
                peoplee.setcountry(detailspeople[6]);
                peoplee.setcity(detailspeople[7]);
                peoplee.setage(detailspeople[8]);
                peoplee.setid(detailspeople[9]);
                peoplee.setpass(detailspeople[10]);
                

            }
            
        } catch(FileNotFoundException ex){
            Logger.getLogger(vaccinestatus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return peoplee;
        
        
    }
    
    
        
    
}
