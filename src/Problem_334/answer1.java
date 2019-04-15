package Problem_334;

public class answer1 {
    public static void main(String[] args)
    {
        int[] nums=new int[]{5,2,5,5,1,5,4};
        System.out.println(increasingTriplet(nums));
    }
    public static boolean increasingTriplet(int[] nums) {
        int small=Integer.MAX_VALUE,mid=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i<=small)
                small=i;
            else if(i<=mid)
                mid=i;
            else
                return true;
        }
        return false;
    }
}
