package practice.examples;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Approach 1: Brute Force
 *  For each node a in list A, traverse the entire list B and check if any node in list B coincides with a
 * Approach 2: Hash Set
 *  Iterate on the first LL and store the address of each node in the set, after iterate through 2nd LL
 *  and check if the address is present in Set. If yes, thats the intersection
 * Approach 3: Two pointers (Below method)
 */
public class IntersectionOf2LL {
    public static ListNode solution(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (headA != headB) {
            if (headA == null) {
                headA = p2;
            } else {
                headA = headA.next;
            }
            if (headB == null) {
                headB = p1;
            } else {
                headB = headB.next;
            }
        }
        return headA;
    }
}
