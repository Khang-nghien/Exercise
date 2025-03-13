/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecustomerandinvoiceclasses;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class Invoice {
    
    private int id;
    private Customer customer;
    private double amount;

    public Invoice() {
    }

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Invoice[" + "id = " + id + ", customer = " + customer.toString() + ", amount = " + amount + "]";
    }
    
    public String getCustomerName() {
        return customer.getName();
    }
    
    public int getCustomerDicount() {
        return customer.getDiscount();
    }
    
    public double getAmountAfterDiscount() {
        return this.amount * (100.0 - customer.getDiscount());
    }
}
