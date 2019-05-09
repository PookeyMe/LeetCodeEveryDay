package Problem_463;

public class answer1 {
    public static void main(String[] args)
    {
        int[] ints=new int[]{1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(ints,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double sumK=Integer.MIN_VALUE;
        int len=nums.length-k;
        for(int i=0;i<=nums.length-k;i++)
        {
            double tempSum=0;
            for(int j=i;j<i+k;j++)
                tempSum += nums[j];
            sumK=sumK<tempSum?tempSum:sumK;

        }
        return sumK/k;
    }
}
