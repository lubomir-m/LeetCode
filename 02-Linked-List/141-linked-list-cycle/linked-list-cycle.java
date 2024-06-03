/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            if (head == null) {
                return false;
            }
            ListNode current = head;
            Set<ListNode> nodes = new HashSet<>();
            nodes.add(current);

            while (current.next != null) {
                current = current.next;
                if (nodes.contains(current)) {
                    return true;
                }
                nodes.add(current);
            }

            return false;
        }
}