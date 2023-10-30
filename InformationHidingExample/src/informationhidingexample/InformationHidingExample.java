
package informationhidingexample;


public class InformationHidingExample {
//Four types of Access Modifiers
private int privateVariable; // Accessible only within this class
int defaultVariable;        // Accessible within the same package
protected int protectedField; // Accessible within the same package and subclasses
public int publicField;   // Accessible from anywhere
    
//Use these access modifiers to control which parts of your class can be accessed by external code.


//So how can we allow controlled access to private fields??
//We use the Getter and Setter Methods methods to allow controlled access to private fields
//By using these methods, you can enforce validation, logic, and maintain consistency in your class's state.

public class Myclass{         
     private int privateVariable;
    
    public int getPrivateField() {
        return privateVariable;
    }
    
    public void setPrivateField(int newValue) {
        // You can add validation or logic here
        privateVariable = newValue;
    }
    
}
//An advanced form of information hiding is creating immutable classes.
// Immutable classes have all their fields set at object creation and do not allow modification after that. 
//This can provide better security and thread-safety.
public final class ImmutableClass{
    private final int value;
    
    public ImmutableClass(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
//Because the fields are final, they can't be changed after object creation, 
//ensuring that the class's state remains consistent.
//Applying information hiding helps in maintaining the integrity of your class's internal state



}




