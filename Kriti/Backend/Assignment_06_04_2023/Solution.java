package Assignment_06_04_2023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    // }
    public static void main(String[] args) {
        ListNode n = new ListNode(-10);
        insertAtEnd(n, -10);
        insertAtEnd(n, -9);
        insertAtEnd(n, -4);
        insertAtEnd(n, 1);
        insertAtEnd(n, 6);
        insertAtEnd(n, 6);
        printNode(n);
        ListNode m = new ListNode(-7);
        printNode(m);

        PriorityQueue<ListNode> pq = new PriorityQueue<>(6, new listNodeComparator());

        copyItemsToPq(pq, n);
        copyItemsToPq(pq, m);
        System.out.println(pq);

        ListNode parent, tempNode = null, tempNodeIterator;
        parent = pq.poll();
        tempNodeIterator = parent;
        System.out.println("=====");
        while(pq.size()>0){
        tempNode = pq.poll();
        System.out.print(tempNode+"  ");
        tempNodeIterator.next = tempNode;
        tempNodeIterator = tempNodeIterator.next;
        }
        System.out.println();
        for(int i=0;i<10;i++){
            System.out.print(parent + " ");
            parent = parent.next;
        }

        // printNode(parent);

    }

    public static void copyItemsToPq(PriorityQueue<ListNode> pq, ListNode n) {
        ListNode m = n;
        while (m != null) {
            pq.add(m);
            m = m.next;
        }
    }

    public static void insertAtEnd(ListNode node, int num) {
        ListNode n = node;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new ListNode(num);
    }

    public static void printNode(ListNode n) {
        System.out.println();
        // ListNode n = node;
        while (n != null) {
            System.out.print(n + " ");
            n = n.next;
        }
    }

}

class listNodeComparator implements Comparator<ListNode> {

    @Override
    public int compare(ListNode o1, ListNode o2) {
        return o1.val - o2.val;
    }

}
