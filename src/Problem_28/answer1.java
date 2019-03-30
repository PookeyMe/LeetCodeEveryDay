package Problem_28;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public int strStr(String haystack, String needle) {
        if(needle.equals(""))
            return 0;
        int i;
        int len = needle.length();
        for(i=0;i<haystack.length()-len+1;i++){
            if(haystack.substring(i,i+len).equals(needle))
                return i;
        }
        return -1;
    }
}
