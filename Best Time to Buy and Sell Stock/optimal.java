class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,min=Integer.MAX_VALUE;
        for(int x:prices)
        {
            min = Math.min(min,x);
            profit = Math.max(profit,(x-min));
        }
        return profit;
        
    }
}
//The faster execution time for inbuilt function
