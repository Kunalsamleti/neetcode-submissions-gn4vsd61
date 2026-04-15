class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                continue;
            }
            prod*=nums[i];
        }
        int ans[]=new int[nums.length];
        if(count>1){
            return ans;
        }else if(count==1){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==0){
                    ans[j]=prod;
                }
            }
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=prod/nums[i];
        }
        return ans;
    }
}  
