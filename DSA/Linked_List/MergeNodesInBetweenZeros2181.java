package DSA.Linked_List;

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
    public ListNode mergeNodes(ListNode head) {
        ListNode originalHead = head;
        ListNode curr = head.next;
        int s = 0;
        while(curr != null){
            if(curr.value == 0){
                head.value = s;
                s = 0;
                
                if(curr.next != null){
                    head = head.next;
                }
            }
            s += curr.value;
            curr = curr.next;
        }

        head.next = null;
        return originalHead;
    }
}