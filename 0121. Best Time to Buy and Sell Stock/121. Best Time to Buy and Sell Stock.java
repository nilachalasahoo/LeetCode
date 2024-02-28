class Solution {
    public int maxProfit(int[] prices) {
        int x=prices[0];
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<x){
                x=prices[i];
            }
            if(p<prices[i]-x){
                p=prices[i]-x;
            }
        }
        return p;
    }
}
