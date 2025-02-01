package matrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    
    int rows = matrix.length;
    int columns = matrix[0].length;
    
    int left = 0;
    int right = columns - 1;
    int top = 0;
    int bottom = rows - 1;
    
    List<Integer> result = new ArrayList<>();
    
    while(result.size() < rows * columns)
    {
    //right
    for(int i = left; i <= right && result.size() < rows * columns; i++)
    {
    result.add(matrix[top][i]);
    }
    top++;
    
    //down
    for(int i = top; i <= bottom && result.size() < rows * columns; i++)
    {
    result.add(matrix[i][right]);
    }
    right--;
    
    //left
    for(int i = right; i >= left && result.size() < rows * columns; i--)
    {
    result.add(matrix[bottom][i]);
    }
    bottom--;
    
    //up
    for(int i = bottom; i >= top && result.size() < rows * columns; i--)
    {
    result.add(matrix[i][left]);
    }
    left++;
    
    
    }
    return result;
    }
    }