package Problem_9;

public class answer2 {
    public static void main(String[] args)
    {
        int sample=10;
        System.out.println(isPalindrome(sample));
    }
    public static boolean isPalindrome(int x) {
        int reverse=0,y=x,z=x;
        int dig=1;
        if(x<0)
            return  false;
        x/=10;
        while(x>0)
        {
            x/=10;
            dig*=10;
        }
        while(y>0)
        {
            reverse+=dig*(y%10);
            y/=10;
            dig/=10;
        }

        if(reverse==z)
            return true;
        return false;
    }
}
