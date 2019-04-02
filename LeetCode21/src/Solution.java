class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

//use more space
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        // res.next = l1;
        ListNode re = res;
        ListNode f = l1;
        ListNode s = l2;
        while (f != null || s != null) {
            ListNode cur = null;
            if (s == null) {
                cur = f;
                f = f.next;
            } else if (f == null) {
                cur = s;
                s = s.next;
            } else if (f.val < s.val) {
                cur = f;
                f = f.next;
            } else {
                cur = s;
                s = s.next;
            }
            re.next=cur;
            re=re.next;


        }
        return res.next;

    }
}