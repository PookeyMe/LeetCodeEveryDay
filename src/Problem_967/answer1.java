package Problem_967;

import java.util.HashSet;
import java.util.Set;

public class answer1 {
    public static void main(String[] args)
    {
        int[] result=numsSameConsecDiff(2,1);
        for(int i:result)
            System.out.println(i);
    }
    public static int[] numsSameConsecDiff(int N, int K) {
        if(N==1)
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        int count=0;
        for(int i=0;i<10;i++) {
            if (i + K < 10)
                count++;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=1;i<count;i++)
        {
            int num1=0;
            int num2=0;
            int num10=1;
            for(int j=0;j<N;j++)
            {
                if(j%2==1) {
                    num1 += num10 * i;
                    num2 += num10 * (K + i);
                }
                else{
                    num1+=num10*(K+i);
                    num2+=num10*i;
                }
                num10*=10;
            }
            set.add(num1);
            set.add(num2);
        }
        int num1=0;
        int num10=1;
        if(N%2==1) {
            for (int j = 0; j < N; j++) {
                if (j % 2 == 0)
                    num1 += num10 * K;
                num10 *= 10;
            }
        }
        else
        {
            for (int j = 0; j < N; j++) {
                if (j % 2 == 1)
                    num1 += num10 * K;
                num10 *= 10;
            }
        }
        set.add(num1);
        if(K==0)
            set.remove(0);
        int[] result=new int[set.size()];
        int i=0;
        for(int num:set)
        {
            result[i++]=num;
        }
        return result;
    }
}
