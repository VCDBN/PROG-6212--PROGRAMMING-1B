
package inventory;
//Replace class with interface
interface Inventory {
    
int getId();            // Abstract method to get product ID
    String getName();       // Abstract method to get product name
    double getPrice();      // Abstract method to get product price
    int getQuantity();      // Abstract method to get product quantity
    void setQuantity(int quantity); // Abstract method to set product quantity


    
}
