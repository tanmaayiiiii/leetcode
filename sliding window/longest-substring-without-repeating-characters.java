import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    int left = 0;
    int ans = 0; //length of longest substring (r-l+1)
    
    //hashset to check
    HashSet<Character> hs = new HashSet<>();
    
    for(int right = 0; right < s.length(); right++)
    {
    
    while(hs.contains(s.charAt(right)))
    {
    hs.remove(s.charAt(left));
    left++;
    }
    
    hs.add(s.charAt(right)); //a b c
    
    ans = Math.max(ans, right-left+1); //3
    }
    
    return ans;
    
    }
    }