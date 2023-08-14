class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int s1 = nums1.length;
       int s2 = nums2.length;
       int size = s1 + s2;
       double mid;
       int[] res = new int[size];

       System.arraycopy(nums1,0,res,0,s1);
       System.arraycopy(nums2,0,res,s1,s2);

       Arrays.sort(res);
       if(size % 2 !=0)
       {
           mid = res[size/2];
       }
       else
       {
           int a1 = res[size/2];
           int a2 = res[(size/2)-1];
           mid = (double)(a1+a2)/2;
       }
       
       return mid; 
    }
}
