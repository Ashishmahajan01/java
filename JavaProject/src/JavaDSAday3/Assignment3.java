package JavaDSAday3;

//3. How do you find the length of a singly linked list?

public class Assignment3 {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    private void length() {
        Node temp = head;
        Node half = head;
        int count = 1;
        while (temp.next.next != null) {
            if (temp.next != null) {
                temp = temp.next.next;
                half = half.next;
                count += 2;
            }
        }
        if (temp.next != null) {
            count++;
            //half = half.next;
        }
        System.out.println(half.data);
        System.out.println("Length of Linked list is: " + count);

        // 5. How do you find the middle element of a singly linked list in one pass?

    }

    public static void main(String[] args) {
        Assignment3 llist = new Assignment3();

        llist.head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        llist.head.next = a;
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        llist.printList();
        llist.length();
    }

}
