class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Integer i:map.keySet()){
            pq.offer(i);
        }
        int ans[]=new int[k];
        for(int j=0;j<k;j++){
            ans[j]=pq.poll();
        }
        return ans;
    }
}
