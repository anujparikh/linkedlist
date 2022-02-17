package practice.examples;

public class SwapNodesInPairs {
    public static ListNode solution(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode previous = dummy;
        ListNode current = head;
        while (current != null && current.next != null) {
            // Saving Pointers
            ListNode nextPair = current.next.next;
            ListNode second = current.next;

            // Reverse this Pair
            current.next = nextPair;
            second.next = current;
            previous.next = second;

            // Update Pointers
            previous = current;
            current = nextPair;
        }
        return dummy.next;
    }
}
