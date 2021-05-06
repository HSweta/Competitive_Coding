package Question_Session;

public class Best_Time_to_Buy_and_Sell_Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {7,1,5,3,6,4};
        
        System.out.println(Profit(arr));
        
	}
	public static int Profit(int[] arr) {
		
		int min_price = Integer.MAX_VALUE;
		int profit=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(min_price>arr[i])
				min_price=arr[i];
			else
			    profit = Math.max(profit, arr[i]-min_price);
		}
		
		return profit;
	}
	

}
