package Problem_961;


import java.util.HashSet;
import java.util.Set;

public class answer1 {
    public static void main(String[] args)
    {
        int[] ints=new int[]{1,2,3,3};
        System.out.println(repeatedNTimes(ints));
    }
    public static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>(A.length / 2 + 1);
        for (int i : A) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }
}
