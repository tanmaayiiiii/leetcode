class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1)
        {
            return 0;
        }

        int left = 0;
        int product = 1; 
        int answer = 0;

        for(int right = 0; right < nums.length; right++)
        {
            product = product * nums[right];
 
            while(product >= k) //while window is invalid
            {
                product = product/nums[left];
                left++;
            }

            answer = answer + (right-left + 1);
        }
        return answer;
    }
}