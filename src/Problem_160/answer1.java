package Problem_160;

public class answer1 {
    public static void main(String[] args)
    {

    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1=headA;
        ListNode l2=headB;
        int len1=0;
        int len2=0;
        while(l1!=null) {
            len1++;
            l1=l1.next;
        }
        while(l2!=null) {
            len2++;
            l2=l2.next;
        }
        l1=headA;
        l2=headB;
        if(len1<len2) {
            for(int i=0;i<len2-len1;i++)
            {
                l2=l2.next;
            }
        }
        else
        {
            for(int i=0;i<len1-len2;i++)
            {
                l1=l1.next;
            }
        }
        while(l1!=null)
        {
            if(l1==l2)
                return l1;
            l1=l1.next;
            l2=l2.next;
        }
        return null;
    }
}
