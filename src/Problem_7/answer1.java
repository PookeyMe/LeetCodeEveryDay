package Problem_7;

public class answer1 {
    public static void main(String[] args)
    {
        int num=1534236469;
        int newNum=reverse(num);
        System.out.println(newNum);
    }
    public static int reverse(int x) {
        int flag=x<0?-1:1;
        int num=Math.abs(x);
        StringBuilder newNum=new StringBuilder();
        newNum.append(num);
        newNum.reverse();
        try {
            int result = Integer.parseInt(newNum.toString());
            return flag*result;
        }
        catch (NumberFormatException e)
        {
            return 0;
        }

    }

}
