public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//total distance covered by both is A+B hence they will Intersect at a point that is point of intersection;
        if (headA == null || headB == null) return null;
        ListNode tempA = headA, tempB = headB;
        while (tempA != tempB) {
            tempA = (tempA == null) ? headB : tempA.next;
            tempB = (tempB == null) ? headA : tempB.next;
        }
        return tempA;

    }
}

