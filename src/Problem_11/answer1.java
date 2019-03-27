package Problem_11;

public class answer1 {
    public static void main(String[] args)
    {
        int[] que=new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(que));
    }
    public static int maxArea(int[] height) {
        int len = height.length;
        int left = 0, right = len - 1, i;
        int emptyNum = 0;
        int minTwo = Math.min(height[left], height[right]), minLeft, minRight;
        int result = (right - left) * minTwo, tempLeft, tempRight;
        while (true) {
            int maxarea = 0, l = 0, r = height.length - 1;
            while (l < r) {
                maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
                if (height[l] < height[r])
                    l++;
                else
                    r--;
            }
            return maxarea;
        }
    }
}


