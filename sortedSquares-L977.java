class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 , j = nums.length-1, k = j;
        int result[] = new int[nums.length];
        while(i <= j)
        {
            if(Math.abs(nums[i])>=Math.abs(nums[j]))
            {
                result[k] = nums[i] * nums[i];
                i++;
            }
            else
            {
                result[k] = nums[j] * nums[j];
                j--;
            }
            k--;
        }
        return result;
    }
}


//two pointers
//calculate the absolute at start and end of the array, since the array is sorted
//time o(n)
//space: o(n)
