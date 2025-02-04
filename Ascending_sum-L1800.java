class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0], windowSum = nums[0];
        for(int i = 1;i < nums.length ;i++)
        {
            if(nums[i] > nums[i-1])
            {
                windowSum += nums[i];
            }
            else
                windowSum = nums[i];
            max = Math.max(windowSum , max);
        }
        return max;
    }
}
