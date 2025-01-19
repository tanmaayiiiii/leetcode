import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String s : tokens)
        {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
            {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                if(s.equals("+"))
                {
                    stack.push(operand1 + operand2);
                }
                if(s.equals("-"))
                {
                    stack.push(operand1 - operand2);
                }
                if(s.equals("*"))
                {
                    stack.push(operand1 * operand2);
                }
                if(s.equals("/"))
                {
                    stack.push(operand1 / operand2);
                }
            }
            else
            {
                int a = Integer.parseInt(s);
                stack.push(a);
            }
        }
        return stack.pop();
    }
}