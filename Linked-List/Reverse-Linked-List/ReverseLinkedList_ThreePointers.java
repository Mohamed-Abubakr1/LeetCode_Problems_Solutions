/*
 * Three Pointers Approach
 * Time Complexity: O(n)
 * Space Complexity: O(1)
*/

public ListNode reverseList(ListNode head) {
    if (head == null) return null;

    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode nextTemp = curr.next;

        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }

    return prev;
}
