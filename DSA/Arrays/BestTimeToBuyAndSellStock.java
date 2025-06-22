package DSA.Arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int [] prices){
        
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0 ; i<prices.length ;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
    
        return maxProfit;
    }

    
    public static void main(String[] args) {
        int [] prices = {0, 2, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
