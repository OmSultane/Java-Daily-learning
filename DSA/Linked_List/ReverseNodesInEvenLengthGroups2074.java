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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int gn = 0;
        // This will track the actual number of elements counted in the current group
        int elementsInPreviousGroup = 0; 
        ListNode curr = head;
        
        // Use a dummy node to cleanly handle the previous group tracker from the start
        ListNode dummy = new ListNode(0, head);
        ListNode lastOfPreviousGroup = dummy;

        while (curr != null) {
            gn++;
            
            // 1. Look ahead and count the ACTUAL elements in this group
            elementsInPreviousGroup = 0;
            ListNode walker = curr;
            while (walker != null && elementsInPreviousGroup < gn) {
                elementsInPreviousGroup++;
                walker = walker.next;
            }
            
            // 2. Decide to reverse based on the ACTUAL count, not the group number 'gn'
            if (elementsInPreviousGroup % 2 == 0) {
                // Keep track of the next group's starting head before reversing
                ListNode nextGroupHead = walker;
                
                // curr is currently the head of the group, it will become the last element
                ListNode lastOfEvenGroup = curr; 
                
                // Pass the actual count (elementsInPreviousGroup) instead of gn
                rev(lastOfPreviousGroup, curr, elementsInPreviousGroup);
                
                // Correctly update trackers for the next iteration
                lastOfPreviousGroup = lastOfEvenGroup;
                curr = nextGroupHead;
            } else {
                // If odd, skip the group without reversing and update trackers
                for (int i = 0; i < elementsInPreviousGroup; i++) {
                    lastOfPreviousGroup = curr;
                    curr = curr.next;
                }
            }
        }
        return dummy.next;
    }

    private int rev(ListNode last, ListNode headOfGroup, int n) {
        ListNode prev = null;
        ListNode curr = headOfGroup;
        ListNode next = null;
        int count = 0;
        
        while (curr != null && n > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            n--;
            count++;
        }
        
        // Connect the tail of the reversed group to the head of the next group
        headOfGroup.next = next;
        // Connect the end of the previous group to the new head of this reversed group
        last.next = prev;
        
        return count;
    }
}