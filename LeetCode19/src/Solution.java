import java.util.*;

 class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode begin=new ListNode(0);
        begin=head;
        ListNode be=head;
        if(head.next==null)
            return null;


        for(int i=0;i<n;i++)
        {
            begin=begin.next;
        }
        if(begin==null)
            return head.next;
        while(begin.next!=null)
        {
            be=be.next;
            begin=begin.next;
        }
        be.next=be.next.next;
        return head;


//        //Improved VERSION
//
//        ListNode be1=new ListNode(0);
//        ListNode begin=head;
//        ListNode be=be1;
//        be.next=head;
//        if(head.next==null)
//            return null;
//        for(int j=0;j<n;j++)
//        {
//            begin=begin.next;
//        }
//        while(begin!=null)
//        {
//            be=be.next;
//            begin=begin.next;
//        }
//        be.next=be.next.next;
//
//        return be1.next;




    }
}