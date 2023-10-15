class Solution {
    public int maximumCount(int[] nums) {
        int n=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                n++;
            }
            else if(nums[i]<0){
                m++;
            }
        }
        if(n<m){
            return m;
        }
        else{
            return n;
        }
    }
}