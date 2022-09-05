/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.model;

/**
 *
 * @author ricardo
 */
public class User {
    
    private String first_name;
    private String email;
    private String gender;
    private double income;

    public User() {
    }

    public User(String first_name, String email, String gender, double income) {
        this.first_name = first_name;
        this.email = email;
        this.gender = gender;
        this.income = income;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    
    
    
}
