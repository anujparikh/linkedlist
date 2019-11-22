package practice.examples;

import org.junit.Test;

public class IntersectionOf2LLTest {

    @Test
    public void vanillaTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{4,1});
        ListNode l2 = ListNode.createLLFromArray(new int[]{5,0,1});
        ListNode linked = ListNode.createLLFromArray(new int[]{8,4,5});
        ListNode l1Ptr = l1;
        ListNode l2Ptr = l2;
        while (l1.next != null) {
            l1 = l1.next;
        }
        l1.next = linked;
        while (l2.next != null) {
            l2 = l2.next;
        }
        l2.next = linked;
        ListNode result = IntersectionOf2LL.solution(l1Ptr, l2Ptr);
        System.out.println(result.val);
    }

    @Test
    public void noIntersectionTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{1,2,3,4});
        ListNode l2 = ListNode.createLLFromArray(new int[]{5,6});
        ListNode result = IntersectionOf2LL.solution(l1, l2);
        System.out.println(result);
    }

    @Test
    public void noIntersectionTest2() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{1,3});
        ListNode l2 = ListNode.createLLFromArray(new int[]{});
        ListNode result = IntersectionOf2LL.solution(l1, l2);
        System.out.println(result);
    }

    @Test
    public void edgeCaseTest() {
        ListNode l1 = ListNode.createLLFromArray(new int[]{});
        ListNode l2 = ListNode.createLLFromArray(new int[]{2});
        ListNode linked = ListNode.createLLFromArray(new int[]{3});
        ListNode l2Ptr = l2;
        while (l2.next != null) {
            l2 = l2.next;
        }
        l2.next = linked;
        ListNode result = IntersectionOf2LL.solution(linked, l2Ptr);
        System.out.println(result.val);
    }
}
