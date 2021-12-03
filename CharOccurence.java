package assignmentweek1.day2;

public class CharOccurence {

	public static void main(String[] args) {
		String str = "program to find number of times a character is present";
		System.out.println("Occurance of");
		int count =0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='i')
			
			{
				count++;
			}
			
		}
		System.out.println("i=" +count);

	}

}
