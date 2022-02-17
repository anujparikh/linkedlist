package practice.examples;

import org.junit.Test;

public class SwapNodesInPairsTest {
    @Test
    public void vanillaTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{1,2,3,4});
        ListNode result = SwapNodesInPairs.solution(l1);
        ListNode.printListNode(result);
    }

    @Test
    public void emptyInputTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{});
        ListNode result = SwapNodesInPairs.solution(l1);
        ListNode.printListNode(result);
    }

    @Test
    public void oneElementInputTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{1});
        ListNode result = SwapNodesInPairs.solution(l1);
        ListNode.printListNode(result);
    }
}
