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
    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
     }
    public ListNode removeNodes(ListNode head) {
        ListNode rev=reverseLinkedList(head);
        ListNode curr=rev;

        //removing next node which is greater than curr node 
        while(curr!=null && curr.next!=null){
            if(curr.val>curr.next.val){
                curr.next=curr.next.next;
            }
            else
            {
                curr=curr.next;
            }
        }

       return reverseLinkedList(rev);
    }

     
}