import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner numInput = new Scanner(System.in);
        System.out.println("Quadratic Equation Calc ");
        System.out.println("\nInput the value of a: ");
        double a = numInput.nextDouble();
        System.out.println("\nInput the value of b: ");
        double b = numInput.nextDouble();
        
        SqrtCalc Quadop = new SqrtCalc();
        double roots[] = Quadop.QuadraticOp(a,b);

        for (int index = 0;index<roots.length;index++){
            System.out.println("\nThe squareroot of a is : " + roots[index]);
        }
    }  
}
