package Arrays;

import java.util.Arrays; 

public class BinarySearchArr { 
    public static void main(String[] args) 
    { 
  
        // Get the Array 
        int intArr[] = { 10, 20, 15, 22, 35 }; 
  
        Arrays.sort(intArr); 
  
        for (int number : intArr) {
            System.out.println("Number = " + number);
         }
        
        int intKey = 22; 
  
        System.out.println(intKey 
                           + " found at index = "
                           + Arrays 
                                 .binarySearch(intArr, 2, 4, intKey)); 
        
        System.out.println(intKey 
                + " found at index = "
                + Arrays 
                      .binarySearch(intArr, 0, 5, intKey));
    } 
} 