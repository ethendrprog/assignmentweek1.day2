package assignmentweek1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		int i=0;
		int j=0;
		System.out.println("matching numbers are =");
		Arrays.sort(array2);
		Arrays.sort(array1);
		for( i=0;i<array1.length;i++){
			for( j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j]) 
				    {
					System.out.println(array1[i]); 
					}

	        }

}
} 
} 

		