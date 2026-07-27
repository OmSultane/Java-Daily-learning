package DSA.Linked_List;

public class SwappingNodesInALinkedList1721{
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;

        for(int i = 1; i < k; i++){
            curr = curr.next;
        }
        ListNode a = curr;
        ListNode b = head;

        while(curr != null && curr.next != null){
            curr = curr.next;
            b = b.next;
        }

        int temp = a.value;
        a.value = b.value;
        b.value = temp;

        return head; 
        
    }
}