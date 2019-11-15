package practice.examples;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node
 * Example:
 *      Input: head = [4, 5, 1, 9], node = 5; Output: [4, 1, 9]
 * Notes:
 *  The linked list will have at least two elements.
 *  All of the nodes' values will be unique.
 *  The given node will not be the tail and it will always be a valid node of the linked list.
 *  Do not return anything from your function.
 */
public class DeleteNode {
    public static void solution(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
