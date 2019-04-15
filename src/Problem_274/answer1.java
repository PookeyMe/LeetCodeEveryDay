package Problem_274;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class answer1 {
    public static void main(String[] args)
    {
        int[] a=new int[]{3,0,6,1,5};
        int[] b=new int[]{1};
        System.out.println(hIndex(b));
    }
    public static int hIndex(int[] citations) {
        int len=citations.length;
        int[] ints=new int[len+1];
        for(int i=0;i<len;i++) {
            int temp=citations[i]>len?len:citations[i];
            for (int j = 1; j <= temp; j++)
                ints[j]++;
        }
        for(int i=0;i<len+1;i++) {
            if(ints[i]<i)
                return i-1;
        }
        return len;
    }
}
