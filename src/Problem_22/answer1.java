package Problem_22;

import java.util.ArrayList;
import java.util.List;

public class answer1 {
    public static void main(String[] args)
        {
            List<String> list=generateParenthesis(1);
            for(String s:list)
            {
                System.out.println(s);
            }
        }
        public static List<String> generateParenthesis(int n) {
            List<String> list=new ArrayList<>();
            if(n<=0)
                return list;
            if(n==1)
                list.add("()");
            int[] pos=new int[n];
            int[] lastPos=new int[n];
            for(int i=0;i<n;i++) {
                pos[i] = i;
                lastPos[i]=2*i ;
            }
            while(pos[0]==0)
            {
                char[] temp=new char[n*2];
                for(int i=n-1;i>=0;i--) {
                    if (i > 0 && pos[i] > lastPos[i]) {
                        pos[i - 1]++;
                        for (int j = i; j < n; j++)
                            pos[j] = pos[j - 1] + 1;
                    }
                }
                for(int i=n-1;i>=0;i--)
                {
                    temp[pos[i]]='(';
                }
                pos[n-1]++;

                for(int i=0;i<2*n;i++) {
                    if (temp[i] != '(')
                        temp[i] = ')';
                }
                String str=new String(temp);
                list.add(str);
            }
            list.remove(list.size()-1);
            return list;
    }
}
