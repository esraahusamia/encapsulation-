/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.Date;

/**
 *
 * @author EsraaHus93
 */
public class Person {

    public static int counter =0;
    private String firstName;
    private String lastName;
    private String address;
    private int dateOfBirth;
    private String nationality;
    private String city;
    private int weight;
    private String height;
    private boolean isMale;

    public Person() {
        counter++;
        firstName = "Sonia";
        lastName = "Kaboor";
        address = "Bollywood";
        dateOfBirth = 1980;
        nationality = "indian";
        city = " Mombi";
        weight = 50;
        height = "165 cm";
        isMale = false;
    }

    public Person( String firstName, String lastName, String address, int dateOfBirth, String nationality, String city, int weight, String height, boolean isMale) {
       counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.city = city;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public String getHeightInFeet() {
        return getHeight();
    }

    public int getAge() {
        Date date = new Date();
        return date.getYear() - getDateOfBirth();

    }

    public void eating() {
        System.out.print("I’m eating!");
        setWeight(getWeight() + 1);
    }

    public void printInfo() {
        System.out.println("" + counter + "" + getFirstName() + "" + getLastName() + "" + getAddress() + "" + getDateOfBirth() + "" + getNationality() + "" + getCity() + "" + getWeight() + "" + getHeight() + "" + isIsMale());
    }
    /**
     * @return the firstName
     */
     
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the dateOfBirth
     */
    public int getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the isMale
     */
    public boolean isIsMale() {
        return isMale;
    }

    /**
     * @param isMale the isMale to set
     */
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

}
