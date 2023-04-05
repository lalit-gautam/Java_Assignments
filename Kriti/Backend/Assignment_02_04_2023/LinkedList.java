package Assignment_02_04_2023;


public class LinkedList {
    Node head;
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(0);
        list.insert(2);
        list.insert(0);
        list.insert(2);
        list.insert(0);
        list.insert(2);
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteFirst();
        list.printList();
        

    }


    public void deleteFirst(){
        head = head.next;
    }


    public void insert(int num){
        if(head == null){
            head = new Node(num);
            return;
        }
        Node tempHead = head;
        while(tempHead.next != null){
            tempHead = tempHead.next;
        }
        tempHead.next = new Node(num);
    }
    public void printList(){
        System.out.println();
        Node tempHead = head;
        while(tempHead != null){
            System.out.print(tempHead + "  ");
            tempHead = tempHead.next;
        }
        // System.out.println(tempHead.number);
    }

    public void deleteLast(){
        Node tempHead = head;

        while(tempHead.next.next != null){
            tempHead = tempHead.next;
        }
        tempHead.next = null;
    }
}

class Node{
    int number;
    Node next;
    Node(int num){
        number = num;
        next = null;
    }
    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
