package practice.examples;

public class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static void printListNode(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            System.out.print(" => ");
            head = head.next;
        }
    }
}
