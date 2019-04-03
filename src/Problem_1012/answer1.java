package Problem_1012;

import java.util.ArrayList;
import java.util.List;

public class answer1 {
    public static void main(String[] args)
    {
        int N=11;
        System.out.println(numDupDigitsAtMostN(N));
    }
    public static int numDupDigitsAtMostN(int N) {
        int result=0;
        for (int i = 1; i < N; i++)
        {
            int tempN=i;
            List<Integer> list=new ArrayList<>();
            while(tempN/10>0)
            {
                list.add(tempN%10);
                tempN/=10;
            }
            list.add(tempN%10);
            int len=list.size();
            l1:for(int j=len-1;j>=1;j--)
            {
                for(int k=j-1;k>=0;k--)
                {
                    if(list.get(j)==list.get(k))
                    {
                        if(i+Math.pow(10,k)<=N) {
                            i += Math.pow(10, k);
                            result += Math.pow(10, k);
                            i--;
                        }
                        else
                        {
                            i=N-1;
                            result+=N-i;
                        }
                        break l1;
                    }
                }
            }
        }
        int tempN=N;
        List<Integer> list=new ArrayList<>();
        while(tempN/10>0)
        {
            list.add(tempN%10);
            tempN/=10;
        }
        list.add(tempN%10);
        int len=list.size();
        l1:for(int j=len-1;j>=1;j--)
        {
            for(int k=j-1;k>=0;k--)
            {
                if(list.get(j)==list.get(k))
                {

                    result++;
                    break l1;
                }
            }
        }
        return result;
    }

}
