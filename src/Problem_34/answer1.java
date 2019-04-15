package Problem_34;

public class answer1 {
    public static void main(String[] args)
    {
        int[] ints=new int[]{5,7,7,8,8,10};
        int[] res=searchRange(ints,6);
        for(int i:res)
            System.out.println(i+"　");
    }
    public static int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int[]answer = new int[] {-1,-1};

        while(s<=e) {
            int mid=(s+e)/2;
            if(target==nums[mid]) {
                int i=mid;
                int j=mid;
                while(i>=0||j<=nums.length-1) {
                    int sum=0;
                    if(j<=nums.length-1&&nums[j]==target) {
                        j++;
                        sum++;
                    }
                    if(i>=0&&nums[i]==target) {
                        i--;
                        sum++;
                    }
                    if(sum==0) {
                        answer=new int[] {i+1,j-1};
                        return answer;
                    }
                }
                answer=new int[] {i+1,j-1};
                return answer;
            }else if(target>nums[mid]) {
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return answer;
    }
}
