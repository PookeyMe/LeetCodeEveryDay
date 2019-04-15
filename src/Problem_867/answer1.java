package Problem_867;

public class answer1 {
    public static void main(String[] args)
    {
        int[][] A=new int[][]{};
        int[][] B=transpose(A);
        for(int[] i1:B)
        {
            for(int i2:i1)
            {
                System.out.print(i2+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] A) {
        int len1=A.length;
        if(len1==0)
            return null;
        int len2=A[0].length;
        int[][] newArray=new int[len2][len1];
        for(int i=0;i<len1;i++)
        {
            for(int j=0;j<len2;j++)
            {
                newArray[j][i]=A[i][j];
            }
        }
        return newArray;
    }

}
