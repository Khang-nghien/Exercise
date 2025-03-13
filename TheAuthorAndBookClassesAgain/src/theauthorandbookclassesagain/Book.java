/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theauthorandbookclassesagain;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class Book {
    
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" + "name=" + name + ", authors={" + getAuthorData() + "}, price=" + price + ", qty=" + qty + "]";
    }
    
    private String getAuthorData() {
        String res = "";
        for (int i = 0; i < authors.length; i++) {
            Author author = authors[i];
            res += author.toString() + ",";
        }
        
        return res.substring(0, res.length() - 1);
    }
    
    public String getAuthorNames() {
        String res = "";
        for (int i = 0; i < authors.length; i++) {
            Author author = authors[i];
            res += author.getName() + ",";
        }
        
        return res.substring(0, res.length() - 1);
    }
    
}
