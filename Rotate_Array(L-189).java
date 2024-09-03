class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverseArray(0 , nums.length - 1 , nums);
        reverseArray(0 , k-1 , nums);
        reverseArray(k,nums.length-1 , nums);
    }
    public void reverseArray( int l , int r , int[] nums)
    {
        while(l < r)
        {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] =  temp;
            l++;
            r--;
        }
    }
}  



//space complexity == o(1)
//time complexity == o(n)
