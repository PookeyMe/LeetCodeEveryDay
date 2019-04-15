package Problem_441;

public class answer1 {
    public static void main(String[] args)
    {
        System.out.println(arrangeCoins(4));
    }
    public static int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(1 + 8 * (long) n)) / 2;
    }
}
