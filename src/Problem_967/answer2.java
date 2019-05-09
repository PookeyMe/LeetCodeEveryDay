package Problem_967;

import java.util.HashSet;

public class answer2 {
    class Solution {
        public int[] numsSameConsecDiff(int N, int K) {
            if(N==1)return new int[]{0,1,2,3,4,5,6,7,8,9};
            HashSet<Integer> temp=new HashSet<Integer>();
            for(int i=1;i<=9;i++)
                dfs(temp,i,N,K,0);
            int []ans=new int[temp.size()];
            int i=0;
            for(int t:temp)
                ans[i++]=t;
            return ans;
        }
        public void dfs(HashSet<Integer> res,int pre,int N,int K,int num){
            if(N==0){
                res.add(num);
                return;
            }
            num+=pre*(int)(Math.pow(10,N-1));
            for(int i=0;i<=9;i++)
                if(Math.abs(i-pre)==K){
                    dfs(res,i,N-1,K,num);
                }
        }
    }
}
