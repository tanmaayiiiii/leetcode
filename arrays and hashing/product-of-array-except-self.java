class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        int prefix = 1;
        int postfix = 1; 

        for(int i = 0; i < nums.length; i++)
        {
            res[i] = prefix; 
            prefix = prefix * nums[i];
        }

        for(int i = nums.length - 1; i >= 0 ; i--)
        {
            res[i] = res[i] * postfix; 
            postfix = postfix * nums[i];
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(res[i]);
        }
        return res;
    }
}