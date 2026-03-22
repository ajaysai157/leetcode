class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            res[nums1.length+j]=nums2[j];
        }
        Arrays.sort(res);
        int n=res.length;
        if(n%2!=0){
            int index=n/2;
            return res[index];
        }else{
            double val=res[(int)(n/2-1)]+res[(int)(n/2)];
            return val/2;
        }
    }
}