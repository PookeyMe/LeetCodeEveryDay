package Problem_206;

public class answer1 {
    public static void main(String[] args)
    {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1=reverseList(l1);
        while(l1!=null)
        {
            System.out.println(l1.val);
            l1=l1.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode p=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;

    }
    /**
     * Definition for singly-linked list.
     */
     public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

}
