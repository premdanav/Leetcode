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
    public ListNode mergeNodes(ListNode head) {
        if(head==null)
            return head;
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        
        ListNode curr=head.next;
        
        while(curr!=null)
        {
            int sum=0;
            while(curr.val!=0)
            {
                sum+=curr.val;
                curr=curr.next;
            }
            
            ListNode newNode=new ListNode(sum);
            temp.next=newNode;
            temp=temp.next;
            sum=0; 
            curr=curr.next;
        }
        
        return dummy.next;
    }
}