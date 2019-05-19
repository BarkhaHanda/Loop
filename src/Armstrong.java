
public class Armstrong {

	public static void main(String args[]) {
	
		int reminder; int temp = 0; int orig=370;
		int copynumb=orig;
		
		while(copynumb!=0)
		{
			reminder=copynumb%10;                          // take reminder of number
			temp=temp+(reminder*reminder*reminder);        //Add temp with cube of reminder and prev temp value
			copynumb=copynumb/10;                          // to get next value(part of while loop)
		}
		
		if(temp==orig) {
			
			System.out.println("Number is Armstrong");
			
		}
		else {
			
			System.out.println("Number is not Armstrong");
		}
		
	}
	
	}
