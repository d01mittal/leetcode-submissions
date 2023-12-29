/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node iter=head;
        while(iter!=null){
            Node newNode=new Node(iter.val);
            newNode.next=iter.next;
            iter.next=newNode;
            iter=iter.next.next;
        }
        iter=head;
        while(iter!=null){
            if(iter.random!=null)
            iter.next.random=iter.random.next;
            iter=iter.next.next;
        }
        Node dummy=new Node(0);
        Node temp=dummy;
        iter=head;
        while(iter!=null){
            temp.next=iter.next;
            temp=temp.next;
            iter.next=temp.next;
            iter=iter.next;
        }
        return dummy.next;
    }
}