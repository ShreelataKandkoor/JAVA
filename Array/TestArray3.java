package Array;

import java.lang.reflect.Array;

public class TestArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printArray(new int[] {3,1,2,6,4,2});
	}

	private static void printArray(int[]array) {
		// TODO Auto-generated method stub
		
		for(int i =0 ; i < array.length; i++) {
			
			System.out.println(array[i]+ " ");
		}
		
	}

}
