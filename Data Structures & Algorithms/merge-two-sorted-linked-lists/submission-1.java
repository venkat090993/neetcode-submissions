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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        ListNode result = null;
        ListNode h1 = list1;
        ListNode h2 = list2;

        if(h1.val <= h2.val){
            result = h1;
            h1 = h1.next;
        }else{
            result = h2;
            h2 = h2.next;
        }

        ListNode curr = result;

        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){
                curr.next = h1;
                h1 = h1.next;
            }else{
                curr.next = h2;
                h2 = h2.next;
            }
            curr = curr.next;
        }

        if(h1 != null){
            curr.next = h1;
        }

        if(h2 != null){
            curr.next = h2;
        }

        return result;
        
    }
}