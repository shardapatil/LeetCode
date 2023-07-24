class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] resarr= new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int res = nums[i] + nums[j];

                if(res == target)
                {
                    resarr[0] = i;
                    resarr[1] = j;
                    return resarr;
                }
            }
        }
        return resarr;
    }
}
