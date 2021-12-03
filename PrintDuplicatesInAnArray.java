package assignmentweek1.day2;

public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		
		int[] array= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println(array.length);
		int count=0;
		int i;
		for(i=0;i<array.length;i++) {
			for(count=i+1;count<array.length;count++) {
				if(array[i]==array[count])
					System.out.println(array[count]);
			}
			
			}
		

	}

}
