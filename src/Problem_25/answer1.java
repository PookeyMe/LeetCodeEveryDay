package Problem_25;

public class answer1 {
    public static void main(String[] args)
    {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(3);
        l1.next.next.next=new ListNode(4);
        l1.next.next.next.next=new ListNode(5);
        ListNode l2=reverseKGroup(l1,2);
        while(l2!=null)
        {
            System.out.println(l2.val);
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

      public static ListNode reverseKGroup(ListNode head, int k) {
          ListNode prev = null;
          ListNode cur = head;
          ListNode next = null;
          ListNode check = head;
          int canProceed = 0;
          int count = 0;
          // 检查链表长度是否满足翻转
          while (canProceed < k && check != null) {
              check = check.next;
              canProceed++;
          }
          // 满足条件，进行翻转
          if (canProceed == k) {
              while (count < k && cur != null) {
                  next = cur.next;
                  cur.next = prev;
                  prev = cur;
                  cur = next;
                  count++;
              }
              if (next != null) {
                  // head 为链表翻转后的尾节点
                  head.next = reverseKGroup(next, k);
              }
              // prev 为链表翻转后的头结点
              return prev;
          } else {
              // 不满住翻转条件，直接返回 head 即可
              return head;
          }
      }
}
