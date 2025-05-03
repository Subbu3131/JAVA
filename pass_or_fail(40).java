/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Accept three subject marks and print whether the student passed (average ≥ 40) or failed.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int Subject1;
		int Subject2;
		int Subject3;
		double AVERAGE;
		
		System.out.println("Enter Subject1 Marks: ");
		Subject1 = input.nextInt();
		System.out.println("Enter Subject2 Marks: ");
		Subject2 = input.nextInt();
		System.out.println("Enter Subject3 Marks: ");
		Subject3 = input.nextInt();
		input.nextLine();
		
		AVERAGE = (Subject1+Subject2+Subject3)/3;
		
		if(AVERAGE>=40){
		    System.out.println("Congrats!! You've Passed");
		}else{
		    System.out.println("Better Luck Next Time!! You're Gonna Comeback Champ");
		}
		
	}
}
