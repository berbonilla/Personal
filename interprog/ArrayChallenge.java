import java.util.*;
public class ArrayChallenge {

    public static Scanner sc = new Scanner(System.in);
    public static int array[] = {15,30,25,19,30,40};                  // Array initialization
    public static int length = array.length;
    public static int check,sum = 0,i = 0;

    public static void checker() {
        for ( i = 0;i <= length-2;i++) {    
            System.out.print("Element you want to delete: "); 

            int num = sc.nextInt();                         // Data input

                for (int j = 0; j < array.length;j++) {     //
                    if ( num == array[j]) {                 // Checks if the input value is in the array
                        array[j] = 0;                       // If the input value is found in the array, 
                    }                                       // "array[j] = 0" converts the value inside the index to zer

                }                                           

            for (int x = 0; x < array.length;x++) {         // 
                if (array[x] != 0) {                        // Loop for printing the 
                    System.out.print(array[x] + " ");       // non-zero index values 
                }                                           // in the array
            }                                               //
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(array));         // Displays initial array

                                                            // Loop for the Array "Deductor" Method
        checker();                                        // Array Value "Deductor" Method
                                                            //

        for (int y = 0; y < length;y++) {                    // Loop for adding all the
            sum += array[y];                                // value in indexes 
        }                                                    // of the array

        if (sum != 0) {                                        //                 
            checker();                                        //    If sum is not equal to 0 loop back to checker        
        }                                                    //

        else {                                                // 
            System.out.println("Array is empty.. ");        // Else end program
        }                                                    //
    }
}
