package DSA.Linked_List;

public class RemoveDuplicatesFromSortedList83{
    public ListNode deleteDuplicates(ListNode head){
        
        ListNode curr = head;

        while(curr != null && curr.next != null){
            if(curr.value == curr.next.value){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }

        return head;
    }
}