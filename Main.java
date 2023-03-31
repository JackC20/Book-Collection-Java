/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jackcarroll.assignment3;

/**
 *
 * @author jackc20
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
       
        String firstname = "Jim";
        String lastname = "Ries";
        
        Author author = new Author(firstname,lastname);
        System.out.println(author.getName());
        firstname = "Larry";
        System.out.println(author.getName());
        Author a2 = new Author("Larry","Ries");
        System.out.println(a2.getName());
      
        
        Book book = new Book("Some famous title", author, 2022);
        System.out.println(book.getInfo());
        author.setName("Ferd", "Berkle");
        System.out.println(book.getInfo());
        
        
        
        Book bookMMM = new Book("The Mythical Man-Month", new Author("Fred", "Brooks"), 1995);
        Book bookCC = new Book("Code Complete", new Author("Steve", "McConnel"), 2004);
        Book bookDragon = new Book("Compilers", new Author("Alfred","Aho"), 1985);
        BookCollection collection = new BookCollection(bookMMM, bookCC, bookDragon);
        collection.PrintBooks();
        BookCollection collection2 = new BookCollection(collection);
        collection.AddBook(book);
        collection.PrintBooks();
        collection2.PrintBooks();
        BookCollection collection3 = new BookCollection();
        collection3.PrintBooks();
        
    }
    
}
