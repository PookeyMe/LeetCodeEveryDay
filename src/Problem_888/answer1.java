package Problem_888;

import java.util.HashSet;
import java.util.Set;

public class answer1 {
    public static void main(String[] args)
    {
        int[] A=new int[]{1,2};
        int[] B=new int[]{2,3};
        int[] C=fairCandySwap(A,B);
        for(int i:C)
        {
            System.out.println(i);
        }
    }
    public static int[] fairCandySwap(int[] A, int[] B) {
            int sa = 0, sb = 0;  // sum of A, B respectively
            for (int x: A) sa += x;
            for (int x: B) sb += x;
            int delta = (sb - sa) / 2;
            // If Alice gives x, she expects to receive x + delta

            Set<Integer> setB = new HashSet();
            for (int x: B) setB.add(x);

            for (int x: A)
                if (setB.contains(x + delta))
                    return new int[]{x, x + delta};

            throw null;
    }
}
