class Solution {
    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length;

        if(nums == null || k < 0)
        {
          throw new IllegalArgumentException("Illegal argument");
        }

        int a = nums.length - k;

        reverse(nums,0,a-1);
        reverse(nums,a,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    public static void reverse(int[] arr, int left, int right)
    {
      if(arr == null || arr.length == 1)
        return;

      while(left < right)
      {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
}
