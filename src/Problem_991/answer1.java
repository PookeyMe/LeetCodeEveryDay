package Problem_991;

public class answer1 {
    public static void main(String[] args)
    {
        System.out.println(brokenCalc(1,1000));
    }
    public static int brokenCalc(int X, int Y) {
        int result = 0;
        while(X < Y)
        {
            if((Y % 2) == 0)
            {
                Y /= 2;
                result++;
            }
            else
            {
                Y = (Y + 1) / 2;
                result += 2;
            }
        }
        return result + X - Y;
    }
}
