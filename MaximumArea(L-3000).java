// You are given a 2D 0-indexed integer array dimensions.

// For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.

// Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.

 

class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int dmax = -99999;
        int ans = 0;
        for(int i =0;i < dimensions.length;i++)
        {
            int l = dimensions[i][0] , b = dimensions[i][1];
            if(dmax < l*l + b*b)
            {
                dmax = l*l + b*b;
                ans = l*b;
            }
            else if(dmax == l*l + b*b)
                ans = Math.max(l*b,ans);
        }

        return ans;
    }
}


//simple iteration
