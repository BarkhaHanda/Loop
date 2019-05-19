public class Palindromenew {
	
	public static void main(String args[]) {		
		int num=121; int reverse=0; int rem=0;int original = num;
		
		while(num != 0) {
				rem=num%10;
				reverse=reverse*10+ rem;
				num/=10;				
			}			
			if(original==reverse) {
			
			System.out.println("Reverse number is: Palindrom");
			}
			else
			{
				System.out.println("Reverse number is not palindrom");
			}
	}	
}