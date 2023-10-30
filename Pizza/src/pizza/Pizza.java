
package pizza;

public class Pizza 
{

 private String description;
 private double price;
 
 public Pizza(String description, double price) 
 {
     this.description= description;
     this.price= price;
 }
 
   public void display()           
   {
           System.out.println("Description" + description);
           System.out.println("Price: R" + price);
   }
}
