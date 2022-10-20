import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        int a, b, m, n, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");

        m = sc.nextInt();
        System.out.print("Enter the number of columns: ");

        n = sc.nextInt();

        String arrayInput[][] = new String[m][n];

        System.out.print("Enter the elements of the array: ");

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arrayInput[i][j] = sc.next();
            }
        }

        System.out.println("Elements of the array are: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arrayInput[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.print("\nInput row number: ");
        a = sc.nextInt();

        System.out.print("\nInput column number: ");
        b = sc.nextInt();

        System.out.println("\n" + arrayInput[a][b] + "\n");
    }
}
