package L42_BitManipulation;

public class Unique_No {

	public static void main(String[] args) {
		
		int[] arr = {10,15,25,15,60,25,10};
		
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor^= arr[i];
		}
       
		System.out.println(xor);
		
		int i = 1;
		System.out.println(i);
	}

}
