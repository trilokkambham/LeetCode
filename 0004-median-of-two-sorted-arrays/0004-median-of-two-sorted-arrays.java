class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums=new ArrayList<Integer>();
        int m=nums1.length;
        int n=nums2.length;
        for(int i=0;i<m;i++){
            nums.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            nums.add(nums2[i]);
        }
        Collections.sort(nums);
        if((m+n)%2==0){
            return ((nums.get(((n+m)/2)-1)+nums.get((n+m)/2))/2.0);
        }
        else{
            return nums.get((n+m)/2);
        }
    }
}