package practice.examples;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * Example:
 *  Input: 1->2
 *  Output: false
 *
 *  Input: 1->2->2->1
 *  Output: true
 *
 *  Notes: Could you do it in O(n) time and O(1) space?
 */

/**
 * Approach:
 *  - fast and slow pointer for slow pointer to reach till 2nd half start
 *  - reverse 2nd half
 *  - start fast from head and don't change position for slow
 *  - compare till slow is null
 */
public class PalindromeLL {
    public static boolean solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = head;
        slow = PalindromeLL.reverse(slow);

        while(slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
