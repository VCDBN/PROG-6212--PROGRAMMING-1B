
package inventory;

public class InventoryManagement {
    public static void main(String[] args) {
        // Create instances of different products
        Inventory book = new BookInventory(1, "Java Programming", 29.99, 50);
        Inventory electronic = new BookInventory(2, "Smartphone", 499.99, 10);

        // Display product information
        displayProductInfo(book);
        displayProductInfo(electronic);
        
     // Update product quantities
        book.setQuantity(45);
        electronic.setQuantity(8);

        // Display updated product information
        displayProductInfo(book);
        displayProductInfo(electronic);
    }
    
    // Helper method to display product information
    public static void displayProductInfo(Inventory inventory) {
        System.out.println("Product ID: " + inventory.getId());
        System.out.println("Product Name: " + inventory.getName());
        System.out.println("Product Price: R" + inventory.getPrice());
        System.out.println("Product Quantity: " + inventory.getQuantity());
        System.out.println("-----------------------------");
    }
}
