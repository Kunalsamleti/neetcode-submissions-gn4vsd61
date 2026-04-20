class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int water=0;
        int maxwater=0;
        while(l<r){
            int ht=heights[l]<heights[r] ? heights[l]:heights[r];
            water=ht*(r-l);
            maxwater=maxwater>water ? maxwater:water;
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxwater;
    }
}
