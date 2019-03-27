package Problem_14;

public class answer1 {
    public static void main(String[] args)
    {
        String[] s=new String[]{};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] strs) {
        int i=0;
        int len=strs.length;
        if(len==0)
            return "";
        int j;
        StringBuilder result=new StringBuilder();
        int minLength=Integer.MAX_VALUE;
        for(String s:strs)
            if(s.length()<minLength)
                minLength=s.length();
        while(true)
        {
            if(i>=minLength)
                return result.toString();
            char a=strs[0].charAt(i);
            for(j=1;j<len;j++)
            {
                if(strs[j].charAt(i)!=a)
                    return result.toString();
            }
            result.append(a);
            i++;
        }
    }

}
