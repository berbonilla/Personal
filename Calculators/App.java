import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner op = new Scanner(System.in);
    System.out.println("\nKalkulaterrr");
    System.out.println("\nInput Your Preffered Operation");
    System.out.println("\n1 for Add | 2 for Sub | 3 for Div | 4 for Mul: ");
    int mathOp = op.nextInt();
        
    Scanner num = new Scanner(System.in);
    System.out.println("\nInput 1st Number: ");
    float Frstnum = num.nextFloat();
    System.out.println("\nInput 2nd Number: ");
    float Scndnum = num.nextFloat();
    System.out.println("\nInput 3rd Number: ");
    float Thrdnum = num.nextFloat();


    if (mathOp == 1){
        Calc Add = new Calc(Frstnum, Scndnum, Thrdnum);
        Add.Addition();
    }

    else if (mathOp == 2){
        Calc Sub = new Calc(Frstnum, Scndnum, Thrdnum);
        Sub.Subtraction();
    }

    else if (mathOp == 3) {
        Calc Sub = new Calc(Frstnum, Scndnum, Thrdnum);
        Sub.Division();
    }
    else if (mathOp == 4) {

        Calc Sub = new Calc(Frstnum, Scndnum, Thrdnum);
        Sub.Multiplication();

    }
    else{
        System.out.println("\nInvalid Input");
    }

    }
}
