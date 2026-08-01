class Solution {
    public int maxProfit(int[] prices) {
        // int n=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int profit=prices[j]-prices[i];
        //         if(profit>n){
        //             n=profit;
        //         }
        //         profit=0;
        //     }
        // }
        // return  n;
        // int buy_price=prices[0];
        // int profit=0;
        // for(int i=0;i<prices.length;i++){
        //     if(buy_price>prices[i]){
        //         buy_price=prices[i];
        //     }
        //     else if(profit<prices[i]-buy_price){
        //         profit=prices[i]-buy_price;
        //     }
        // }
        // return profit;

        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,prices[i]);
        }

          return profit;



    }
}