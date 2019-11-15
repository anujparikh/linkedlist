package practice.examples;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists
 * Example:
 *  Input: 1->2->4, 1->3->4
 *  Output: 1->1->2->3->4->4
 */
public class Merge2SortedLL {
    public static ListNode solution(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode(-1);
        ListNode previous = tempHead;
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    previous.next = l1;
                    previous = l1;
                    l1 = l1.next;
                } else {
                    previous.next = l2;
                    previous = l2;
                    l2 = l2.next;
                }
            }
            previous.next = l1 == null ? l2 : l1;
            return tempHead.next;
        }
    }
}
