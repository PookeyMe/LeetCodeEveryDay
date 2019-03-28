package Problem_24;

public class answer1 {
    public static void main(String[] args)
    {
        ListNode l1=new ListNode(1);
        for(int i=2;i<=4;i++)
        {
            l1.next=new ListNode(i);
            l1=l1.next;
        }
        ListNode l2=swapPairs(l1);
        while(l2!=null) {
            System.out.println(l2.val + "->");
            l2=l2.next;
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

      public static ListNode swapPairs(ListNode head) {
          if(head == null || head.next == null){
              return head;
          }
          ListNode next = head.next;
          head.next = swapPairs(next.next);
          next.next = head;
          return next;
      }
}
