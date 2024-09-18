class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int totalSum=0;
        int leftSum = 0;
        for(int i : nums)
            totalSum += i;
        for(int i = 0; i < nums.length;i++){
            result[i] = Math.abs(leftSum - (totalSum-leftSum - nums[i]));
            leftSum += nums[i];
        }
        return result;
    }
}

//-_-
