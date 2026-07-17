//This file is to provide an Definition for ListNode for other files 
package DSA.Linked_List;

class ListNode {
    int val;
    ListNode next;

    
    ListNode() {}

    
    ListNode(int val) {
        this.val = val;
    }

    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
