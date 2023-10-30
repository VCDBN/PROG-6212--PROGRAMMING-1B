
package productcatalog;

import org.junit.Test;
import static org.junit.Assert.*;


public class ProductCatalogTest {
    
    public ProductCatalogTest() {
    }
    
    @Test
    public void testDoesProductIdExist() {
        //Sample Data
        int[] productIds = {101, 102, 103, 104, 105};
        String[] productNames = {"ProductA", "ProductB", "ProductC", "ProductD", "ProductE"};
       
        ProductCatalog catalog = new ProductCatalog(productIds, productNames);
        
        //Similar to TestSearchStudent
        assertTrue(catalog.doesProductIdExist(103)); // Existing product ID
       
        
        //Similar to TestDeleteStudent_StudentNotFound
        assertFalse(catalog.doesProductIdExist(106)); // Non-existent product ID
    }
    
      @Test// Similar to StudentAgeInvalidCharacter
    public void testDoesProductIdExist2() {
        int[] productIds = {101, 102, 103, 104, 105};
        String[] productNames = {"ProductA", "ProductB", "ProductC", "ProductD", "ProductE"};
        ProductCatalog catalog = new ProductCatalog(productIds, productNames);

    assertFalse(catalog.doesProductIdExist2("ABC")); // Invalid input (not a number)
    }
}
