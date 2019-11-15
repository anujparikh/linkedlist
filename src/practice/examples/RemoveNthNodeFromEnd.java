package practice.examples;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Example:
 *  Input: 1->2->3->4->5 and n = 2; Output: 1->2->3->5
 * Note: Given n will always be valid.
 */
public class RemoveNthNodeFromEnd {
    public static ListNode solution(ListNode head, int n) {
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        for (int i = 0; i < n; i++) {
            secondPointer = secondPointer.next;
        }
        // if n is equal to length of the linkedlist
        if (secondPointer == null) {
            return head.next;
        }
        while (secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        firstPointer.next = firstPointer.next.next;

        return head;
    }
}
