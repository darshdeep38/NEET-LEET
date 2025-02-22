class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
       for(int i = 0; i < nums.length;i++)
       {
            result = result ^ nums[i];
       } 
       return result;
    }
}

// a xor a = 0
// a xor 0 = a
