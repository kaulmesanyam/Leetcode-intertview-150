public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
       int buy = prices[0], sell = prices[0], maxProfit = 0;

       for(int i = 0; i < prices.length; i++) {
           if(prices[i] < buy) {
               buy = prices[i];
               sell = buy;
           }

           if((prices[i] > sell) && ((prices[i] - buy) > maxProfit)) {
               sell = prices[i];
               maxProfit = sell - buy;
           }
       }

        return maxProfit;
    }
}
