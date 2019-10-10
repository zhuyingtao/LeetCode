/**
 * Created by zyt on 15/8/21 15:36.
 */
public class Test019 {
    /**
     * Definition for singly-linked list.
     */
    private class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
        }
    }
    
    private class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null) {
                return null;
            }
            ListNode p = head, q = head;
            for (int i = 0; i < n; i++) {
                q = q.next;
            }
            if (q == null) {
                return head.next;
            }
            while (q.next != null) {
                q = q.next;
                p = p.next;
            }
            p.next = p.next.next;
            return head;
        }
    }
}
