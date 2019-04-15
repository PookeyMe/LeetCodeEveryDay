package Problem_876;

import java.util.List;

public class answer1 {
    public static void main(String[] args)
    {

    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        while(head!=null&&head.next!=null)
        {
            slow=slow.next;
            head=head.next;
            if(head.next!=null)
                head=head.next;
        }
        return slow;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
