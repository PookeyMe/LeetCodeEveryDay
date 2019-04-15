package Problem_217;

import java.util.HashSet;
import java.util.Set;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums) {
            if(set.contains(i))
                return true;
            set.add(i);
        }
        return false;
    }
}
