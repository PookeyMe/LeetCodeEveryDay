package Problem_268;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static int missingNumber(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        return nums.length*(nums.length+1)/2-sum;
    }
}
