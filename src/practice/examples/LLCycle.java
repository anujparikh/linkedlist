package practice.examples;

/**
 * Given a linked list, determine if it has a cycle in it.
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed)
 *  in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list
 * Example:
 *  Input: head = [3,2,0,-4], pos = 1; Output: true
 *  Input: head = [1,2], pos = 0; Output: true
 *  Input: head = [1], pos = -1; Output: false
 */
public class LLCycle {
    public static boolean solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
