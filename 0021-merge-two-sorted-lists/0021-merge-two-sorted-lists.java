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
 import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode trav1=head1;
        ListNode trav2=head2;
        ListNode temp;
        ListNode dummy=new ListNode();
        ListNode current=dummy;

        while(trav1!=null && trav2!=null){
            if(trav1.val<=trav2.val){
                temp=new ListNode(trav1.val);
                current.next=temp;
                trav1=trav1.next;
                current=current.next;
            }
            else{
                temp=new ListNode(trav2.val);
                current.next=temp;
                trav2=trav2.next;
                current=current.next;
            }
        }

        while(trav1!=null){
                temp=new ListNode(trav1.val);
                 current.next=temp;
                trav1=trav1.next;
                current=current.next;
        }    

        while(trav2!=null)
        {
                 temp=new ListNode(trav2.val);
                current.next=temp;
                trav2=trav2.next;
                current=current.next;
        }  

        return dummy.next;  
    }
}