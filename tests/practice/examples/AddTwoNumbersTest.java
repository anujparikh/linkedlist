package practice.examples;

import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void vanillaTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{2,4,3});
        ListNode l2 = ListNode.createLLFromArray(new int[]{5,6,4});
        ListNode result = AddTwoNumbers.solution(l1, l2);
        ListNode.printListNode(result);
    }

    @Test
    public void emptyTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{});
        ListNode l2 = ListNode.createLLFromArray(new int[]{5,6,4});
        ListNode result = AddTwoNumbers.solution(l1, l2);
        ListNode.printListNode(result);
    }

    @Test
    public void edgeTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{9,9,8});
        ListNode l2 = ListNode.createLLFromArray(new int[]{9,9,8});
        ListNode result = AddTwoNumbers.solution(l1, l2);
        ListNode.printListNode(result);
    }

    @Test
    public void edgeTest2() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{9,9,9});
        ListNode l2 = ListNode.createLLFromArray(new int[]{9,9,9});
        ListNode result = AddTwoNumbers.solution(l1, l2);
        ListNode.printListNode(result);
    }

    @Test
    public void edgeTest3() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{0});
        ListNode l2 = ListNode.createLLFromArray(new int[]{7,3});
        ListNode result = AddTwoNumbers.solution(l1, l2);
        ListNode.printListNode(result);
    }

    @Test
    public void edgeTest4() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{5});
        ListNode l2 = ListNode.createLLFromArray(new int[]{5});
        ListNode result = AddTwoNumbers.solution(l1, l2);
        ListNode.printListNode(result);
    }
}
