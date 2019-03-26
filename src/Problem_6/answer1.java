package Problem_6;

public class answer1 {
    public static void main(String[] args)
    {
        String s="PAYPALISHIRING";
        String result=convert(s,3);
        System.out.println(result);
    }
    public static String convert(String s, int numRows) {
        if(numRows==1)
            return s;
        int len=s.length();
        int cycle=2*numRows-2;
        StringBuilder result=new StringBuilder();
        int cycTime=len/cycle;
        int cycLeft=len-cycTime*cycle;
        for(int i=1;i<=numRows;i++) {
            for(int j=0;j<cycTime;j++) {
                result.append(s.charAt(i-1+j*cycle));
                if(i!=1&&i!=numRows)
                    result.append(s.charAt(numRows-i+numRows-1+j*cycle));
            }
            if(cycLeft==0)
                continue;
            else if(i==1&&cycLeft>=1)
                result.append(s.charAt(cycTime*cycle));
            else if(i==numRows&&cycLeft>=numRows)
                result.append(s.charAt(numRows-1+cycTime*cycle));
            else if(i<=cycLeft&&cycLeft<=numRows)
                result.append(s.charAt(i-1+cycTime*cycle));
            else if(i>=numRows-(cycLeft-numRows)&&cycLeft>numRows) {
                result.append(s.charAt(i - 1 + cycTime * cycle));
                result.append(s.charAt(numRows-i+numRows-1+cycTime*cycle));
            }
            else if(i<=numRows-(cycLeft-numRows)&&cycLeft>numRows)
                result.append(s.charAt(i - 1 + cycTime * cycle));
        }
        return  result.toString();
    }
}
