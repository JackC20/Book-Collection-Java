/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jackcarroll.assignment3;

/**
 *
 * @author jackc20
 */
public class Author 
{
    
    private String firstname; 
    private String lastname;
    
   
    
   public Author(Author author)
   {
       this.firstname = author.firstname; 
       this.lastname = author.lastname; 
   }
    
   public Author(String firstname, String lastname)
  {
      
     this.firstname = firstname;
     this.lastname = lastname; 
      
      
  }
  
  public String getName()
  {
      
    
    return firstname+" "+lastname; 
    
  }
   
  public String getFirstName()
  {
         
       
      return firstname; 
  }

  
  public String getLastName()
  {
      
     return lastname; 
      
  }
  
  
  public void setName(String firstname, String lastname)
  {
    
      
     this.firstname = firstname; 
     this.lastname = lastname;  
  
  }
  

}
