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

    public static ListNode createLLFromArray(int [] nums) {
        ListNode head = new ListNode(-1);
        ListNode ptr = head;
        for (int i = 0; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }
        return ptr.next;
    }
}
