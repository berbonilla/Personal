import java.util.*;

public class ArrayChallenge {
	// Instantiation
    static Scanner sc = new Scanner(System.in);
    static int checkVal = 0;
    // Array initialization
    static int array[] = { 15, 30, 25, 19, 30, 40 }; 

    public static void main(String[] args) {
        printOut();
        														//
        while (!checker()) {									// Using a while loop, this line of code
            System.out.print("Element you want to delete: ");	// removes the element's components.
            int inVal = sc.nextInt();           				// This code is input for data.
                    											//
            findVal(inVal);
            printOut();
        }														//
        System.out.println("Array is Empty..");					// If indeed the prerequisites were met.
    }															//

    // Array Value Printer Method
    static void printOut() {                      				
        for (int x = 0; x < array.length; x++) {  				//
            if (array[x] != 0) {                  				// These lines of code print the array's 
                System.out.print(array[x] + " "); 				// non-zero index values by 
            }                                     				// iterating through them.
        }                                         				//
        System.out.println(" ");                  
    }

    // Array Value "Deductor" Method
    static void findVal(int inVal){                				//
        for (int j = 0; j < array.length; j++) {   				// This sections of code determines whether the
            if (inVal == array[j]) {               				// input value is present in the array. 
                array[j] = 0;                      				// "array[j] = 0" transforms the value within
            }                                      				// the index to zero if the input value
        }                                          				// is found in the array.
    }                                              				//
                                                 
    // Array Value Checker Method
    static boolean checker() {              
   
		for (int j = 0; j < array.length; j++) {
			if (array[j] != 0) {
				continue;
			} else {
				noValueCounter++;
			}
		}
        if (noValueCounter == 6) {
            return true;
        }
        else {
            return false;
        }
	}
}
