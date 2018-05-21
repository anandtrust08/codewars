package io.pello.codewars.linkedlist.removednth;

public class ListNode {
    private int value;
    private ListNode next;

    ListNode(int v) {
        value = v;
    }
    ListNode(int v, ListNode next) {
        value = v;
        this.next = next;
    }
    
    
    
    public int getValue() {
        return value;
    }
    public ListNode getNext() {
        return next;
    }
    
    
    public void setNext(ListNode next) {
        this.next = next;
    }
    
    public String toString () {
        String result = "";
        ListNode tmp = this;
        
        while(tmp.next != null) {
            result += tmp.value+"->";
            tmp = tmp.next;
        }
        
        result += tmp.value;
        
        return result.toString();
    }
}
