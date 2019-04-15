package Problem_344;

public class answer1 {
    public static void main(String[] args)
    {
        char[] s=new char[]{'h','e','l','l','o'};
        reverseString(s);
        for(char temp:s)
        {
            System.out.println(temp);
        }
    }
    public static  void reverseString(char[] s) {
        int len=s.length;
        char c;
        for(int i=0;i<len/2;i++)
        {
            c=s[i];
            s[i]=s[len-i-1];
            s[len-i-1]=c;
        }
    }
}
