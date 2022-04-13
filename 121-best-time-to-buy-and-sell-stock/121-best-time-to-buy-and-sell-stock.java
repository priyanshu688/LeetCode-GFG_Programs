class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int[] maxArray = new int[n];
        int maxTillNow = Integer.MIN_VALUE;
      
      	// calculate max array from right
        for(int i=n-1; i>=0; i--){
            maxTillNow = Math.max(maxTillNow,prices[i]);
            maxArray[i] = maxTillNow;
        }
        
        for(int i=0; i<n-1; i++)
            maxProfit = Math.max(maxProfit,maxArray[i+1]-prices[i]);
        return maxProfit;
    }
}
