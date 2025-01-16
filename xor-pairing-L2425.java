class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
         int res =0;
        if((nums1.length %2 == 1) && (nums2.length%2 == 1))
        {
        // brute force
        for(int i =0;i<nums1.length ;i++)
        {
            for(int j = 0 ; j < nums2.length;j++)
            {
                res = res ^ nums1[i] ^ nums2[j];
            }
        }
        }
          //some optimization with even odd length bulshitery
        else if(nums1.length % 2 ==  1 )
            for(int i = 0; i < nums2.length; i++)
                res = res ^ nums2[i];
        else if(nums2.length % 2 ==  1 )
            for(int i = 0; i< nums1.length;i++)
                res = res ^ nums1[i];
        return res;
    }
}
