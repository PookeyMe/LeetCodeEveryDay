package Problem_58;

public class answer1 {
    public static void main(String[] args)
    {
        String s=new String("");
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int len=0,len2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                if(len!=0)
                    len2=len;
                len=0;
                continue;
            }
            len++;
        }
        return len==0?len2:len;
    }
}
