
public class Fibonacci {
	
	public static void main(String args[]) {
		
		int sum=0;
		int num1=0;
		int num2= 1;
		int i = 1;
		
		while(i<=7) {
		
			System.out.println(num1);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			i++;
			}
		
}
	
}
