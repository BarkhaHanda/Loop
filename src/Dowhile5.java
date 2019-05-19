import java.util.Scanner;

public class Dowhile5 {
	
	public static void main(String args[])
	{
	int num1; int num2; int sum=0;int avg=0;
	Scanner val=new Scanner(System.in);
	System.out.println("Enter first value:");
	num1=val.nextInt();
	
	System.out.println("Enter Second value:");
	num2=val.nextInt();
	
	sum=num1+num2;
	System.out.println("Sum is:" +sum);
	
	avg=sum/2;
	System.out.println("Average is:" +avg);
}	
}
