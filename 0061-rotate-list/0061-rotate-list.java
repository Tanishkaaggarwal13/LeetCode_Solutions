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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        int len=1;
        while(temp.next!=null){
            len++;
            temp=temp.next;}
            temp.next=head;
        
        ListNode temp2=head;
        k=k%len;
        int n=len-k-1; 
        // k=k%len;
        
        int i=0;
        while(i<n){
            temp2=temp2.next;
            i++;
        }
        ListNode newhead=temp2.next;
        temp2.next=null;

        return newhead;
    }}