package practice.examples;

import org.junit.Test;

public class OddEvenLLTest {

    @Test
    public void vanillaTest() {
        ListNode input = ListNode.createLLFromArray(new int[]{1,2,3,4,5,6});
        ListNode result = OddEvenLL.solution(input);
        ListNode.printListNode(result);
    }

    @Test
    public void anotherVanillaTest() {
        ListNode input = ListNode.createLLFromArray(new int[]{1,2,3,4,5,6,7,8,9});
        ListNode result = OddEvenLL.solution(input);
        ListNode.printListNode(result);
    }

    @Test
    public void emptyTest() {
        ListNode input = ListNode.createLLFromArray(new int[]{});
        ListNode result = OddEvenLL.solution(input);
        ListNode.printListNode(result);
    }

    @Test
    public void singleDigitTest() {
        ListNode input = ListNode.createLLFromArray(new int[]{1});
        ListNode result = OddEvenLL.solution(input);
        ListNode.printListNode(result);
    }
}
