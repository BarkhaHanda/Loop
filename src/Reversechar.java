
public class Reversechar {

	public static void main(String args[]) {
		
		String myname="Hello";
		String rev="";
				
	for(int i=myname.length()-1; i>=0;i--) {
		rev=rev + "" +myname.charAt(i);
	}
	System.out.println(rev);
	}
	

}
	