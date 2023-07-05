class Solution {
    public int longestSubarray(int[] nums) {
      int length = nums.length;
     int left=0;
      int count=0;
     for(int num:nums)
     {
      
       if (num==0)
       {
          count++;
       }
        if(count>1 && nums[left++]==0)
        {
          count--;
        }
      
     }
     return nums.length-left-1;
}
}
