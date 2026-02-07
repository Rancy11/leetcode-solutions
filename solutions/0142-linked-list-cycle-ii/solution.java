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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return startpoint(slow, fast, head);
            }
        }
        return null;
    }

    private ListNode startpoint(ListNode slow, ListNode fast, ListNode head){
        slow = head;
        while(slow!= fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
