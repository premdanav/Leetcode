/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;
        
        //traverse fast poiner two steps and slow poiner one step
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
         //if they meet then traverse slow pointer and head pointer at same speed 
         //and when they meet they meet at same point
            if(fast==slow){
                while(head!=slow){
                    head=head.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}