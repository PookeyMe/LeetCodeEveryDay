package Problem_825;

import java.util.Arrays;

public class answer1 {
    public static void main(String[] args)
    {
        int[] ages=new int[]{73,106,39,6,26,15,30,100,71,35,46,112,6,60,110};
        System.out.println(numFriendRequests(ages));
    }
    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int num=0;
        for(int i=ages.length-1;i>0;i--)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(ages[j]<=0.5*ages[i]+7)
                    break;
                if(ages[i]==ages[j])
                    num++;
                num++;
            }
        }
        return num;
    }
}
