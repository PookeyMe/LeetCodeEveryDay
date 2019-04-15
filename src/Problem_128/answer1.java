package Problem_128;

import java.util.HashSet;
import java.util.Set;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static int longestConsecutive(int[] nums) {
        int len=nums.length;
        Set<Integer> set=new HashSet<>();
        int maxLen=0;
        for(int i=0;i<len;i++)
            set.add(nums[i]);
        for(int i=0;i<len;i++)
        {
            int tmpLen=1;
            int tempNum=nums[i]+1;
            if(!set.contains(tempNum-2)) {
                while (true) {
                    if (set.contains(tempNum))
                        tmpLen++;
                    else
                        break;
                    tempNum++;
                }
                maxLen = maxLen > tmpLen ? maxLen : tmpLen;
            }
        }
        return maxLen;
    }
}
