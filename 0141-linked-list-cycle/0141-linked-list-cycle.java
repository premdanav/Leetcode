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
    public boolean hasCycle(ListNode head) {
       Set<ListNode> hs=new HashSet<>();
       ListNode trav=head;;
        
       while(trav!=null)
       {
           if(hs.contains(trav))
           {
               return true;
           }
           else
           {
               hs.add(trav);
               trav=trav.next;
           }
       }
       return false;

       

    }
}