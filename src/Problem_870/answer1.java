package Problem_870;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class answer1 {
    public static void main(String[] args)
    {
        int[] A=new int[]{12,24,8,32};
        int[] B=new int[]{13,25,32,11};
        int[] C=advantageCount(A,B);
        for(int i:C)
            System.out.println(i);
    }
    public static int[] advantageCount(int[] A, int[] B) {
        Arrays.sort(A);
        int[] result=new int[A.length];
        boolean flag;
        for(int i=0;i<B.length;i++)
        {
            flag=false;
            for(int j=0;j<A.length;j++)
            {
                if(A[j]==Integer.MIN_VALUE)
                    continue;
                if(A[j]>B[i])
                {
                    result[i]=A[j];
                    A[j]=Integer.MIN_VALUE;
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                for(int j=0;j<A.length;j++)
                {
                    if(A[j]!=Integer.MIN_VALUE) {
                        result[i] = A[j];
                        A[j]=Integer.MIN_VALUE;
                        break;
                    }
                }
            }
        }
        return  result;
    }
}
