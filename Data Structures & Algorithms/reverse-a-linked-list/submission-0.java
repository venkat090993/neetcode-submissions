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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        // iterate and push all elements into stack
        ListNode currentNode = head;
        while(currentNode != null){
            stack.push(currentNode);
            currentNode = currentNode.next;
        }

        ListNode newHead = null;
        if(!stack.empty()){
            newHead = stack.pop();
            ListNode current = newHead;
            while(!stack.empty()){
               ListNode popped = stack.pop();
               current.next = popped;
               current = popped;
            }
            current.next = null;
        }

        return newHead;
    }
}
