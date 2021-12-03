package assignmentweek1.day2;

import java.util.Arrays;

public class MisssingElementInArray {
	 
	public static void main(String[] args) {
		int array[] = {6,1,4,2,5,7,8};
		
		
		Arrays.sort(array);
		for(int j=1,i=1;i<array.length;j++,i++)
		{
			if(j!=array[i-1])
			{
				System.out.println("the missing element is="+j);
				
			}
			
        }System.out.println(array.length);
	}
}
