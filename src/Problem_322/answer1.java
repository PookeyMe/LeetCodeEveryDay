package Problem_322;

public class answer1 {
    public static void main(String[] args)
    {
        int[] nums=new int[]{1,2147483647};
        System.out.println(coinChange(nums,2));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] result=new int[amount+1];
        if(amount==0)
            return 0;
        for(int i=0;i<coins.length;i++)
            if(coins[i]<=amount)
            result[coins[i]]=1;
        for(int i=0;i<coins.length;i++)
        {
            for(int j=0;j<amount;j++)
            {
                if(result[j]!=0&&coins[i]+j<=amount&&coins[i]+j>0)
                {
                    if(result[coins[i]+j]==0)
                        result[coins[i]+j]=result[j]+1;
                    else
                        result[coins[i]+j]=result[coins[i]+j]<result[j]+1?result[coins[i]+j]:result[j]+1;
                }
            }
        }
        if(result[amount]==0)
            return -1;
        return result[amount];
    }

}
