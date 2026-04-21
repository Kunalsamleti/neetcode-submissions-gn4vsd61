class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxp=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                maxp=maxp>prices[r]-prices[l] ? maxp:prices[r]-prices[l];
                r++;
            }else{
                l=r;
                r=l+1;
            }
        }
        return maxp;
    }
}
