package Problem_17;


import java.util.ArrayList;
import java.util.List;

public class answer1 {
    public static void main(String[] args)
    {
        String digits="2";
        List<String> list=letterCombinations(digits);
        for(String s:list)
            System.out.println(s);
    }
    public static List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        List<String> result=new ArrayList<>();
        int len=digits.length();
        if (len<=0)
            return result;
        int leftWords[] =new int[len];
        for(int i=0;i<len;i++)
        {
            switch (digits.charAt(i))
            {
                case '2':list.add("abc");leftWords[i]=3;break;
                case '3':list.add("def");leftWords[i]=3;break;
                case '4':list.add("ghi");leftWords[i]=3;break;
                case '5':list.add("jkl");leftWords[i]=3;break;
                case '6':list.add("mno");leftWords[i]=3;break;
                case '7':list.add("pqrs");leftWords[i]=4;break;
                case '8':list.add("tuv");leftWords[i]=3;break;
                case '9':list.add("wxyz");leftWords[i]=4;break;

            }
        }
        int[] leftWords2=leftWords.clone();
        while(leftWords[0]>0)
        {
            StringBuilder temp=new StringBuilder();
            for(int i=0;i<len;i++)
                temp.append(list.get(i).charAt(leftWords2[i]-leftWords[i]));
            result.add(temp.toString());
            leftWords[len-1]--;
            for(int i=len-1;i>0;i--)
            {
                if(leftWords[i]<=0)
                {
                    leftWords[i-1]--;
                    leftWords[i]=leftWords2[i];
                }
            }
        }
        return result;
    }

}
