package Problem_32;

import java.util.Stack;

public class answer1 {
    public static  void main(String[] args)
    {
        String s="()(()";
        System.out.println(longestValidParentheses(s));
    }
    public static int longestValidParentheses(String s) {
        int result=0,tempResult=0;
        Stack<Character> stack=new Stack<>();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char temp=s.charAt(i);
            if(stack.empty())
            {
                stack.push(temp);
                continue;
            }
            if(temp==')'&&stack.peek()=='(')
            {
                stack.pop();
                tempResult++;
            }
            else
            {
                tempResult=0;
                stack.push(temp);
                if(temp==')')
                {

                    if(tempResult>result)
                    {
                        result=tempResult;
                    }
                }
            }
        }
        if(tempResult>result)
        {
            result=tempResult;
        }

        return result*2;
    }
}
