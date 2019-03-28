package Problem_19;

public class answer1 {
    public static void main(String[] args)
    {
        ListNode l1=new ListNode(1);
        ListNode l2=l1;
        /*
        for(int i=2;i<=5;i++)
        {
            l2.next=new ListNode(i);
            l2=l2.next;
        }
        */
        ListNode l3=removeNthFromEnd(l1,1);
        while(l3!=null) {
            System.out.println(l3.val);
            l3=l3.next;
        }
    }
    //Definition for singly-linked list.
    public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1=head,l2=head;
        int dis=0;
        while(dis!=n)
        {
            l2=l2.next;
            dis++;
        }
        try {
            while (l2.next != null) {
                l2 = l2.next;
                l1 = l1.next;
            }
        }
        catch (Exception e) {
            return null;
        }
        l1.next=l1.next.next;
        return head;
    }
}
