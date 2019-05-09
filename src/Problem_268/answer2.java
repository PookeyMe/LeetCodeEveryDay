package Problem_268;

public class answer2 {
    public static void main(String[] args)
    {

    }
    public static int missingNumber(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; ++i){
            sum ^= nums[i];
            sum ^= i;
        }
        return sum;
    }
}
