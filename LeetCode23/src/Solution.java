import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists==null || lists.length==0) return null;
        PriorityQueue<ListNode> queue=new PriorityQueue<ListNode>( new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });



        ListNode begin = new ListNode(0);
        ListNode be=begin;

        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);

        while (!queue.isEmpty()){
            be.next=queue.poll();
            be=be.next;

            if (be.next!=null)
                queue.add(be.next);
        }
        return begin.next;


    }
}



//
//    int max=0;
//    ListNode it=null;
//     for(int i=0;i<lists.length;i++)
//        {
//        it=lists[i];
//
//        while(it.next!=null)
//        {
//        if(it.val>max)
//        max=it.val;
//
//        }
//        }
//        int [] map=new int [max+1];
//        for(int i=0;i<=max;i++)
//        {
//        map[i]=0;
//        }

//
//        ListNode start=new ListNode(0);
//        ListNode a=start;
//        for(int i=0;i<=max;i++)
//        {
//        for(int j=0;j<map[i];j++)
//        { ListNode item=new ListNode(i);
//        a.next=item;
//        a=a.next;
//
//
//        }
//
//        }
//        return start.next;