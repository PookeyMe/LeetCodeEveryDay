package Problem_8;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class answer1 {
    public static void main(String[] args)
    {
        String sample="-";
        int result=myAtoi(sample);
        System.out.println(result);
    }
    public static int myAtoi(String str) {
        StringBuilder result=new StringBuilder();
        int len=str.length();
        if(len==0)
            return 0;
        int firstFlag=0,digFlag=1;
        int answer;
        char temp;
        for(int i=0;i<len;i++)
        {
            temp=str.charAt(i);
            if(firstFlag==0) {
                if ( temp == ' ')
                    continue;
                else
                    firstFlag = 1;
            }
            if(firstFlag==1) {
                if (temp == '-') {
                    digFlag = -1;
                    firstFlag = 2;
                    continue;
                } else if ( temp == '+') {
                    firstFlag = 2;
                    continue;
                } else if ( !isNum(temp))
                    return 0;
            }
            if(isNum(temp))
            {
                result.append(temp);
                firstFlag=2;
            }
            else
                break;
        }
        if(result.length()==0)
            return 0;
        try {
            answer=Integer.parseInt(result.toString());
            return answer*digFlag;
        }
        catch (Exception e)
        {
            if(digFlag==-1)
                return Integer.MIN_VALUE;
            else if(digFlag==1)
                return Integer.MAX_VALUE;
            else
                return 0;
        }
    }
    public static boolean isNum(char a)
    {
        char[] target = new char[]{'1','2','3','4','5','6','7','8','9','0'};
        for(int j=0;j<10;j++) {
            if (a == target[j])
                return true;
        }
        return false;
    }
}
