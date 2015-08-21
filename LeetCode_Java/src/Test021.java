/**
 * Created by zyt on 15/8/20 18:00.
 */
public class Test021 {

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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode p = head;

            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    p.next = l1;
                    l1 = l1.next;
                } else {
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next;
            }
            // it is not necessary to continue the while cycle,just change the pointer;
            if (l1 != null) p.next = l1;
            if (l2 != null) p.next = l2;

            return head.next;
        }
    }
}
