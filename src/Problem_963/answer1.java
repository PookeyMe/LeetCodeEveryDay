package Problem_963;

import java.util.Arrays;

public class answer1 {
    public static void main(String[] args)
    {
        int[][] points=new int[][]{{0,3},{1,2},{3,1},{1,3},{2,1}};
        Arrays.sort(points,0,1);
        for(int[] i1:points) {
            for (int i2 : i1)
                System.out.println(i2+" ");
            System.out.println();
        }
    }
    public static double minAreaFreeRect(int[][] points) {
        double result=0;
        int len=points.length;
        for(int i=0;i<len;i++)
        {
            Arrays.sort(points);
        }
        return 0;
    }
}
