package Problem_26;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static int removeDuplicates(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=1;i<len;i++) {
            if(nums[i]==nums[i-1])
                continue;
            else {
                count++;
                nums[count]=nums[i];
            }
        }
        return count+1;
    }
}
