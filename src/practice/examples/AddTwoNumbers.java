package practice.examples;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * Example:
 *  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  Output: 7 -> 0 -> 8
 *  Explanation: 342 + 465 = 807
 */
public class AddTwoNumbers {
    public static ListNode solution(ListNode l1, ListNode l2) {
        boolean addOne = false;
        ListNode result = new ListNode(-1);
        ListNode ptr = result;
        while (l1 != null || l2 != null) {
            int sum = addOne ? 1 : 0;
            sum += (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            addOne = sum > 9;
            sum = sum % 10;
            result.next = new ListNode(sum);
            result = result.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (addOne) {
            result.next = new ListNode(1);
        }
        return ptr.next;
    }
}
