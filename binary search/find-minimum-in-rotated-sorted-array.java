class Solution {
    public int findMin(int[] nums) {
    
    int left = 0;
    int right = nums.length - 1;
    
    //if it is still sorted
    if(nums[0] <= nums[nums.length - 1])
    {
    return nums[0];
    }
    
    while(left <= right)
    {
    int mid = left + (right-left)/2;
    
    if(nums[mid] > nums[mid+1])
    {
    return nums[mid+1];
    }
    else if(nums[mid - 1] > nums[mid])
    {
    return nums[mid];
    }
    
    if(nums[mid] > nums[0])
    {
    left = mid + 1;
    }
    else
    {
    right = mid - 1;
    }
    }
    return 0;
    }
    }