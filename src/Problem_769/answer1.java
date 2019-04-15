package Problem_769;

import java.util.Arrays;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static int maxChunksToSorted(int[] arr) {
        int[] newArr=arr;
        int[] showArr=new int[arr.length];
        Arrays.sort(newArr);
        int i1=0,i,block=1;
        while(true)
        {
            for(i=i1;i<arr.length;i++) {
                if(newArr[i1]==arr[i])
                    break;
            }
            for(int j=i1;j<=i;j++)
            {

            }
            if(i==arr.length)
                return block;

        }
    }
}
