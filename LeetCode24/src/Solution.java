class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {


        if (head == null) return null;


        ListNode begin = new ListNode(0);
        begin.next = head;
        ListNode be = begin;
        while (be.next != null && be.next.next != null) {
            ListNode temp2 = be.next.next;
            ListNode temp1 = be.next;
            ListNode temp3 = be.next.next.next;

            be.next = temp2;
            temp2.next = temp1;
            temp1.next = temp3;
            be = be.next.next;


        }


        return begin.next;


    }
}

