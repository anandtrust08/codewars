package io.pello.codewars.linkedlist.mergelists;

import io.pello.codewars.linkedlist.ListNode;

public class MergeLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) { return list2; }
        if (list2 == null) { return list1; }

        if (list1.getValue() <= list2.getValue()) {
            list1.setNext(mergeTwoLists(list1.getNext(), list2));
            return list1;
        } else {
            list2.setNext(mergeTwoLists(list2.getNext(), list1));
            return list2;
        }
    }
}