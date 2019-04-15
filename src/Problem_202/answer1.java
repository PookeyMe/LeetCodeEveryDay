package Problem_202;

import java.util.HashSet;

public class answer1 {
    public static void main(String[] args)
    {
        System.out.println(isHappy(4));
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(n);
        while(true)
        {
            int newN=0;
            while(n>0)
            {
                newN+=(n%10)*(n%10);
                n/=10;
            }
            n=newN;
            if(newN==1)
                return true;
            if(hashSet.contains(newN))
                return false;
            hashSet.add(newN);
        }
    }

}
