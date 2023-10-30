
package addition;


public class Addition {

 
    public static void main(String[] args) {
       int number1 = 5;
        int number2 = 7;
        
        int sum = add(number1, number2);
        
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
    
     public static int add(int num1, int num2) {//Addition of numbers
        return num1 + num2;
    }
     
 public static int findMax(int arr[]){  //Find maximum number for an array
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    } 
}
