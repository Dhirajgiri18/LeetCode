/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k < 0) return head;

        ListNode curNode = head;
        int n = 1;

        while(curNode.next != null){
            curNode = curNode.next;
            n++;
        }

        curNode.next = head;

        k = n - (k % n);

        while(k-- > 0) {
            curNode = curNode.next;
        }
        head = curNode.next;
        curNode.next = null;
        return head;
    }
}