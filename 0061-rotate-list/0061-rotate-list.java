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
        if(head==null ||k==0||head.next==null) return head;

        //count the no of nodes
        int count=1;
        ListNode tail=head;
        while(tail.next !=null){
            tail = tail.next;
            count++;
        }
        //normalize k
        k=k%count;
        if(k == 0) return head;

        //make it circular
        tail.next = head;

        ListNode newTail = head;

        for(int i = 1;i<count -k;i++){
            newTail = newTail.next;
        }

        //Set new head and break the circle
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}