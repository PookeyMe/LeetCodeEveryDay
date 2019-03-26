package Problem_4;


import java.util.ArrayList;

public class answer1 {
    public static void main(String[] args)
    {
        int[] num1=new int[]{};
        int[] num2=new int[]{3,4};
        double result=findMedianSortedArrays(num1,num2);
        System.out.println(result);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] nums3;
        int i1=0,i2=0;
        int flag=(len1+len2)%2;
        int middle=(len1+len2)/2;
        double middleNum=0.0;
        if(len1==0)
            nums3=nums2;
        else if(len2==0)
            nums3=nums1;
        else {
            nums3 = new int[middle + 1];
            for (int i = 0; i <middle + 1; i++) {
                if(i1==-1)
                {
                    nums3[i] = nums2[i2];
                    i2++;
                }
                else if(i2==-1)
                {
                    nums3[i] = nums1[i1];
                    i1++;
                }
                else {
                    if (nums1[i1] > nums2[i2]) {
                        nums3[i] = nums2[i2];
                        i2 = i2 >= len2 - 1 ? -1 : (i2 + 1);
                    } else {
                        nums3[i] = nums1[i1];
                        i1 = i1 >= len1 - 1 ? -1 : (i1 + 1);
                    }
                }

            }
        }
        if(flag==1)
            middleNum=nums3[middle];
        else
            middleNum=(nums3[middle-1]+nums3[middle])/2.0;
        return middleNum;
    }
}
