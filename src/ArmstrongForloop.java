
public class ArmstrongForloop {

		public static void main(String args[]) {
		
			int reminder; int temp = 0; int orig=370;
						
			for(int c=orig; c!=0; c=c/10)
			{
				reminder= c%10;                          		// take reminder of number
				temp=temp+(reminder*reminder*reminder);        //Add temporary value with cube of reminder and prev temp value     
			}
			
			if(temp==orig) {
				
				System.out.println("Number is Armstrong");
				
			}
			else {
				
				System.out.println("Number is not Armstrong");
			}
			
		}
		
		}