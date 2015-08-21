/**
 * Created by zyt on 15/8/20 13:56.
 */
public class Test206 {

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
        public ListNode reverseList(ListNode head) {
            ListNode node = head;
            ListNode pre = null;
            ListNode revHead = null;
            while (node != null) {
                ListNode next = node.next;
                if (next == null) revHead = node;
                node.next = pre;
                pre = node;
                node = next;
            }
            return revHead;
        }

        public ListNode reverseList2(ListNode head) {
            ListNode newHead = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = newHead;
                newHead = head;
                head = next;
            }
            return newHead;
        }

        public ListNode reverseList3(ListNode head) {
            return this.reverseList(head, null);
        }

        public ListNode reverseList(ListNode head, ListNode newHead) {
            if (head == null) {
                return newHead;
            }
            ListNode node = head.next;
            head.next = newHead;
            newHead = head;
            head = node;
            return this.reverseList(head, newHead);
        }
    }
}
