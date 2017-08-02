/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complaint_hod;

import java.util.logging.Logger;

/**
 *
 * @author aa
 */
public class student {
    String name;
    String dept;
    String email;
    String password;
    int roll_no;

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
    int year;
   int  sem;

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getYear() {
        return year;
    }

    public int getSem() {
        return sem;
    }
    
    
    
}
