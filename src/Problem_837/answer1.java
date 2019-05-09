package Problem_837;

public class answer1 {
    public static  void  main(String[] args) {
        System.out.println(new21Game(10,1,10));
    }
    public static double new21Game(int N, int K, int W) {
        double[] num=new double[K+W];
        double perc=0;
        for(int i=1;i<=W;i++)
        {
            num[i]=0.1;
        }
        while(perc<1) {
            double[] temp = new double[K];
            for (int i = 1; i < K; i++) {
                if(num[i]!=0) {
                    for (int j = 1; j <= W; j++) {
                        if(i+j<K)
                            temp[i + j] += num[i]/W;
                        else{
                            num[i+j]+=num[i]/W;
                            perc+=num[i]/W;
                        }
                    }
                }
            }
            for(int j=1;j<K;j++)
                num[j]=temp[j];
        }
        double sum1=0;
        double sum2=0;
        for(int i=K;i<=N;i++)
        {
            sum1+=num[i];
        }
        for(int i=N+1;i<K+W;i++)
        {
            sum2+=num[i];
        }
        return sum1*1.0/(sum1+sum2);
    }
}
