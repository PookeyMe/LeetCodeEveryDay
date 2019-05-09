package Problem_518;

public class answer1 {
    public static void main(String[] args)
    {
        int[] nums=new int[]{1,2,5};
        System.out.println(change(5,nums));
    }
    public static int change(int amount, int[] coins) {
        int[] result=new int[amount+1];
        result[0]=1;
        for(int i=0;i<coins.length;i++)
        {
            for(int j=0;j<=amount;j++)
            {
                if(j+coins[i]<=amount)
                result[j+coins[i]]+=result[j];
            }
        }
        return result[amount];
    }
}
