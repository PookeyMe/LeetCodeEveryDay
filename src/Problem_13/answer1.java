package Problem_13;

public class answer1 {
    public static void main(String[] args)
    {
        String que="IX";
        System.out.println(romanToInt(que));
    }
    public static int romanToInt(String s) {
        int num = 0;
        for(int i = 0; i<s.length() - 1; i++){
            if(zg(s.charAt(i)) < zg(s.charAt(i+1))){
                num -= zg(s.charAt(i));
            }else{
                num += zg(s.charAt(i));
            }
        }
        num += zg(s.charAt(s.length()-1));
        return num;

    }
    public static int zg(char c){
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
