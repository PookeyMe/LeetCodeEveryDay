package Problem_23;

import java.util.ArrayList;
import java.util.List;

public class answer1 {
    public static void main()
    {
        ListNode l1=null;
    }
    /**
     * Definition for singly-linked list.
     */
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

      public ListNode mergeKLists(ListNode[] lists) {
            int len=lists.length;
            ListNode l4=null;
            if(len==0)
                return l4;
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                while(lists[i]!=null)
                {
                    list.add(lists[i].val);
                    lists[i]=lists[i].next;
                }
            }
            list.sort(Integer::compareTo);
            len=list.size();
            if(len==0)
                return null;
            ListNode l3=new ListNode(list.get(0));
            l4=l3;
            for(int i=1;i<len;i++)
            {
                l3.next=new ListNode(list.get(i));
                l3=l3.next;
            }
            return l4;

      }
}
