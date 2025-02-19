class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for(int i= 0; i < nums.length ; i++)
        {
            if(!seen.contains(nums[i]))
                seen.add(nums[i]);
            else
                return true;
            if(seen.size() > k)
            {
                seen.remove(nums[i-k]);
            }
        }
        return false;
    }
}


//run a sliding window using hashset
//time o(n)
//space o(n)
