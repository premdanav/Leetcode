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
    public int pairSum(ListNode head) {
        if(head==null)
            return head.val;
        List<Integer> arr=new ArrayList<>();
    
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        
        int n=arr.size();
        if(n<=2)
        {
            return arr.get(0)+arr.get(1);
        }
       
        int max=0;
        for(int i=0;i<(n/2);i++)
        {
          int  sum=arr.get(i)+arr.get(n-1-i);
            if(sum>max)
                max=sum;
        }
        return max;
        
    }
}