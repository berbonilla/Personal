import java.util.*;

public class ArrayChallenge {

    public static Scanner sc = new Scanner(System.in);
    public static int array[] = { 15, 30, 25, 19, 30, 40 }; // Array initialization

    public static void main(String[] args) {

        printOut();

        while (!checker()) {
            System.out.print("Element you want to delete: ");
            int inVal = sc.nextInt();       // Data input
                    
            findVal(inVal);
            printOut();
        }
        System.out.println("Array is Empty..");
    }

    static void printOut() {
        for (int x = 0; x < array.length; x++) {  //
            if (array[x] != 0) {                  // Loop for printing the
                System.out.print(array[x] + " "); // non-zero index values
            }                                     // in the array
        }                                         //
        System.out.println(" ");                //
    }

    // Array Value "Deductor" Method
    static void findVal(int inVal){
        for (int j = 0; j < array.length; j++) {   //
            if (inVal == array[j]) {               // Checks if the input value is in the array
                array[j] = 0;                      // If the input value is found in the array,
            }                                      // "array[j] = 0" converts the value inside the index to zer
        }                                          //
    }                                              //
    
    static boolean checker() {
        boolean mtCheck = false;
        for (int x = 0; x < array.length; x++) {    // 
            if (array[x] != 0) {                    // 
                mtCheck = false;                    // Checks if all all the values of the
            } else {                                // indexes in the array are zero  
                mtCheck = true;                     //
            }                                       //
        }                                           //
        return mtCheck;
    }
}
