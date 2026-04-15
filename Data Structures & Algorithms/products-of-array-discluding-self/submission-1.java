class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftprod=1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]+=leftprod;
            leftprod*=nums[i];
        }
        int rightprod=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=rightprod;
            rightprod*=nums[i];
        }
        return ans;
    }
}  
