/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class MergeSortedArrays {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode out=new ListNode();
        ListNode ls;
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        while(list1.next!=null && list2.next!=null)
        {
            ls=new ListNode(0,new ListNode());
            if(out==null)
                out=ls;
            if(list1.val<list2.val)
            {
                ls.val=list1.val;

                SSystem.out.println();
                ls=ls.next;
                list1=list1.next;
            }
            else
            {
                ls.val=list2.val;
                ls=ls.next;
                list2=list2.next;
            }
        }
        return out;

    }

}