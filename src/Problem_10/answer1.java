package Problem_10;

public class answer1 {
    public static void main(String[] args)
    {
        String s="aa";
        String p="a";
        System.out.println(isMatch(s,p));
    }
    public static boolean isMatch(String s, String p) {
        return  s.matches(p);
    }
}
