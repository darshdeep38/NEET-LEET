class Solution {
    public boolean check(int[] nums) {
        int length = nums.length;
        int count = 1;
        if(length == 1)
            return true;
        for(int i =1 ; i < length * 2 ; i++)
        {
            if(nums[(i - 1) % length] <= nums[i % length])
            {
                count++;
            }
            else
                count = 1;
            if(count == length)
                return true;
        }
        return false;
    }
}
