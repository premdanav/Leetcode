class Solution {
    public int maxProfit(int[] prices) {
       // int buy=prices[0];
       // int maxProfit=0;
       // for(int i=1;i<prices.length;i++)
       // {
       //     if(prices[i]<buy)
       //     {
       //         buy=prices[i];
       //     }
       //     else
       //     {
       //         int currProfit=prices[i]-buy;
       //         maxProfit=Math.max(maxProfit,currProfit);
       //     }
       // }
       // return maxProfit;


        int buy=prices[0];
        int maxProfit=0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy)
                buy=prices[i];
            else
            {
                int currProfit=prices[i]-buy;
                maxProfit=Math.max(maxProfit,currProfit);
            }
        }
        return maxProfit;
        
        
        // int buy=Integer.MAX_VALUE;
        //  int sell=Integer.MIN_VALUE;
        // int index=0;
        // for(int i=0;i<prices.length;i++)
        // {
        //  if(prices[i]<=buy)
        //  {
        //      buy=prices[i];
        //      index=i;
        // }
        // }
        // for(int i=index;i<prices.length;i++)
        // {
        //     if(prices[i]>=sell)
        //     {
        //         sell=prices[i];
        //     }
        // }
        // if(Math.abs(buy)<Math.abs(sell))
        // {
        //     return Math.abs(buy-sell);
        // }
        // else
        // {
        //     return 0;
        // }
    }
}
