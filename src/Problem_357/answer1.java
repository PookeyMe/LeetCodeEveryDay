package Problem_357;

public class answer1 {
    public static void main(String[] args)
    {
        System.out.println(countNumbersWithUniqueDigits(2));
    }
    public static int countNumbersWithUniqueDigits(int n) {
        int allNum=0;
        n=n>10?10:n;//n>10后不可能有不重复的
        for(int i=0;i<n;i++)
        {
            int thisNum=9;
            for(int j=0;j<i;j++)
                thisNum*=9-j;
            allNum+=thisNum;
        }
        return allNum+1;
    }
}
