class Solution {
    public int trap(int[] height) {
        int lmax[]=new int[height.length];
        int rmax[]=new int[height.length];
        int maxl=0;
        int maxr=0;
        for(int i=0;i<height.length;i++){
            if(maxl>height[i]){
                lmax[i]=maxl;
            }else{
                lmax[i]=height[i];
                maxl=lmax[i];
            }
        }
        for(int i=height.length-1;i>=0;i--){
            if(maxr>height[i]){
                rmax[i]=maxr;
            }else{
                rmax[i]=height[i];
                maxr=rmax[i];
            }
        }
        int water=0;
        for(int i=0;i<height.length;i++){
            int imax=lmax[i]<rmax[i] ? lmax[i]:rmax[i];
            water+=imax-height[i];
        }
        return water;
    }
}
