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
        if(head==null)
        return head;
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        if(k%len==0)
        return head;
        else
        k=k%len;
        int front=len-k;
        int index=1;
        ListNode mover=head;
        while(index!=front){
            mover=mover.next;
            index++;
        }
        ListNode newHead=mover.next;
        mover.next=null;
        temp.next=head;
        return newHead;
    }
}