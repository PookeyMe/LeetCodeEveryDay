package Problem_3;

public class answer1 {
    public static void main(String[] agrs)
    {
        String s="";
        int result=lengthOfLongestSubstring(s);
        System.out.println(result);
    }
    public static int lengthOfLongestSubstring(String s) {
        int[] every=new int[128];
        int len=s.length();
        int result=0;
        int temp=0;
        for(int i=0;i<len;i++)
        {
            temp=Math.max(temp,every[s.charAt(i)]);
            result=Math.max(result,i-temp+1);
            every[s.charAt(i)]=i+1;
        }
        return len==1?1:result;
    }
}
