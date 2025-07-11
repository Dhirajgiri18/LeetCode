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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        int carry = 0;
        ListNode head = null;
        while(l1!=null || l2!=null || carry!=0){
            int val1 = (l1==null)?0:l1.val;
            int val2 = (l2==null)?0:l2.val;
            int value = val1+val2+carry;
            carry = value/10;
            ListNode newNode = new ListNode(value%10);
            if(head==null){
                head = newNode;
                l3 = newNode;
            }else{
                l3.next = newNode;
                l3 = l3.next;
            }
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }       
        return head;
    }
}