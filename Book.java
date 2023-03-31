/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jackcarroll.assignment3;

/**
 *
 * @author jackc20
 */
public class Book {
    
    private String title; 
    private Author author; 
    private int yearpublished; 
    private String YearPublished;
    
    
    public Book(String title, Author author, int yearpublished)
    {
        
        
 
        
        this.title = title; 
        this.author = new Author(author);  
        this.yearpublished = yearpublished; 
        
    }
    
    
    public String getInfo()
    { 
        YearPublished = String.valueOf(yearpublished);
        
        return "By "+title+"\n"+author.getName()+"\n"+YearPublished; 
    }
    
}
