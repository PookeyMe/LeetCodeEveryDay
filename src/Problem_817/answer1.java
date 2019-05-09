package Problem_817;

import java.util.HashSet;
import java.util.Set;

public class answer1 {
    public static void main(String[] args) {

    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int numComponents(ListNode head, int[] G) {
        Set<Integer> set=new HashSet<>();
        boolean isFlag=false;
        int result=0;
        for(int i:G)
            set.add(i);
        while(head!=null)
        {
            if(set.contains(head.val)&&isFlag==false) {
                isFlag = true;
                result++;
            }
            else if(isFlag==true&&!set.contains(head.val))
                isFlag=false;
            head=head.next;
        }
        return result;
    }
}
