/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Create a number guessing game where the computer generates a number from 1–10 and the user guesses it.
import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Random input2 = new Random();
		
		int number1;
		int number2;
		
		number1 = input2.nextInt(11);
		
		System.out.println("Enter Your Number Between 1-10: ");
		number2 = input1.nextInt();
		input1.nextLine();
		
		if(number1 == number2){
		    System.out.println("Yayyyy!! You Got It My Boiiiii");
		}else{
		    System.out.println("Oops!! Better Luck Next Time");
		}
		
		System.out.println("I.ve Been Thinking About "+number1);
		
		input1.close();
		
		
	}
}
