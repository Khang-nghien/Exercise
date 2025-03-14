/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theauthorandbookclassesyourturn;

/**
 *
 * @author Vu Minh Khang - CE191371 -
 */
public class TheAuthorAndBookClassesYourTurn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Test Author class
        Author author1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(author1);
        author1.setEmail("ahteck@somewhere.com");
        System.out.println(author1);
        System.out.println("name is : " + author1.getName());
        System.out.println("email is : " + author1.getEmail());
        // Test Book class
        Book book1 = new Book("12345", "Java for dummies", author1, 8.8, 88);
        System.out.println(book1);
        book1.setPrice(9.9);
        book1.setQty(99);
        System.out.println(book1);
        System.out.println("isbn is : " + book1.getName());
        System.out.println("name is : " + book1.getName());
        System.out.println("price is : " + book1.getPrice());
        System.out.println("qty is : " + book1.getQty());
        System.out.println("author is : " + book1.getAuthor()); // Author ’s→ toString()
        System.out.println("author ’s name: " + book1.getAuthorName());
        System.out.println("author’s name: " + book1.getAuthor().getName());
        System.out.println("author’s email: " + book1.getAuthor().getEmail());

    }

}
