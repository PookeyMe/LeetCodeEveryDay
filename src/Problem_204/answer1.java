package Problem_204;

public class answer1 {
    public static void main(String[] args)
    {
        System.out.println(countPrimes(2));
    }
    public static int countPrimes(int n) {
        if(n<=2)
            return 0;
        int[] allNum=new int[n];
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(allNum[i]==1)
                continue;
            for(int j=i*2;j<n;j+=i)
                allNum[j] = 1;
        }
        int result=0;
        for(int i=2;i<n;i++)
            if(allNum[i]==0)
                result++;
        return result;
    }
}
