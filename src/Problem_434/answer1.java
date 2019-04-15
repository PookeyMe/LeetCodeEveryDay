package Problem_434;

public class answer1 {
    public static void main(String[] args)
    {
        System.out.println(countSegments("Hello, my name is John"));
    }
    public static int countSegments(String s) {
        int wordsNum=0;
        int i=0,len=s.length();
        while(i<len)
        {
            if(s.charAt(i)!=' ')
                wordsNum++;
            while(i<len&&s.charAt(i)!=' ')
                i++;
            while(i<len&&s.charAt(i)==' ')
                i++;
        }
        return wordsNum;
    }
}
