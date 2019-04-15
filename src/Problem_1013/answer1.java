package Problem_1013;

public class answer1 {
    public static void main(String[] args)
    {
        int[] A=new int[]{3,3,6,5,-2,2,5,1,-9,4};
        int[] B=new int[]{0,2,1,-6,6,7,9,-1,2,0,1};
        int[] C=new int[]{18,12,-18,18,-19,-1,10,10};
        System.out.println(canThreePartsEqualSum(B));
    }
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum=0;
        for(int i:A)
            sum+=i;
        if(sum%3!=0)
            return false;
        int sum1=0,sum2=-sum/3;
        for(int i:A)
        {
            if(sum1!=sum/3)
                sum1 += i;
            if(sum2!=sum/3)
                sum2+=i;
            if(sum1==sum2)
                return true;
        }
        return false;
    }
}
