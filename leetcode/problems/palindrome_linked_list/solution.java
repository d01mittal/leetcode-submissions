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
    public static ListNode reverse(ListNode Node){
        ListNode prev=null;
        while(Node!=null){
            ListNode nextNode=Node.next;
            Node.next=prev;
            prev=Node;
            Node=nextNode;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null)
        return false;
        if(head.next==null)
        return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null){
            if(second.val!=first.val) return false;
            second=second.next;
            first=first.next;
        }
        ListNode h=reverse(newHead);
        return true;
    }
}