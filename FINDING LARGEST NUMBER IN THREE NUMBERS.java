/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Accept three numbers from the user and print the largest one using if-else.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		
		System.out.println("Enter Number1: ");
		number1 = input.nextInt();
		System.out.println("Enter Number2: ");
		number2 = input.nextInt();
		System.out.println("Enter Number3: ");
		number3 = input.nextInt();
		input.nextLine();
		
		if((number1>number2&&number1>number3)){
		    System.out.println(number1+" is the largest number");
		}else if((number3>number2&&number3>number1)){
		    System.out.println(number3+" is the largest number");
		}else if((number2>number3&&number2>number1)){
		    System.out.println(number2+" is the largest number");
		}else{
		    System.out.println("Enter three Different Positive Numbers Correctly");
		}
		input.close();
	}
}
