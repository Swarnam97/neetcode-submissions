class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = 0;
        int ans = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[start])
            ans = Math.max(ans,prices[i] - prices[start]);
            else
            start = i;
        }

        return ans;
    }
}
