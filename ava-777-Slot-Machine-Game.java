import java.util.Scanner;
import java.util.Random;
public class Main {
    static Scanner input = new Scanner(System.in);
    static Random generate = new Random();
    public static void main(String[] args){
        System.out.println("Welcome to 777 Slots !!");
        int balance = 100;
        int bet ;
        String play ;
        do {
            System.out.println("Your Current Balance Is :"+balance);
            do{
                System.out.print("Enter Bet Amount : ");
                bet = input.nextInt();
                input.nextLine();
                if (bet<=0){
                    System.out.println("Bet Amount Must Be Greater Than 0");
                }
            }while (bet<=0);
            balance -= bet ;
            int payout = displaySymbols(bet);
            balance += payout;
            System.out.print("Do You Want To Play Again (yes/no): ");
            play = input.nextLine();

        }while (play.toLowerCase().equals("yes") && balance > 0);
        if (balance<=0){
            System.out.println("Insufficient Balance");
        }
        input.close();
    }
    static int displaySymbols(int bet){
        String[] symbols = { "🍇" , "🍋" , "‍🍎" , "🍉" , "🍌" };
        String[] row = new String[3];
        for (int i =0;i< row.length;i++){
            row[i] = symbols[generate.nextInt(5)];
        }
        System.out.println("Spinning......");


        System.out.println(row[0]+" | "+row[1]+" | "+row[2]);
        int payout;
        if (row[0].equals(row[1]) && row[0].equals(row[2])){
            payout = 20 * bet;
        } else if ( row[0].equals(row[1]) || row[2].equals(row[1]) || row[0].equals(row[2])){
            payout = 4 * bet;
        }else{
            payout = 0;
        }
        System.out.println("Congrats Your Payout is : "+payout);
        return payout;
    }
}
