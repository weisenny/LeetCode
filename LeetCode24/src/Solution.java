import java.util.*;

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public static ListNode plusAB(ListNode a, ListNode b) {
        int numa=0;
        int i=0;
        while(a!=null)

        {
            numa=numa+a.val*(int)Math.pow(10,i);
            a=a.next;i++;
        }
        int numb=0;
        i=0;
        while(b!=null)

        {
            numb=numb+b.val*(int)Math.pow(10,i);
            b=b.next;i++;
        }
        int sum=numa+numb;
        ListNode start=new ListNode(0);
        ListNode st=start;


        while(sum/10!=0)
        {
            ListNode ln=new ListNode(sum%10);
            sum=sum/10;
            st.next=ln;
            st=st.next;

        }
        ListNode ln=new ListNode(sum);

        st.next=ln;
        st=st.next;


        return start.next;


    }
    public static void main (String [] args){
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        a.next=b;
        b.next=c;

        ListNode a1=new ListNode(4);
        ListNode b1=new ListNode(2);
        ListNode c1=new ListNode(1);
        a1.next=b1;
        b1.next=c1;
       System.out.println(plusAB(a,a1).val);
        System.out.println(plusAB(a,a1).next.val);
        System.out.println(plusAB(a,a1).next.next.val);
        //System.out.println(plusAB(a,a1).next.next.next.val);



    }
}