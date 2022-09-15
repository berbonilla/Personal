import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner opInput = new Scanner(System.in);
        System.out.println("\nPhoneYeta\n");
        System.out.println("-----------------------------------------------\n");
        System.out.println("1-Multiply 2 Digits || 2-Divide 2 Digits || 3-Crush Reveal || 4-Order a Meal");
        System.out.println("\nInput what you want to do: \n");
        int choiceOp = opInput.nextInt();
       
    if (choiceOp == 1){

        int product = multiply();
        System.out.println("\nThe Product is: " + product + "\n");
    }
    else if(choiceOp == 2){
        int quotient = divide();
        System.out.println("\nThe Quotient is: " + quotient + "\n");
    }
    
    else if(choiceOp == 3){
        String cName = crushName();
        System.out.println(cName) ;
    }

    else if(choiceOp == 4){
        myOrder();
    }

    else {
        System.out.println("\nInvalid input\n");
    }

    }

    static int multiply(){
        try (Scanner numInput = new Scanner(System.in)) {
            System.out.println("Input first number to multiply: ");
            int a = numInput.nextInt();
            System.out.println("Input second number to multiply: ");
            int b = numInput.nextInt();
            return a * b;
        }
    }

    static int divide(){
        try (Scanner numInput = new Scanner(System.in)) {
            System.out.println("Input first number to divide: ");
            int a = numInput.nextInt();
            System.out.println("Input second number to divide: ");
            int b = numInput.nextInt();

            return a / b;
        }
    }

    static String crushName(){
        try (Scanner nameInput = new Scanner(System.in)) {
            System.out.println("\nInput your name: ");
            String yourName = nameInput.nextLine();
            
            System.out.println("\nInput your first crush's name: ");
            String FrstcrushName = nameInput.nextLine();

            System.out.println("\nInput your second crush's name: ");
            String SndcrushName = nameInput.nextLine();

            return "\n" + yourName + "'s crushes are " + FrstcrushName + "and " + SndcrushName + "\n";
        }
    }
    static void myOrder(){
        Scanner orderInput = new Scanner(System.in);

            System.out.println("\nInput your first order: ");
            String frstOrder = orderInput.next();
            System.out.println("\nInput the price of your first order: ");
            Double frstorderprice = orderInput.nextDouble();

            System.out.println("\nInput your second order: ");
            String scndyourOrder = orderInput.next();
            System.out.println("\nInput the price of your second order: ");
            Double scndorderprice = orderInput.nextDouble();

            System.out.println("\nInput your third order: ");
            String thirdyourOrder = orderInput.next();
            System.out.println("\nInput the price of your third order: ");
            Double thrdorderprice = orderInput.nextDouble();
        
            Double totalAmount = frstorderprice + scndorderprice + thrdorderprice;

            System.out.println("\nYour orders are: " + frstOrder + ", " + scndyourOrder + " " + thirdyourOrder);
            System.out.println("\nThe Total amount of your order: " + totalAmount + "\n");
    }

}
