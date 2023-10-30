
package pizza;

public class DemoPizzas {
public static void main(String[] args) {
Pizza pizza1 = new Pizza("Triple Decker Pizza", 99.99);
              
DeliveryPizza deliveryPizza1 = new DeliveryPizza("Margherita", 89.99, "120 Monty Naicker Street");
DeliveryPizza deliveryPizza2 = new DeliveryPizza("Veggie Supreme", 129.50, "80 Blenheim Street");

System.out.println("Pizza 1:");
pizza1.display();
System.out.println();
        
System.out.println("Delivery Pizza 1:");
deliveryPizza1.display();
System.out.println();
        
System.out.println("Delivery Pizza 2:");
deliveryPizza2.display();
System.out.println();
    }
}
