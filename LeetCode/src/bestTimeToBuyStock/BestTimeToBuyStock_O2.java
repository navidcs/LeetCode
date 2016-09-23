package bestTimeToBuyStock;

public class BestTimeToBuyStock_O2 {
	 public static int maxProfit(int[] prices) {
	        if (prices.length <= 0)
	            return 0;
	        
	        int max = Integer.MIN_VALUE;
//	        int min = Integer.MAX_VALUE;
	        for(int i = 0; i < prices.length-1;++i){
	        	for (int j = i + 1;j<prices.length;++j){
	        		if(prices[j]-prices[i]>max)
	        			max = prices[j]-prices[i];
	        	}
	        		
	        }
	        return max ;
	    }

	public static void main(String[] args) {
		int [] test={3,6,12,23,9};
		System.out.println(maxProfit(test));
		

	}

}
