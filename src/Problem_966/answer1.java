package Problem_966;

import java.util.HashMap;

public class answer1 {
    public static void main(String[] args)
    {
        String[] wordList=new String[]{"KiTe","kite","hare","Hare"};
        String[] queries=new String[]{"kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"};
        String[] result=spellchecker(wordList,queries);
        for(String s:result)
            System.out.println(s);
    }
    public static String[] spellchecker(String[] wordlist, String[] queries) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        for(int i=0;i<wordlist.length;i++) {
            if(!hashMap.containsKey(replaceAEIOU(wordlist[i].toLowerCase())))
            hashMap.put(replaceAEIOU(wordlist[i].toLowerCase()), i);
        }
        for(int i=0;i<queries.length;i++)
        {
            if(hashMap.containsKey(replaceAEIOU(queries[i].toLowerCase())))
                queries[i] = wordlist[hashMap.get(replaceAEIOU(queries[i].toLowerCase()))];
            else
                queries[i]="";
        }
        return queries;
    }
    public static String replaceAEIOU(String s)
    {
        s=s.replace('a','.');
        s=s.replace('e','.');
        s=s.replace('i','.');
        s=s.replace('o','.');
        s=s.replace('u','.');
        return s;
    }
}
