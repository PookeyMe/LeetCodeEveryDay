package Problem_2;

public class answer1 {
    public static void main(String[] args)
    {
        ListNode l1=new ListNode(1);
        l1.next=new ListNode(8);
        //l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(0);
        //l2.next=new ListNode(6);
        //l2.next.next=new ListNode(4);

        ListNode l3=addTwoNumbers(l1,l2);

        while(l3!=null)
        {
            System.out.println(l3.val);
            l3=l3.next;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag,sum;
        ListNode l3=new ListNode(0);
        ListNode temp=l3;
        while(l1!=null||l2!=null)
        {
            if(l1==null)
                l1=new ListNode(0);
            if(l2==null)
                l2=new ListNode(0);
            sum=l1.val+l2.val+temp.val;
            flag=sum/10;
            temp.val=sum%10;
            if(l1.next!=null||l2.next!=null||flag==1)
            temp.next=new ListNode(flag);
            l1=l1.next;
            l2=l2.next;
            temp=temp.next;
        }
        return l3;
    }


    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x;}
    }
}
