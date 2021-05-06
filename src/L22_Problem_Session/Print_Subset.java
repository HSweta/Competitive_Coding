package L22_Problem_Session;

import java.util.ArrayList;
import java.util.Collections;

public class Print_Subset {
    
	
	public static void main(String[] args) {
 
		int[] arr = { 1, 2, 3 };
		ArrayList<Integer> list = new ArrayList<>();
		//print_subSet(arr, "", 0);
		subSet_sum(arr, 0, 0, list);
		Collections.sort(list);
        System.out.println(list);
	}

	public static void print_subSet(int[] arr, String ans, int i) {

		if (i == arr.length) {
			System.out.println(ans);
			return;
		}
		print_subSet(arr, ans + arr[i] + " ", i + 1);// yes
		print_subSet(arr, ans, i + 1);

	}
	
	public static void subSet_sum(int[] arr, int ans, int i,ArrayList<Integer> list) {

		if (i == arr.length) {
			list.add(ans);
			return;
		}
		subSet_sum(arr, ans + arr[i], i + 1,list);// yes
		subSet_sum(arr, ans, i + 1,list);

	}

}
