package JavaDSAday2;

public class CircularLinkedList {

    private Node tail;

    public CircularLinkedList() {
        this.tail = null;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node tail) {
        this.tail = tail;
    }

    public boolean insertAtBeg(int value) {
        Node nn = new Node(value);
        if (tail == null) {
            tail=nn;
            return true;
        }
        if(tail !=null) {
            tail.setNext(nn);
            nn.setNext(tail.getNext());
            tail.setNext(nn);
        }
        return true;
    }
    
    public void display() {
        Node temp = tail.getNext();
        System.out.println("Circular List:");
        while(tail != tail.getNext()) {
            System.out.print("\t" + temp.getData());
            temp = temp.getNext();
        }
    }

}