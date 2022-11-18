package OperationPostAndPre;

public class BuyAndSellStocks {
	
	public static int maxProfits(int[] prices) {
		if(prices == null || prices.length<2) {
			return 0;
		}
		
		int lowestPrice = Integer.MAX_VALUE, maxProfit = 0;
		for(int price:prices) {
			lowestPrice = Math.min(lowestPrice, price);
			maxProfit = Math.max(maxProfit, price-lowestPrice);
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int ans = maxProfits(new int[]{2,4, 6,9});
		System.out.println(ans);
	}
}
