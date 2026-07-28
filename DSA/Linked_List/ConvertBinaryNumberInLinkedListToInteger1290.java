package DSA.Linked_List;

public class ConvertBinaryNumberInLinkedListToInteger1290{
    public int getDecimalValue(ListNode head) {
        int res = 0;

        while(head != null){
            res = res * 2 + head.value; 
            head = head.next;
        }
        return res;
    }
}