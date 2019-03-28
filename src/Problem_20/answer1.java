package Problem_20;

public class answer1 {
    public static void main(String[] args)
    {
        String str="[{([{[]}])}]";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        int len=s.length();
        StringBuilder str=new StringBuilder(s);
        if(len%2==1)
            return false;
        boolean flag;
        do
        {
            len=str.length();
            if(len==0)
                return true;
            flag=false;
            for(int i=0;i<len-1;i++)
            {
                String temp=str.substring(i,i+2);
                if(temp.equals("()")||temp.equals("{}")||temp.equals("[]")) {
                    str.replace(i,i+2, "");
                    flag=true;
                    i=i-1;
                    len-=2;
                }
            }
        }while(flag==true);
        return false;
    }
}
