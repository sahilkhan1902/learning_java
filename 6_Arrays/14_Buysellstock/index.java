

public class index {
    public static int buySell (int prices []){
        int buyPrices =Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if(buyPrices < prices[i]){ //profit
                int profit = prices[i] - buyPrices; // today profit
                 maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrices = prices[i];
            }
        }
        return  maxProfit;
    }
    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 6, 3, 4};
        System.out.println(buySell(prices));
    }
}
