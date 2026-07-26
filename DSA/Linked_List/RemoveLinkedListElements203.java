package DSA.Linked_List;

public class RemoveLinkedListElements203{
     public ListNode removeElements(ListNode head, int value) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(curr != null && curr.value == value){
            //    int value = curr.value;
               while(curr != null && curr.value == value){
                    curr = curr.next;
               } 
               if(prev != null){
                    prev.next = curr;
               }else{
                    head = curr;
               }
            }else{
                prev = curr;
                curr = curr.next;
            }

        }
        return head;
    }
}