//Take 2 integers from keyboard using loop and print their average value on the screen.

import java.util.Scanner;
public class Dowhile4 {

	public static void main(String args[]) {
		
		int num1;int sum=0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter value:");
			num1=input.nextInt();
			sum= sum + num1;
			
		}while(num1!=0);
		System.out.println("sum is:" +sum);
}
}