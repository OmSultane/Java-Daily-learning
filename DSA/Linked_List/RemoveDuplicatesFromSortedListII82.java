package DSA.Linked_List;

class RemoveDuplicatesFromSortedListII82{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            if(curr.next != null && curr.value == curr.next.value){
               int value = curr.value;
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