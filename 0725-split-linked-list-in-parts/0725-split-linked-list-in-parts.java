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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int size=n/k;
        int extra=n%k;
        ListNode[] ans=new ListNode[k];
        ListNode temp2=head;
        for(int i=0;i<k;i++){
            ans[i]=temp2;
            int ps=size;
            if(extra>0){
                ps++;
                extra--;
            }
            for(int j=1;j<ps;j++){
                if(temp2!=null){
                    temp2=temp2.next;
                }
            }
            if(temp2!=null){
                ListNode np=temp2.next;
                temp2.next=null;
                temp2=np;
            }
            }
        return ans;

    }
}