package io.pello.codewars.linkedlist.rotate;

import io.pello.codewars.linkedlist.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.getNext() == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.setNext(head);
        ListNode fast = dummy, slow = dummy;

        int i;
        for (i = 0; fast.getNext() != null; i++)// Get the total length
            fast = fast.getNext();

        for (int j = i - n % i; j > 0; j--) // Get the i-n%i th node
            slow = slow.getNext();

        fast.setNext(dummy.getNext()); // Do the rotation
        dummy.setNext(slow.getNext());
        slow.setNext(null);

        return dummy.getNext();
    }
}
