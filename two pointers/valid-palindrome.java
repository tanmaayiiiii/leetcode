class Solution {
    public boolean isPalindrome(String s) {

        //optimized solution
        s = s.toLowerCase();

        int l = 0;
        int r = s.length() - 1; 

        while(l < r)
        {
            while(l < r && alphanumeric(s.charAt(l)) == false)
            {
                l++;
            }
            while(r > l && alphanumeric(s.charAt(r)) == false)
            {
                r--;
            }

            if(s.charAt(l) == s.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    boolean alphanumeric(char c)
    {
        return (Character.isDigit(c) || Character.isLetter(c));
    }
}


// class Solution {
//     public boolean isPalindrome(String s) {

//         s = s.toLowerCase();
//         StringBuilder newS = new StringBuilder();

//         for(char c : s.toCharArray())
//         {
//             if((c >= 97 && c < 97 + 26) || Character.isDigit(c) == true)
//             {
//                 newS.append(c);
//             }
//         }

//         int start = 0;
//         int end = newS.length()-1;

//         while(start <= end)
//         {
//             if(newS.charAt(start) == newS.charAt(end))
//             {
//                 start++;
//                 end--;
//                 continue;
//             }
//             else
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
// }