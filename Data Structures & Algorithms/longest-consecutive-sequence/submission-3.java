class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        Arrays.sort(nums);
        int len=1;
        int maxlen=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]!=nums[i-1]+1){
                len=0;
            }
            len++;
            maxlen=maxlen>len ? maxlen:len;
        }
        return maxlen;
    }
}
