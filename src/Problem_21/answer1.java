package Problem_21;

public class answer1 {
    public static void main(String[] args)
    {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        ListNode l2=new ListNode(1);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
        ListNode l3=mergeTwoLists(l1,l2);
        while(l3!=null)
        {
            System.out.print(l3.val+"->");
            l3=l3.next;
        }
    }
    /**
     * Definition for singly-linked list.
     */
     public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

      public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode l3=null;
         if(l1==null&&l2==null)
             return l3;
         else if(l1==null&&l2!=null)
             return l2;
         else if(l2==null&&l1!=null)
             return l1;
         if(l1.val<l2.val)
         {
             l3=l1;
             l1=l1.next;
         }
         else
         {
             l3=l2;
             l2=l2.next;
         }
         ListNode result=l3;
         while(l1!=null&&l2!=null)
         {
             if(l1.val<l2.val)
             {
                 l3.next=l1;
                 l1=l1.next;
             }
             else
             {
                 l3.next=l2;
                 l2=l2.next;
             }
             l3=l3.next;
         }
        if(l1==null)
            l3.next=l2;
        if(l2==null)
            l3.next=l1;
        return result;
      }
}
