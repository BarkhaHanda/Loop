//Print multiplication table of 24, 50 and 29 using loop.

public class Dowhile3 {

	public static void main(String args[]) {
		int i=1;int j=1; int k=1;int num=24;int num2=50;int num3=29;
		do {
			System.out.println(num*i);
			i++;
		}while(i<=10);
		
		System.out.println("\n");
		do {
			
			System.out.println(num2*j);
			j++;
		}while(j<=10);

		
		System.out.println("\n");
		do {
			System.out.println(num3*k);
			k++;
		}while(k<=10);
	}
}
