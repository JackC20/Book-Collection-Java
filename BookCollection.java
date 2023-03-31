/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jackcarroll.assignment3;
import java.util.ArrayList; 

/**
 *
 * @author jackc20
 */

public class BookCollection 
{ 
    
     
    ArrayList<Book> books; 
    
 
    
    public BookCollection()
    {
       this.books = new ArrayList<>(); 
    }
    
    public BookCollection(BookCollection collection)
    {
      
        this.books = new ArrayList<>(); 
        for(var book : collection.books)
        {
            books.add(book);
        }
    }
    
    public BookCollection(Book...books)
    {
       this.books = new ArrayList<>(); 
       for (var book : books)
       {
           this.books.add(book); 
       }
        
    }
    
    public void AddBook(Book book)
    {
        
        
       this.books.add(book); 
        
        
    }
    
    public void PrintBooks()
    {
        
        System.out.println("\n\n*******Books in Collection*******");
        for( var book : this.books)
        {
            System.out.println(book.getInfo()+"\n");
           
        }
        System.out.println("*********************************");
        
        
    }
    
}
