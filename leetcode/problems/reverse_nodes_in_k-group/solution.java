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
    public static ListNode findkthNode(ListNode temp,int k){
        k-=1;
        while(temp!=null&&k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public static ListNode reverse(ListNode newNode){
        ListNode prev=null;
        ListNode currNode=newNode;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=nextNode;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
        return head;
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode kthNode=findkthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null)
                prevNode.next=temp;
                break;
            }
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }
            else
            prevNode.next=kthNode;
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
}