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
public class Account {
    
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account() {
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString() + "balance = " + String.format("$3.2%f", balance);
    }
    
    public String getCustomerName() {
        return customer.getName();
    }
    
    public Account deposit(double amount) {
        this.balance = this.balance + amount;
        return this;
    }
    
    public Account withraw(double amount) {
        if (balance >= amount) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
