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
    public ListNode middleNode(ListNode head) {
          if(head==null)
          return null;
        ListNode rabit=head;
        ListNode tortoise=head;
        while(rabit!=null && rabit.next!=null){ 
            tortoise=tortoise.next;
              rabit=rabit.next.next;
        }
        return tortoise;
    }
}