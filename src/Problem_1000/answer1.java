package Problem_1000;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static  int mergeStones(int[] stones, int K) {
        return digui(stones,K,stones.length);
    }
    public static  int digui(int[] stones, int K,int leftLen) {
        int result=Integer.MAX_VALUE;
        int tempResult=0;
        if(leftLen<K&&leftLen>1)
            return -1;
        if(leftLen==1) {
            return result<tempResult?result:tempResult;
        }
        for(int i=0;i<leftLen-K+1;i++)
        {
            for(int j=i+1;j<i+K;j++)
                stones[i]+=stones[j];
            for(int k=i+K;k<leftLen;k++)
                stones[k-K+1]=stones[k];
            tempResult+=stones[i];
            leftLen=leftLen-K+1;
            digui(stones,K,leftLen);
        }
        return 0;
    }
}
