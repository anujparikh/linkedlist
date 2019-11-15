package practice.examples;

/**
 * Reverse a singly linked list.
 * Example:
 *  Input: 1->2->3->4->5->NULL
 *  Output: 5->4->3->2->1->NULL
 */
public class ReverseLL {
    public static ListNode solution(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode previous = null;
        ListNode next;
        ListNode current = head;
        while(current.next != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        current.next = previous;
        return current;
    }
}
