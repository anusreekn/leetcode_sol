class Solution {
    public int maxProfit(int[] prices)
     {
        int cheap=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i] < cheap)
            {
                cheap=prices[i];
            }
            profit=Math.max(profit,prices[i]-cheap);
        }
        return profit;
        
    }
}