package Problem_12;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;

//undo
public class answer1 {
    public static void main(String[] args)
    {
        int num=3999;
        System.out.println(intToRoman(num));

    }
    public static String intToRoman(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] reps={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder res=new StringBuilder();
        for(int i=0; i<13; i++){
            while(num>=values[i]){
                num -= values[i];
                res.append(reps[i]);
            }
        }
        return res.toString();

    }
}
