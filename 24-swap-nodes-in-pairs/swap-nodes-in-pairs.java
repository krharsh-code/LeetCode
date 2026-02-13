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
    public ListNode swapPairs(ListNode head) {
       ListNode node=new ListNode(0);
       node.next=head;

       ListNode prev=node;
       while(prev.next!=null && prev.next.next!=null){
        ListNode f=prev.next;
        ListNode s=f.next;
 
        f.next=s.next;
        s.next=f;
        prev.next=s;
        
        prev=f;
       }  
       return node.next;
       
    }
}