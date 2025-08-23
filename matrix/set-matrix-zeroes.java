class Solution {
    public void setZeroes(int[][] matrix) {

        //constant space O(1)
        //mark in the first row/column if it needs to be 0
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row0 = 1; //for the first row

        //determine which rows and columns need to be 0
        for(int r = 0; r < rows; r++)
        {
            for(int c = 0; c < cols; c++)
            {
                if(matrix[r][c] == 0)
                {
                    matrix[0][c] = 0;
                    if(r == 0)
                    {
                        row0 = 0;
                    }
                    else
                    {
                        matrix[r][0] = 0;
                    }
                }
            }
        }
        
        //changing columns to 0 (except the first column)
        for(int c = 1; c < cols; c++)
        {
            if(matrix[0][c] == 0)
            {
                for(int r = 0; r < rows; r++)
                {
                    matrix[r][c] = 0;
                }
            }
        }

        //changing rows to 0 (except first row)
        for(int r = 1; r < rows; r++)
        {
            if(matrix[r][0] == 0)
            {
                for(int c = 0; c < cols; c++)
                {
                    matrix[r][c] = 0;
                }
            }
        }

        if(matrix[0][0] == 0) //if first column needs to be 0
        {
            for(int r = 0; r < rows; r++)
            {
                matrix[r][0] = 0;
            }
        }

        if(row0 == 0) //if first row needs to be 0
        {
            for(int c = 0; c < cols; c++)
            {
                matrix[0][c] = 0;
            }
        }

    }
}

// class Solution {
//     public void setZeroes(int[][] matrix) {

//         int m = matrix.length; //no of rows
//         int n = matrix[0].length; //no of columns

//         Set<Integer> rows = new HashSet<>(); //stores the rows we need to turn 0
//         Set<Integer> columns = new HashSet<>(); //similar for columns

//         //find the rows and columns with zeroes
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if(matrix[i][j] == 0)
//                 {
//                     System.out.println(0);
//                     rows.add(i);
//                     columns.add(j);
//                 }
//             }
//         }

//         // System.out.println(rows);
//         // System.out.println(columns);

//         //making rows 0
//         for(int i : rows)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 matrix[i][j] = 0;
//             }
//         }

//         //making columns 0 
//         for(int j : columns)
//         {
//             for(int i = 0; i < m; i++)
//             {
//                 matrix[i][j] = 0;
//             }
//         }
        
//     }
// }