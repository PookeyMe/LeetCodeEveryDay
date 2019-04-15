package Problem_174;

public class answer1 {
    public static void main(String[] args)
    {
        int[][] ints=new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(calculateMinimumHP(ints));
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        int len1=dungeon.length;
        int len2=dungeon[0].length;
        int[][] result=new int[len1][len2];
        for(int i=len1-1;i>=0;i--)
        {
            for(int j=len2-1;j>=0;j--)
            {
                if(i==len1-1&&j==len2-1)
                    result[len1-1][len2-1]=-dungeon[len1-1][len2-1];
                else if(i==len1-1&&j<len2-1)
                    result[i][j]=result[i][j+1]-dungeon[i][j];
                else if(j==len2-1&&i<len1-1)
                    result[i][j]=result[i+1][j]-dungeon[i][j];
                else {
                    result[i][j] = result[i + 1][j] > result[i][j + 1] ? result[i][j + 1] : result[i + 1][j];
                    result[i][j] -= dungeon[i][j];
                }
                if(result[i][j]<0)
                    result[i][j]=0;
            }
        }
        return result[0][0]+1;
    }
}
