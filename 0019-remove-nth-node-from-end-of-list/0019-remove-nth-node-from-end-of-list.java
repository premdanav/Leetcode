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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode trav=head;
        int length=0;

        while(trav!=null){
            length++;
            trav=trav.next;
        }
        if(length==1){
            head=null;
            return head;
        }
        int pointer=length-n;

        ListNode temp=head;
        while(pointer>1){
            temp=temp.next;
            pointer--;
        }

        if(pointer==0){
            return head.next;
        }
    
        ListNode tempNext=temp.next;
        temp.next=tempNext.next;
        tempNext.next=null;

        return head;
        



            
    }
}