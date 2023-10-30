
package addition;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdditionTest {
    Addition my;
    
    public AdditionTest() {
    }
    
    @Test
    public void testAdd() {
            int a= 20, b= 20,c;
        c=my.add(a,b);
        assertEquals(40,c);//Play around with the values
    }

 @Test  
    public void testFindMax(){  
        assertEquals(4,Addition.findMax(new int[]{1,3,4,2}));  
         
    } 

    /**
     * Test of main method, of class Addition.
     */
    @Test
    public void testMain() {
    }
    
}
