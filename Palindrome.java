package assignmentweek1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str ="rotor";
		String rev ="";
		int strlength=str.length();
		for(int i=(strlength-1);i>=0;i--) 
		{
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) 
		{
			System.out.println(str+ "is a palindrome string");
		}
		else 
		{
			System.out.println(str + "is not a palindrome string");
		}
			

	}

}
