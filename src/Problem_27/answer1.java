package Problem_27;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public int removeElement(int[] nums, int val) {
        int len=nums.length;
        int j=-1;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==val)
                continue;
            nums[++j]=nums[i];
        }
        return j+1;
    }
}
