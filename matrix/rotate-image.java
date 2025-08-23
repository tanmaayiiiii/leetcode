class Solution {
    public void rotate(int[][] matrix) {
        //transpose the matrix first, then reorder the columns

        int n = matrix.length;

        int[][] transpose = new int[n][n];  
        //have to copy all elements can't just do transpose = matrix (both will point to the same array)
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                transpose[i][j] = matrix[i][j];
            }
        }

        //tranpose the matrix
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = transpose[j][i];
            }
        }

        //switch rows (outermost, then inner and so on -> makes it 90 degree rotated)
        int left = 0;
        int right = n-1;
        while(left < right)
        {
            for(int i = 0; i < n; i++)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            left++;
            right--;
        }
    }
}