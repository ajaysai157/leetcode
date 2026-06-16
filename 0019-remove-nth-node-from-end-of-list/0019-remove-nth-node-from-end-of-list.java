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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode ptr=head;
        ListNode temp=null;
        int len=0;
        while(ptr!=null){
            len++;
            ptr=ptr.next;
        }
        ptr=head;
        if(len==n){
            return ptr.next;
        }
        while(ptr!=null){
            if(len==n){
                break;
            }
            len--;
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        return head;
    }
}