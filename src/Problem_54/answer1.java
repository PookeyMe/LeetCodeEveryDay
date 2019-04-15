package Problem_54;

import java.util.ArrayList;
import java.util.List;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> L=new ArrayList<Integer>();
        int row=matrix.length;
        int col=0;
        if(row!=0) {
            col=matrix[0].length;
        }
        int r=0;//圈数
        int count=0;//计数
        int direction=3;// 0上 1下 2左 3右
        int x=0,y=0;//初始位置
        while(row!=0) {
            //读取方向为---右下左上
            switch(direction) {
                case 3:
                    L.add(matrix[x][y]);
                    y++;
                    if(y==col-r) {
                        y--;
                        x++;
                        direction=1;
                    }
                    break;
                case 1:
                    L.add(matrix[x][y]);
                    x++;
                    if(x==row-r) {
                        x--;
                        y--;
                        direction=2;
                    }
                    break;
                case 2:
                    L.add(matrix[x][y]);
                    y--;
                    if(y==r-1) {
                        y++;
                        x--;
                        direction=0;
                    }
                    break;
                case 0:
                    L.add(matrix[x][y]);
                    x--;
                    if(x==r) {
                        x++;
                        y++;
                        r++;//圈数+1
                        direction=3;
                    }
                    break;
            }
            count++;
            if(count==row*col)
                break;

        }
        return L;
    }
}
