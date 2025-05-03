/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//Ask the user for an item, price, and quantity, then calculate and display the total bill using arithmetic operations.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String item;
	    double price;
	    int quantity;
	    double total;
	    
	    System.out.println("Choose Which Item(FRUITS,SNACKS,DRINKS,ELECTRONICS): ");
	    item = input.nextLine();
	    
	    if(item.equalsIgnoreCase("FRUITS")){
	        price = 5;
	    }else if(item.equalsIgnoreCase("SNACKS")){
	        price = 2;
	    }else if(item.equalsIgnoreCase("DRINKS")){
	        price = 3;
	    }
	    else{
	    price = 10;
	    }
	    
	    System.out.println("Enter quantity: ");
	    quantity = input.nextInt();
	    input.nextLine();
	    
	    total = price*quantity;
	    
	    System.out.println("You Have Bought "+quantity +item+"/s."+"Your total bill is "+total);
	    
	    input.close();
	}
}
