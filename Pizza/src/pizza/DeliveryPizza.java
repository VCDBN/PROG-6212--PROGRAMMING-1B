package pizza;

public class DeliveryPizza extends Pizza {
    private double DeliveryFee;
    private String DeliveryAddress;
    
    public DeliveryPizza(String description, double price,String DeliveryAddress)
    {
        super(description,price);
        this.DeliveryAddress=DeliveryAddress;
        
        if(price>99)
        {
            this.DeliveryFee=20;
        }
        else
        {
             this.DeliveryFee=35;
        }
    }
    @Override
      public void display()           
   {
           System.out.println("Delivery Fee is R " + DeliveryFee);
           System.out.println("Delivery Address is: " + DeliveryAddress);
   }
    
}
