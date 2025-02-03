import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int answer = 0;

        for(int num : nums)
        {
            set.add(num);
        }

        for(int num : set)
        {
            if(set.contains(num - 1) == false) //does not contain a smaller value
            {
                int curr = 1; 
                while(set.contains(num+1) == true)
                {
                    curr++;
                    num++;
                }
                answer = Math.max(curr, answer);
            }
        }
      return answer;  
    }
}