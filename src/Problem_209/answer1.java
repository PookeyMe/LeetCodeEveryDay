package Problem_209;

public class answer1 {
    public static void main(String[] args)
    {
        int[] nums=new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        int result=nums.length+1;
        int l=0,r=0;
        int sum=0;
        while(l<nums.length)
        {
            if(sum<s&&r<nums.length){
                sum+=nums[r];
                r++;
            }
            else{
                sum-=nums[l];
                l++;
            }
            if(sum>=s)
                result=result<r-l?result:r-l;
        }
        if(sum<s&&result==nums.length+1)
            return 0;
        return result;
    }
}
