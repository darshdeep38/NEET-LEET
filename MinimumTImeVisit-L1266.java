class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int max = 0;
        for(int e : nums){
            if(e > max){
                max = e;
            }
        }
        int[] arr = new int[max+1];
        for(int e : nums){
            arr[e] += 1;
        }   
        for(int i = 1 ; i < arr.length ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        int[] result = new int[nums.length];
        for(int i = 0 ; i< nums.length ; i++){
            
            result[i] = nums[i] == 0 ? 0 : arr[nums[i] - 1];
        }
        return result;
    }
}

// time : o(n);
