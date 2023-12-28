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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)
        return null;
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode newHead=new ListNode(-1);
        ListNode temp=newHead;
        int carry=0;
        while(t1!=null||t2!=null){
            int sum=carry;
            if(t1!=null) sum+=t1.val;
            if(t2!=null) sum+=t2.val;
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
            temp.next=newNode;
            temp=newNode;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(carry);
            temp.next=newNode;
        }
        return newHead.next;
    }
}