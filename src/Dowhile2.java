//Write a program in Java to print from 1 to 10 but quit if multiple of 7 is encountered

public class Dowhile2 {

public static void main(String args[]) {
	int i=1;
	do {
		System.out.println(i);
		if(i%7==0) {
			
		System.out.println("i is multiple of 7, Quit loop");
		break;
		}
	i++;
		
	}while(i<=7);
	
	
}
	
}
