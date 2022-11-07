import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class App {
    static ArrayList<Integer> p1Position = new ArrayList<Integer>();
    static ArrayList<Integer> p2Position = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {
        
        
        String array[][] = {
                { " ", "|", " ", "|", " "},
                { "-", "+", "-", "+", "-" },
                { " ", "|", " ", "|", " " },
                { "-", "+", "-", "+", "-" },
                { " ", "|", " ", "|", " " },
        };

        printgGameboard(array);

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("\nPlayer 1 Input where you want to put X: ");
            int x = sc.nextInt();
            while (p1Position.contains(x) || p2Position.contains(x)){
                System.out.println("Invalid Position");
                x = sc.nextInt();
            }
            printValueOnBoard(array, x, "P1");
            printgGameboard(array);

            String winCon = winChecker();
            if(winCon.length() > 0){
                System.out.println(winCon);
                break;
            }

            System.out.print("\nPlayer 2 Input where you want to put O: ");
            int y = sc.nextInt();
            while (p1Position.contains(y) || p2Position.contains(y)) {
                y = sc.nextInt();
            }
            printValueOnBoard(array, y, "P2");
            printgGameboard(array);

            winCon = winChecker();
            if (winCon.length() > 0) {
                System.out.println(winCon);
                printgGameboard(array);
                break;
            }
        }

    }

    public static void printgGameboard(String array[][]){
        
        for (String[] i:array) {
            System.out.println(" ");
            for (String j : i) {
                System.out.print(j);
            }
        }
        System.out.println(" ");
    }
    
    public static void printValueOnBoard(String array[][],int x,String Player) {
        String symbol = " ";

        if(Player.equals("P1")){
            symbol = "X";
            p1Position.add(x);
        } else if (Player.equals("P2")){
            symbol = "O";
            p2Position.add(x);
        }

        switch(x){
            case 1:
                array[0][0] = symbol;
                break;
            case 2:
                array[0][2] = symbol;
                break;
            case 3:
                array[0][4] = symbol;
                break;
            case 4:
                array[2][0] = symbol;
                break;
            case 5:
                array[2][2] = symbol;
                break;
            case 6:
                array[2][4] = symbol;
                break;
            case 7:
                array[4][0] = symbol;
                break;
            case 8:
                array[4][2] = symbol;
                break;
            case 9:
                array[4][4] = symbol;
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static String winChecker(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List diagTopToBot = Arrays.asList(1, 5, 9);
        List diagBotToTop = Arrays.asList(7, 5, 3);

        List<List>winCondition = new ArrayList<List>();
        winCondition.add(topRow);
        winCondition.add(midRow);
        winCondition.add(botRow);
        winCondition.add(leftCol);
        winCondition.add(midCol);
        winCondition.add(rightCol);
        winCondition.add(diagTopToBot);
        winCondition.add(diagBotToTop);
    
        for (List l:winCondition){  
            if(p1Position.containsAll(l)){
                return "Player 1 Wins";
            } else if(p2Position.containsAll(l)){
                return "Player 2 Wins";
            } else if (p1Position.size()+p2Position.size() == 9){
                return "Maximum Inputs Reached";
            }
               
        }
        
        return "";
    }
}
