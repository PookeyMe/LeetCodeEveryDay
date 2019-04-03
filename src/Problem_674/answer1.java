package Problem_674;

public class answer1 {
    public static void main(String[] args)
    {
        int[] ints=new int[]{1,3,5,7};
        System.out.println(findLengthOfLCIS(ints));
    }
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int tempResult=1,result=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                tempResult++;
            else
            {
                if(result<tempResult)
                    result=tempResult;
                tempResult=1;
            }
        }
        if(result<tempResult)
            result=tempResult;
        return result;
    }
}
