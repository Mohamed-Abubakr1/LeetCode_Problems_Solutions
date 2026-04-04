/*
 * Using Additional Structure(Array as Example)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public ListNode reverseList(ListNode head) {
    if (head == null) return null;

    ArrayList<ListNode> nodes = new ArrayList<>();

    ListNode curr = head;
    while (curr != null) {
        nodes.add(curr);
        curr = curr.next;
    }

    ListNode ans = new ListNode(-1);
    ListNode last = ans;
    for (int i = nodes.size() - 1; i >= 0; i--) {
        last.next = nodes.get(i);
        last = last.next;
    }

    last.next = null;

    return ans.next;
}
