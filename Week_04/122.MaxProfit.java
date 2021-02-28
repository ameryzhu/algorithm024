class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1){
            return 0;
        }
        int profits = 0;
        for(int i = 0;i < prices.length-1;i++){
            int delta = prices[i+1]-prices[i];
            if(delta>0){
                profits+=delta;
            }
        }
        return profits;
    }
}
