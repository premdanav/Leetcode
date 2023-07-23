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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        if(list1==null && list2==null)
            return null;
     
     ListNode temp=list1,first=null,last=null;
     ListNode tail=list2;
     int index=0;
     while(temp!=null){
         if(index==a-1)
            first=temp;
         if(index==b+1)
            last=temp;
         temp=temp.next;
         index++;   
     }
    
    while(tail.next!=null){
             tail=tail.next;
         }
    first.next=list2;
    tail.next=last;
    return list1;


    }
}