package Problem_35;

public class answer1 {
    public static void main(String[] args)
    {
        int[] nums=new int[]{1,2,3,4,5};
        System.out.println(searchInsert(nums,7));
    }
    public static int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length,mid;
        if(target<nums[0])
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;
        while(left<right)
        {
            mid=(left+right)/2;
            if(nums[mid]==target||(nums[mid]>target&&nums[mid-1]<target))
                return mid;
            else if(nums[mid]<target&&nums[mid+1]>target)
                return mid+1;
            else if(nums[mid]>target)
                right=mid;
            else
                left=mid;
        }
        return 0;
    }
}
