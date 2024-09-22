class Solution {
    public void reverse(int [] arr)
    {
        for(int i=0 ; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i = 0; i< matrix.length ; i++)
        {
            for(int j = 0 ; j<i; j++)
            {
                int temp=matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for(int i =0;i<matrix.length ; i++)
            reverse(matrix[i]);
        
    }
}



//clockwise:
      //Rotate along diagonal
      //reverse the rows

//anti clockwise
    //Reverse the rows
    //transpose
