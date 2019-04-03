package Problem_936;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class answer1 {
    public static void main(String[] args)
    {
        String stamp="ffebb";

        String target="fffeffebbb";
        int[] result=movesToStamp(stamp,target);
        for(int i:result)
            System.out.println(i);
    }
    public static int[] movesToStamp(String stamp, String target) {
        int len1=stamp.length(),len2=target.length();
        char[] temp=target.toCharArray();
        int[] i1=new int[10*len2];
        int stepNum=0,leftWords=len2;
        for(int i=0;i<=len2-len1;i++)
        {
            if(target.substring(i,i+len1).equals(stamp))
            {
                stepNum++;
                i1[10*len2-stepNum]=i;
                for(int j=i;j<i+len1;j++) {
                    temp[j] = '?';
                }
                i+=len1-1;
                leftWords-=len1;
            }
        }
        if(stepNum==0)
            return new int[]{};
        while(leftWords>0)
        {
            boolean flag=false;
            for(int i=0;i<len2;i++)
            {
                if(temp[i]=='?'&&i>0&&temp[i-1]!='?')
                {
                    l1:for(int j=0;j<len1;j++)
                    {
                        if(temp[i-1]==stamp.charAt(j))
                        {
                            for(int j2=0;j2<=j;j2++) {
                                if (temp[i - j2 - 1] != stamp.charAt(j - j2))
                                    break l1;
                            }
                            for(int j2=0;j2<=j;j2++){
                                if(temp[i-j2-1]=='?')
                                    leftWords++;
                                temp[i-j2-1]='?';
                            }
                            flag=true;
                            leftWords=leftWords-j-1;
                            stepNum++;
                            i1[10*len2-stepNum]=i-j-1;
                        }
                    }
                }
                else if(temp[i]=='?'&&i<len2-1&&temp[i+1]!='?')
                {
                    l2:for(int j=0;j<len1;j++)
                    {
                        if(temp[i+1]==stamp.charAt(j)&&i+len1-j<len2)
                        {
                            for(int j2=0;j2<len1-j;j2++) {
                                if (temp[i + 1 + j2] != stamp.charAt(j + j2) && temp[i + 1 + j2] != '?')
                                    break l2;
                            }
                            for(int j2=0;j2<len1-j;j2++){
                                if(temp[i+1+j2]=='?')
                                    leftWords++;
                                temp[i+1+j2]='?';
                            }
                            flag=true;
                            leftWords=leftWords-len1+j;
                            stepNum++;
                            i1[10*len2-stepNum]=i+1-j;
                        }
                    }
                }
            }
            if(flag==false)
                return new int[]{};
        }
        int[] result=new int[stepNum];
        for(int i=0;i<stepNum;i++)
        {
            result[i]=i1[10*len2-stepNum+i];
        }
        return result;
    }
}
