import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class App {
    
    public static void main(String[] args) throws Exception {
        Double price = 0.00;
        boolean creditCard;
        String deliveryOrPickup;
        String pizzaOrder = "";
        Double priceOfSizeOfPizza = 0.00;
        Double priceOfPizzaCrust = 0.00;
        String pizzaSize ="";
        String pizzaCrust ="";
        Double crust = 0.00;
        Double size = 0.00;

        Scanner input = new Scanner(System.in);

        System.out.println("\n        Welcome to Angel's Pizza        ");
        System.out.println("\n-----------------MENU-------------------");
        System.out.println("\nA. Creamy Garlic Cheese Pizza | PHP 355 ");
        System.out.println("\nB. Halleluja Mozzarella Pizza | PHP 355 ");
        System.out.println("\nC. Angels Supreme Pizza       | PHP 355 ");
        System.out.println("\nD. Angels Pepperoni Pizza     | PHP 355 ");
        System.out.println("\nWhat do you want to order?");
        char orderInput = input.next().charAt(0);
        switch(orderInput){
            case 'A':
                pizzaOrder = " Creamy Garlic Cheese Pizza" ;
                price = 355.00;
            break;
            case 'B':
                pizzaOrder = " Halleluja Mozzarella Pizza" ;
                price = 355.00;
            break;
            case 'C':
                pizzaOrder = " Angels Supreme Pizza";
                price = 355.00;
            break;
            case 'D':
                pizzaOrder = " Angels Pepperoni Pizza" ;
                price = 355.00;
            break;
            default:
                System.out.println("\nThank you and Come Again!");
            return;
        }
        System.out.println("\nYou ordered " + pizzaOrder);
        System.out.println("\n             Pizza Size              ");
        System.out.println("---------------------------------------");
        System.out.println("\nA. Small        |  No Additional Fee ");
        System.out.println("\nB. Regular      |  Additional PHP 15 ");
        System.out.println("\nC. Family       |  Additional PHP 35 ");
        System.out.println("\nWhat size do you want for your pizza?");
        char sizeOfPizza = input.next().charAt(0);

        switch(sizeOfPizza){
            case 'A':
                priceOfSizeOfPizza = price;
                pizzaSize = " Small sized";
                size = 0.00;
            break;
            case 'B':
                priceOfSizeOfPizza = price + 15.00;
                pizzaSize = " Regular sized";
                size = 15.0;
            break;
            case 'C':
                priceOfSizeOfPizza = price + 45.00;
                pizzaSize = " Family sized";
                size = 45.0;
            break;
            default:
                System.out.println("\nInvalid Input!");
            return;
        }
        System.out.println("\n             Crust Type              ");
        System.out.println("\n-------------------------------------");
        System.out.println("\nA. Flatbread      | Additional PHP 5 ");
        System.out.println("\nB. Thin Crust     | Additional PHP 15");
        System.out.println("\nC. Thick Crust    | Additional PHP 10");
        System.out.println("\nWhat kind of crust do you want for you pizza?");
        char crustPizza = input.next().charAt(0);

        switch(crustPizza){
            case 'A':
                priceOfPizzaCrust = priceOfSizeOfPizza + 5.00;
                pizzaCrust = " Flatbread";
                crust = 5.00;
            break;
            case 'B':
                priceOfPizzaCrust = priceOfSizeOfPizza + 15.00;
                pizzaCrust = " Thin Crust";
                crust = 15.0;
            break;
            case 'C':
                priceOfPizzaCrust = priceOfSizeOfPizza + 10.00;
                pizzaCrust = " Thick Crust";
                crust = 10.0;
            break;
            default:
                System.out.println("\nInvalid Input!");
            return;

        }
        System.out.println("\nHow many " + pizzaOrder + " would you want to order? ");
        double numOfPizza = input.nextDouble();
        
        double pizzaMult = numOfPizza * priceOfPizzaCrust;
        int pizzaNum = (int)(numOfPizza);
                System.out.println("\nYou ordered " + numOfPizza + pizzaCrust + pizzaSize + pizzaOrder +".\n");
                System.out.println("\n----------------------------Price Tally----------------------------\n");
                System.out.println(pizzaNum +" x"+ pizzaSize + pizzaOrder + " = PHP " + numOfPizza*priceOfSizeOfPizza +"\n");
                System.out.println("Addons: \n"  +"\n"+ pizzaCrust +" = PHP " + numOfPizza*crust + "\n " );
                System.out.println("\nThe total amount of your order is PHP " + pizzaMult + "\n");
    }
}
