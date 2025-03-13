/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecustomerandaccountclasses;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class Customer {
    
    private int id;
    private String name;
    private int discount;
    private char gender;

    public Customer(int id, String name, int discount, char gender) {
        this.id = id;
        this.name = name;
        this.discount = discount;
        this.gender = gender;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }
    
    
    
}
