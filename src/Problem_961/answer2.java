package Problem_961;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class answer2 {
    public static void main(String[] args)
    {
        int[] ints=new int[]{1,2,3,3};
        System.out.println(repeatedNTimes(ints));
    }
    public static int repeatedNTimes(int[] A)
    {
        Arrays.sort(A);
        return A[A.length/2]==A[A.length-1]?A[A.length/2]:A[A.length/2-1];
    }
}
