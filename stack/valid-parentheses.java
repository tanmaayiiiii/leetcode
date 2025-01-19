import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(stack.empty() && (c == ')' || c =='}' || c == ']'))
            {
                return false;
            }
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                if((c == ')' && stack.peek() != '(') || (c=='}' && stack.peek() != '{') || (c == ']' && stack.peek() != '['))
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }
        return stack.empty();
    }
}