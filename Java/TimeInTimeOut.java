import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner valInput = new Scanner(System.in);

        System.out.println("\nAll time inputs must be the number of minutes past midnight '0000' ");

        System.out.println("\nInput the time when abby entered the library: ");
        int a = valInput.nextInt();
        System.out.println("\nInput the time when abby left the library: ");
        int b = valInput.nextInt();
        System.out.println("\nInput the time when cody entered the library: ");
        int c = valInput.nextInt();
        System.out.println("\nInput the time when cody left the library: ");
        int d = valInput.nextInt();

        if ((a > 1140 || a < 420) || (d > 1140 || d < 420)){
            System.out.println("\n You can't enter the library during this time");
        }

        else{

            if (b == c || c == b) {
                System.out.println("\nNO");
            }

            else if (a == c || b == d) {
                System.out.println("\nYES");
            }

            else if ((b < c || b > c) && (a!=d))  {
                System.out.println("\nYES ");
            }

            else {
                System.out.println("\nInvalid Input");
            }

        }
        
    }
}
