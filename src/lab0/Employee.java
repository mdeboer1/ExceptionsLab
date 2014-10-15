package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        if (daysVacation < 0){
            throw new IllegalArgumentException(
                "error: vacations days can't be negative");
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
       if (firstName == null || firstName.isEmpty()){
           throw new IllegalArgumentException(
            "error: you must provide a first name");
       }
       this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        if (hireDate == null){
            throw new IllegalArgumentException(
                "error: hireDate can't be null");
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()){
           throw new IllegalArgumentException(
            "error: you must provide a last name");
       }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public void setSsn(String ssn) {
        //Check for less than 9 characters
        if (ssn.length() < 9){
            throw new IllegalArgumentException(
                    "Error, not enough digits");
        }
        // Check to see if ssn length equals 10
        if (ssn.length() == 10){
            throw new IllegalArgumentException(
                "Error: the ssn can't contain 10 characters");
        }
        // Check for  more than 11 characters
        if (ssn.length() > 11){
            throw new IllegalArgumentException
                ("Error, too many digits");
        }
        // Check if length is equal to 11
        if (ssn.length() == 11){
            // Split the ssn on the - char
            String[] s = ssn.split("-");
            // Check to see if length of ssn is more than 9
            if (s.length > 9){
                throw new IllegalArgumentException(
                    "error: too many digits");
            }
            // Check to see if length of ssn is less than 9
            else if (s.length < 9){
                throw new IllegalArgumentException(
                    "error: not enough valid characters");
            }
            // Sort through array s and try to parse to int
            for (int i = 0; i <= s.length -1; i++){
                try{
                    int temp = Integer.parseInt(s[i]);
                }
                catch(NumberFormatException e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        this.ssn = ssn;
    }
    
    
    
}
