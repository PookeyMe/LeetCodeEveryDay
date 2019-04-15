package Problem_58;

public class answer2 {
    public static void main(String[] args)
    {
        String s=new String(" s hello  ");
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int len=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
                len++;
            else if(s.charAt(i)==' '&&len!=0)
                return len;
        }
        return len;
    }
}
