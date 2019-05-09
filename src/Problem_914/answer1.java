package Problem_914;

import java.util.HashMap;
import java.util.Map;

public class answer1 {
    public static void main(String[] args)
    {
        int[] nums=new int[]{0,0,0,1,1,1,2,2,2};
        System.out.println(hasGroupsSizeX(nums));
    }
    public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> map = new HashMap();
        //按不同数字分组，值为出现次数
        for(int i:deck){
            map.put(i,map.get(i)==null?1:map.get(i)+1);
        }
        int min = map.get(deck[0]);
        //遍历找出最小的次数
        for(int i:map.keySet()){
            min = min<map.get(i)?min:map.get(i);
        }
        //每个数字出现的次数与最小的次数应该有最大公约数
        for(int i:map.keySet()){
            if(gys(map.get(i),min)<=1) return false;
        }
        return true;
    }

    private static int gys(int p,int q){
        if(q==0) return p;
        return gys(q,p%q);
    }
}
