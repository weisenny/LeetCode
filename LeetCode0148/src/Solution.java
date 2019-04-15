class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
//
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(4);
//        ListNode l2 = new ListNode(1);
//        ListNode l3 = new ListNode(2);
//        ListNode l4 = new ListNode(3);
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//
//        ListNode l=sortList(l1);
//        p(l);
//    }
//    public static void p (ListNode l1){
//        ListNode l=l1;
//
//        while(l!=null)
//        {
//            System.out.print(l.val+"->");
//            l=l.next;
//        }
//        System.out.println( );
//    }


class Solution {


    public static  ListNode sortList(ListNode head) {
        if(head==null)
            return null;
        ListNode ln = head;
        int max = 0;
        while (ln != null) {
            ln = ln.next;
            max++;
        }
        // System.out.print(max);
        if (max == 1)
            return head;
        ListNode half = head;
        ListNode old = head;
        ln = head;
        for (int i = 1; i < max / 2 ; i++) {
            ln = ln.next;
        }
        half = ln.next;
        ln.next = null;


        ListNode l3=sortList(old);
        ListNode l4=sortList(half);

        ListNode ll=mergeTwoLists(l3, l4);

        return ll;

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}