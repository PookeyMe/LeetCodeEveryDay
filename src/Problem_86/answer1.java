package Problem_86;

public class answer1 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(2);
        l1.next.next.next.next=new ListNode(2);
        ListNode l2=partition(l1,3);
        while(l2!=null) {
            System.out.println(l2.val);
            l2=l2.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode lowerHead=new ListNode(0);
        ListNode highHead=new ListNode(0);
        ListNode l1=lowerHead;
        ListNode l2=highHead;
        if(head==null)
            return head;
        while(head!=null)
        {
            if(head.val<x)
            {
                l1.next=head;
                l1=l1.next;
            }
            else
            {
                l2.next=head;
                l2=l2.next;
            }
            head=head.next;
        }
        l1.next=highHead.next;
        l2.next=null;
        return lowerHead.next;
    }
}
