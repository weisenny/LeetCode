import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

class Solution {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        int i = 0, flag = 0;
        ListNode item = newhead;
        while (i < k) {
            //System.out.println(item.val);

            if (item == null) {

                flag = 1;
                break;

            }
            item = item.next;
            i++;

        }
        System.out.println(flag);
        if (flag == 0)
            reverseList(k, newhead, item);
        System.out.println("dd");
        printres(newhead);
        return newhead.next;


    }


    private static void reverseList(int k, ListNode prehead, ListNode end) {
        //System.out.println(prehead.val+" "+end.val);
        if(end==null)
            return;

        ListNode head_newtail = prehead.next;
        ListNode next = head_newtail.next;
        ListNode tail=end.next;


        while (next != tail) {
            ListNode temp = prehead.next;
           // ListNode temp1 = prehead.next;
            prehead.next = next;
            next = next.next;
            head_newtail.next=next;
            prehead.next.next = temp;


        }
        printres(prehead);
        head_newtail.next = tail ;
        System.out.println(head_newtail.val+"dd");
        //printres(prehead);
        int i = 0, flag = 0;
        ListNode item = head_newtail;
        System.out.println(item.val+"item");
        printres(item);

        while (i < k) {
            if (item == null) {
                flag = 1;
                break;

            }
            item = item.next;
            i++;

        }

        if (item != null&&flag == 0)
            reverseList(k, head_newtail, item);

    }

    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>();
        ListNode h = new ListNode(0);
        ListNode head = h;

        for (int i = 1; i < 2; i++) {
            ListNode h1 = new ListNode(i);
            h.next = h1;
            h = h.next;
        }
        // printres(head);

        printres(reverseKGroup(head.next, 2));


    }

    static void printres(ListNode th) {
        ListNode l = th;
        while (l != null) {
            System.out.print(l.val + "->");
            l = l.next;

        }
        System.out.println(" ");

    }
}