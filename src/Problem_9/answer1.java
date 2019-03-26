package Problem_9;

public class answer1 {
    public static void main(String[] args)
    {
        int sample=12321;
        System.out.println(isPalindrome(sample));
    }
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int len=s.length();
        int len2=len/2;
        for(int i=0;i<len2;i++)
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        return  true;
    }
}
