
public class OuterLoop {

	public static void main(String args[]) {
		int flag=1;
		for(int i=0; i<=5; i++)
		{
			for(int j=1; j<i;j++) 
			{
				System.out.print(flag);
				flag++;
				
			}
			
			System.out.println();
			
		}
	}
	
	
}
