package Problem_69;

public class answer1 {
    public static void main(String[] args)
    {
        System.out.println(mySqrt(4));
    }
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int i = 1;
        while (i <= x / i) {
            i++;
        }
        return i - 1;
    }
}
