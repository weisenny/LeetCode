class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;

        while (fast != null) {

            if (fast.next == null)
                return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = slow.next;
               // temp = temp.next;
                while (fast != slow) {
                    slow = slow.next;
                    temp = temp.next;

                }
                return temp;

            }

        }
        return null;

    }
}