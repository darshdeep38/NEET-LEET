class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i;
        for( i=0 ;chalk[i] <= k ;i++)
        {
            k = k- chalk[i];
            if(i == chalk.length - 1)
                i = -1;
        }
    return i;
    }
}



//not optimized
