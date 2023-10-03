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
public class Users {
    String Firstname;
    String Sirname;
    String Email;
    int Phone;
    private String Nationality;
    private String Country;
    private String City;
    private int Age;
    int Id;
    private String Password;
    
       //constructor

    /**
     *
     * @param Firstname
     * @param Sirname
     * @param Email
     * @param Phone
     * @param Nationality
     * @param Country
     * @param City
     * @param Age
     * @param Id
     * @param Password
     */
    public Users( String Firstname,String Sirname, String Email,int Phone, 
            String Nationality, String Country, String City, int Age, int Id, String Password){
  
        this.Firstname = Firstname;
        this.Sirname = Sirname;
        this.Email = Email;
        this.Phone = Phone;
        this.Nationality = Nationality;
        this.Country = Country;
        this.City = City;
        this.Age = Age;
        this.Id = Id;
        this.Password = Password;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSirname() {
        return Sirname;
    }

    public void setSirname(String Sirname) {
        this.Sirname = Sirname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   
    
    //methods
    public void login(){
}
    
    }
