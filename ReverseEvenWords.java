package assignmentweek1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "this sentence will be reversed";
		System.out.println("The original string is: " + str);
		String strWords[] = str.split("\\s");
		String rev = "";
		for(String sw : strWords) {
		StringBuilder sb = new StringBuilder(sw);
		sb.reverse();
		rev += sb.toString() + " ";
		}
		System.out.println("The modified string is: " + rev.trim());
		}

	}


